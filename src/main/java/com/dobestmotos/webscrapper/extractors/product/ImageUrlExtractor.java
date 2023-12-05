package com.dobestmotos.webscrapper.extractors.product;

import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;

public class ImageUrlExtractor {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public String extractImageUrl(String html) {
        logger.info("Extrayendo URL de la imagen desde el HTML.");

        Document doc = Jsoup.parse(html);
        Element imgElement = doc.selectFirst("img.attachment-shop_single.qf-post-image.ag_image");

        if (imgElement != null) {
            String imageUrl = imgElement.attr("src");
            logger.info("URL de la imagen extraída exitosamente: " + imageUrl);
            return imageUrl;
        } else {
            logger.warning("No se encontró el elemento 'img.attachment-shop_single.qf-post-image.ag_image' en el HTML.");
            return "URL de la imagen no encontrada";
        }
    }
}
