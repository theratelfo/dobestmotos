package com.dobestmotos.webscrapper.extractors.product;

import java.util.logging.Logger;

import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;

public class GetProductCodeExtractor {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public String obtieneCodigo(final String url) {
        logger.info("Obteniendo código del producto desde la URL: " + url);

        String productCode = "";
        int index = url.indexOf("product=");

        if (index != -1) {
            productCode = url.substring(index + 8);
            logger.info("Código del producto obtenido exitosamente: " + productCode);
        } else {
            logger.warning("No se encontró el parámetro 'product' en la URL: " + url);
        }

        return productCode;
    }
}