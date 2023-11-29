package com.dobestmotos.webscrapper.extractors;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;

public class HrefListExtractor {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public List<String> getList(final String html) {
        logger.info("Obteniendo lista de enlaces desde el HTML.");

        List<String> hrefList = new ArrayList<>();
        Document doc = Jsoup.parse(html);
        Elements links = doc.select("a[href]");

        for (Element link : links) {
            if (link.hasClass("product_a pitem")) {
                String href = link.attr("href");
                hrefList.add(href);
                logger.info("Enlace añadido a la lista: " + href);
            }
        }

        logger.info("Lista de enlaces obtenida exitosamente.");
        return hrefList;
    }
}