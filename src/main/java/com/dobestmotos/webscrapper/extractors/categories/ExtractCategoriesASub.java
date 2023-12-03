package com.dobestmotos.webscrapper.extractors.categories;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.logging.Logger;

import com.dobestmotos.database.models.Categoria;
import com.dobestmotos.database.models.Subcategoria;
import com.dobestmotos.utils.Constants;

public class ExtractCategoriesASub {

	private static final Logger logger = Logger.getLogger(Constants.LOG_FILE_PATH);

	public ResultExtractCategoriesASubModel extract(final String html) {
		logger.info("Iniciando extracción de categorías y subcategorías...");

		// Parsear el HTML con JSoup
		Document document = Jsoup.parse(html);

		// Seleccionar todos los elementos li con clase zoo-filter-item
		Elements categories = document.select("li.zoo-filter-item.normal.zoo-filter-has-child");

		final ResultExtractCategoriesASubModel resultExtractCategoriesASubModel = new ResultExtractCategoriesASubModel();

		// Iterar sobre las categorías
		for (Element category : categories) {

			// Obtener el valor y el texto del input y su etiqueta asociada (label)
			String codigoCategoria = category.select("input").attr("value");
			String nombreCategoria = category.select("label").text().trim();

			final Categoria categoria = new Categoria();
			categoria.setCodigo(codigoCategoria);
			categoria.setNombre(nombreCategoria);

			resultExtractCategoriesASubModel.getCategorias().add(categoria);

			// Utilizar el logger para registrar información
			logger.info("Categoría - Código: " + codigoCategoria + ", Nombre: " + nombreCategoria);

			// Si hay subcategorías (elementos li secundarios), obtener también sus datos
			Elements subcategories = category.select("ul.zoo-wrap-child-item li.zoo-filter-item");
			for (Element subcategoryElement : subcategories) {

				String codigoSub = subcategoryElement.select("input").attr("value");
				String nombreSub = subcategoryElement.select("label").text().trim();

				// Utilizar el logger para registrar información de subcategorías
				logger.info("Subcategoría - Código: " + codigoSub + ", Nombre: " + nombreSub);

				final Subcategoria subcategoria = new Subcategoria();
				subcategoria.setCodigoCategoria(codigoCategoria);
				subcategoria.setCodigo(codigoSub);
				subcategoria.setNombre(nombreSub);

				resultExtractCategoriesASubModel.getSubcategorias().add(subcategoria);
			}
		}

		logger.info(
				"Extracción completada. Total categorías: " + resultExtractCategoriesASubModel.getCategorias().size()
						+ ", Total subcategorías: " + resultExtractCategoriesASubModel.getSubcategorias().size());

		return resultExtractCategoriesASubModel;
	}
}
