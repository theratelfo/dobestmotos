package com.dobestmotos.webscrapper.utils;

import java.io.IOException;
import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;

public class ObtieneHtml {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public String obtenerHTML(String url) throws IOException {
        logger.info("Obteniendo HTML desde la URL: " + url);

        Document doc = Jsoup.connect(url).get();
        String html = doc.html();

        logger.info("HTML obtenido exitosamente.");

        return html;
    }
}
