package com.dobestmotos.webscrapper.extractors.product;

import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;

public class RulesForReturnAndExchangeExtractor {

	private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

	public String parse(String html) {
		
		try {
			
			logger.info("Iniciando el proceso de extracción de reglas de retorno y cambio.");

			Document doc = Jsoup.parse(html);

	        // Selecciona el elemento que contiene el texto que quieres obtener
	        Element section = doc.select("section.qfy-row-8-656d95b4bc846560083").first();

	        // Selecciona todos los elementos de texto dentro del elemento section
	        Elements textElements = section.select("div.qfe_text_column");

	        // Construye el resultado concatenando el texto de cada elemento
	        StringBuilder result = new StringBuilder();
	        for (Element textElement : textElements) {
	            result.append(textElement.text()).append("\n");
	        }	        

			logger.info("Extracción de reglas de retorno y cambio exitosa.");
			logger.info("result: " + result.toString());
			
			return result.toString();
			
		} catch (Exception e) {
			logger.severe("Error al extraer las reglas de retorno y cambio: " + e.getMessage());
			e.printStackTrace();
			return null;
		}
	}
}
