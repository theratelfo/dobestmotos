package com.dobestmotos.webscrapper.extractors;

import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;

public class ProductPriceExtractor {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public Double extractProductPrice(String html) {
        logger.info("Extrayendo precio del producto desde el HTML.");

        Document doc = Jsoup.parse(html);
        Element priceElement = doc.selectFirst("meta[itemprop=\"price\"]");

        if (priceElement != null) {
            String priceText = priceElement.attr("content");
            double price = Double.parseDouble(priceText);
            logger.info("Precio del producto extraído exitosamente: " + price);
            return price;
        } else {
            logger.warning("No se encontró el elemento 'meta[itemprop=\"price\"]' en el HTML.");
            return null;
        }
    }
}
