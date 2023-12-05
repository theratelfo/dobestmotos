package com.dobestmotos.webscrapper.iterators;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.dobestmotos.database.daos.SubcategoriaDAO;
import com.dobestmotos.database.models.Subcategoria;
import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;
import com.dobestmotos.webscrapper.extractors.HrefListExtractor;
import com.dobestmotos.webscrapper.extractors.MasterProductExtractor;
import com.dobestmotos.webscrapper.extractors.product.GetProductCodeExtractor;
import com.dobestmotos.webscrapper.models.ProductModelExtractor;
import com.dobestmotos.webscrapper.utils.ObtieneHtml;

public class FinalMasterIterator {

	private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

	private String codigoSubcategoria;
	private String codigoProducto;

	private List<Subcategoria> subcategorias;
	
	private List<ProductModelExtractor> productModels = new ArrayList<>();

	private boolean completed;

	private Exception exceptionSubcategoria;
	private Exception exceptionProducto;

	public void iterate() throws IOException {

		logger.info("Iniciando iteración en " + FinalMasterIterator.class.getSimpleName());		

		final SubcategoriaDAO subcategoriaDAO = new SubcategoriaDAO();
		if(subcategorias==null) {
			logger.info("Obteniendo todas las subcategorías para iterar...");
			subcategorias = subcategoriaDAO.getAll();
		} else {
			logger.info("Todas las subcategorías ya estaban en cache");
		}

		logger.info("Subcategorias obtenidas con éxito :)");

		logger.info("Iterando las subcategorías ...");		

		for (Subcategoria subcategoria : subcategorias) {

			logger.info("Procesamiento subcategoria: " + subcategoria.getCodigo());

			if (exceptionSubcategoria != null) {
				logger.info("Hubo excepción previa para la subcategoría :(");
				if (subcategoria.getCodigo().compareTo(codigoSubcategoria) != 0) {
					logger.info("La subcategoria " + subcategoria.getCodigo()
							+ " no es igual a la subcategoria en cache " + codigoSubcategoria + " continuando ...");
					exceptionSubcategoria = null;
					continue;
				}
			} else {
				logger.info("No hubo excepción previa para la subcategoría :)");
			}

			logger.info("Continuando el procesamiento de la subcategoria");

			final String url = "https://www.dobestmoto.com/?product_cat=" + subcategoria.getCodigo();

			logger.info("url de la subcategoria: " + url);

			logger.info("Obteniendo el html de la subcategoria ...");

			final ObtieneHtml obtieneHtml = new ObtieneHtml();
			String html = null;
			try {
				html = obtieneHtml.obtenerHTML(url);
			} catch (IOException e) {
				exceptionSubcategoria = e;
				procesaException(e, "Excepción encontrada al intentar obtener el html de la subcategoría");
				throw e;
			}

			logger.info("Html obtenido :)");
			logger.info("html:");
			logger.info(html);

			// Cache
			codigoSubcategoria = subcategoria.getCodigo();

			logger.info(
					"Obteniendo la lista de url de cada uno de los productos desde el html para la subcategoria ...");

			final HrefListExtractor hrefListExtractor = new HrefListExtractor();
			final List<String> urlProductFromPaginations = hrefListExtractor.getList(html);

			logger.info("Lista de urls obtenidas :)");
			logger.info(urlProductFromPaginations.toString());

			logger.info("Iterando cada una de las urls de productos obtenidas ...");

			for (String urlProduct : urlProductFromPaginations) {

				logger.info("Obteniendo el código del producto de la url: " + urlProduct);

				final GetProductCodeExtractor getProductCode = new GetProductCodeExtractor();
				final String productCode = getProductCode.obtieneCodigo(urlProduct);

				logger.info("Código del producto obtenido: " + productCode);

				if (exceptionProducto != null) {
					logger.info("Hubo excepción previa");
					if (productCode.compareTo(codigoProducto) != 0) {
						logger.info("El codigo del producto " + productCode
								+ " no es igual al codigo del producto en cache " + codigoProducto
								+ " continuando ...");
						exceptionProducto = null;
						continue;
					}
				} else {
					logger.info("No hay excepción previa para el producto :)");
				}

				logger.info("Continuando procesamiento para producto: " + productCode);

				final MasterProductExtractor masterProductExtractor = new MasterProductExtractor();
				ProductModelExtractor productModelExtractor = null;
				try {
					productModelExtractor = masterProductExtractor.getProduct(urlProduct);
				} catch (IOException e) {
					exceptionProducto = e;
					procesaException(e, "Excepción encontrada al intentar obtener el producto");
					throw e;
				}

				productModelExtractor.setCodigoSubcategoria(subcategoria.getCodigo());

				logger.info("El modelo de producto se pudo obtener con éxito :)");
				logger.info(productModelExtractor.toString());

				productModels.add(productModelExtractor);

				// Cache
				codigoProducto = productModelExtractor.getCodigoProducto();
			}
		}

		logger.info("Procesamiento completado, regresando la lista de resultados :)");
		logger.info("Productos encontrados: " + productModels.size());		

		completed = true;
	}

	private void procesaException(final Exception e, final String message) {

		logger.info("codigoSubcategoria: " + codigoSubcategoria);
		logger.info("codigoProducto: " + codigoProducto);
		
		logger.info(message);		
		e.printStackTrace();
		final int wait = 120000;
		logger.info("Esperando " + wait + " milisegundos para iterar nuevamente y recuperar cache");
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public boolean isCompleted() {
		return completed;
	}

	public List<ProductModelExtractor> getProductModels() {
		return productModels;
	}

}
