package com.dobestmotos.webscrapper.extractors.product;

import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;

public class Div1Extractor {

	private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

	public String extract(String html) {

		Document doc = Jsoup.parse(html);

        // Selecciona el primer div con la clase "qfy-auto-content"
        Element outerDiv = doc.selectFirst("div.qfy-auto-content");

        // Verifica que el div externo se haya encontrado
        if (outerDiv != null) {
            // Dentro del div externo, selecciona el div con la clase "detailmodule_html"
            Element innerDiv = outerDiv.selectFirst("div.detailmodule_html");

            // Verifica que el div interno se haya encontrado
            if (innerDiv != null) {
                // Devuelve el HTML dentro del div interno
                return innerDiv.html();
            } else {
                return "No se encontró el div interno.";
            }
        } else {
            return "No se encontró el div externo.";
        }
	}
}
