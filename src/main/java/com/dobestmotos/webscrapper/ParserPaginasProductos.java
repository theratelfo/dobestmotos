package com.dobestmotos.webscrapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;
import com.dobestmotos.webscrapper.utils.ObtieneHtml;

public class ParserPaginasProductos {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public List<String> getUrlProducts(final String codigoCategoria) throws IOException {
        logger.info("Iniciando obtención de URLs de productos para la categoría " + codigoCategoria);

        final List<String> urls = new ArrayList<>();

        for (int x = 1; x <= 1000; x++) {
            ObtieneHtml obtieneHtml = new ObtieneHtml();
            final String url = "https://www.dobestmoto.com/?product_cat=" + codigoCategoria + "&&paged=" + x;
            logger.info("Obteniendo HTML desde la URL: " + url);
            final String html = obtieneHtml.obtenerHTML(url);

            if (html.contains("No results found.")) {
                logger.info("No se encontraron más resultados. Terminando la obtención de URLs.");
                break;
            }

            urls.add(url);
            logger.info("URL añadida a la lista: " + url);
        }

        logger.info("Obtención de URLs de productos completada exitosamente.");
        return urls;
    }
}
