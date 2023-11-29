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

public class ObtenerColoresExtractor {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public List<String> obtenerColores(String html) {
        logger.info("Obteniendo colores desde el HTML.");

        List<String> colores = new ArrayList<>();
        Document doc = Jsoup.parse(html);
        Element select = doc.selectFirst("select#color");

        if (select != null) {
            Elements opciones = select.select("option[value]:not([value=''])");

            for (Element opcion : opciones) {
                String color = opcion.attr("value");
                colores.add(color);
                logger.info("Color añadido a la lista: " + color);
            }

            logger.info("Lista de colores obtenida exitosamente.");
        } else {
            logger.warning("No se encontró el elemento 'select#color' en el HTML.");
        }

        return colores;
    }
}
