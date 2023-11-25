package com.dobestmotos.webscrapper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ProductDescriptionExtractor {

	public  String extractProductDescription(String html) {
		Document doc = Jsoup.parse(html);
		Element titleElement = doc.selectFirst("h1.product_title.entry-title");
		if (titleElement != null) {
			return titleElement.text();
		} else {
			return "Descripción no encontrada";
		}
	}
}
