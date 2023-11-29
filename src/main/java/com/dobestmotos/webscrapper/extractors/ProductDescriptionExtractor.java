package com.dobestmotos.webscrapper.extractors;

import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;

public class ProductDescriptionExtractor {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public String extractProductDescription(String html) {
        logger.info("Extrayendo descripción del producto desde el HTML.");

        Document doc = Jsoup.parse(html);
        Element titleElement = doc.selectFirst("h1.product_title.entry-title");

        if (titleElement != null) {
            String productDescription = titleElement.text();
            logger.info("Descripción del producto extraída exitosamente: " + productDescription);
            return productDescription;
        } else {
            logger.warning("No se encontró el elemento 'h1.product_title.entry-title' en el HTML.");
            return "Descripción no encontrada";
        }
    }
}
