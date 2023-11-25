package com.dobestmotos.webscrapper;

import java.io.IOException;
import java.util.List;

public class MasterProductExtractor {

	public ProductModelExtractor getProduct(final String url) throws IOException {

		final String html = new ObtieneHtml().obtenerHTML(url);
		final GetProductCode getProductCode = new GetProductCode();
		final String productCode = getProductCode.obtieneCodigo(url);

		final ProductDescriptionExtractor productDescriptionExtractor = new ProductDescriptionExtractor();
		final String productDescription = productDescriptionExtractor.extractProductDescription(html);

		final ProductPriceExtractor productPriceExtractor = new ProductPriceExtractor();
		final double price = productPriceExtractor.extractProductPrice(html);

		final ObtenerColores obtenerColores = new ObtenerColores();
		final List<String> colores = obtenerColores.obtenerColores(html);

		final ImageUrlExtractor imageUrlExtractor = new ImageUrlExtractor();
		final String imagen = imageUrlExtractor.extractImageUrl(html);

		final ImageExtractor imageExtractor = new ImageExtractor();
		final List<String> imagenes = imageExtractor.obtenerImagenes(html);
		
		final ProductModelExtractor productModelExtractor = new ProductModelExtractor();
		productModelExtractor.setCodigoProducto(productCode);
		productModelExtractor.setDescripcion(productDescription);
		productModelExtractor.setPrecio(price);
		productModelExtractor.setColores(colores);
		productModelExtractor.setImagen(imagen);
		productModelExtractor.setImagenes(imagenes);
		
		return productModelExtractor;
	}

}
