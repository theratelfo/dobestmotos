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

public class ImageExtractor {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public List<String> obtenerImagenes(String html) {
        logger.info("Obteniendo imágenes desde el HTML.");

        List<String> imagenes = new ArrayList<>();
        Document doc = Jsoup.parse(html);
        Element thumbnails = doc.selectFirst("div.thumbnails");
        
        if (thumbnails != null) {
            Elements elementos = thumbnails.select("a[src-img]");

            for (Element elemento : elementos) {
                String imagen = elemento.attr("src-img");
                imagenes.add(imagen);
                logger.info("Imagen añadida a la lista: " + imagen);
            }

            logger.info("Lista de imágenes obtenida exitosamente.");
        } else {
            logger.warning("No se encontró el elemento 'div.thumbnails' en el HTML.");
        }

        return imagenes;
    }
}