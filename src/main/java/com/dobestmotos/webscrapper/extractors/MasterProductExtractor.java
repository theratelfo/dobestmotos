package com.dobestmotos.webscrapper.extractors;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;
import com.dobestmotos.webscrapper.extractors.product.Div1Extractor;
import com.dobestmotos.webscrapper.extractors.product.GetProductCodeExtractor;
import com.dobestmotos.webscrapper.extractors.product.ImageExtractor;
import com.dobestmotos.webscrapper.extractors.product.ImageUrlExtractor;
import com.dobestmotos.webscrapper.extractors.product.ObtenerColoresExtractor;
import com.dobestmotos.webscrapper.extractors.product.ProductDescriptionExtractor;
import com.dobestmotos.webscrapper.extractors.product.ProductPriceExtractor;
import com.dobestmotos.webscrapper.models.ProductModelExtractor;
import com.dobestmotos.webscrapper.utils.ObtieneHtml;

public class MasterProductExtractor {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public ProductModelExtractor getProduct(final String url) throws IOException {
    	
        logger.info("Iniciando extracción de información del producto desde la URL: " + url);

        final ObtieneHtml obtieneHtml = new ObtieneHtml();
        final String html = obtieneHtml.obtenerHTML(url);

        final GetProductCodeExtractor getProductCode = new GetProductCodeExtractor();
        final String productCode = getProductCode.obtieneCodigo(url);
        logger.info("Código del producto: " + productCode);

        final ProductDescriptionExtractor productDescriptionExtractor = new ProductDescriptionExtractor();
        final String productDescription = productDescriptionExtractor.extractProductDescription(html);
        logger.info("Descripción del producto: " + productDescription);

        final ProductPriceExtractor productPriceExtractor = new ProductPriceExtractor();
        final double price = productPriceExtractor.extractProductPrice(html);
        logger.info("Precio del producto: " + price);

        final ObtenerColoresExtractor obtenerColores = new ObtenerColoresExtractor();
        final List<String> colores = obtenerColores.obtenerColores(html);
        logger.info("Colores disponibles: " + colores);

        final ImageUrlExtractor imageUrlExtractor = new ImageUrlExtractor();
        final String imagen = imageUrlExtractor.extractImageUrl(html);
        logger.info("URL de la imagen principal: " + imagen);

        final ImageExtractor imageExtractor = new ImageExtractor();
        final List<String> imagenes = imageExtractor.obtenerImagenes(html);
        logger.info("Lista de URLs de imágenes adicionales: " + imagenes);
        
        final Div1Extractor div1Extractor = new Div1Extractor();
        final String div1 = div1Extractor.extract(html);
        logger.info("Div1 extraído: " + div1);

        final ProductModelExtractor productModelExtractor = new ProductModelExtractor();
        productModelExtractor.setCodigoProducto(productCode);
        productModelExtractor.setDescripcion(productDescription);
        productModelExtractor.setPrecio(price);
        productModelExtractor.setColores(colores);
        productModelExtractor.setDiv1(div1);
        productModelExtractor.setImagen(imagen);
        productModelExtractor.setImagenes(imagenes);

        logger.info("Extracción de información del producto completada exitosamente.");
        return productModelExtractor;
    }
}
