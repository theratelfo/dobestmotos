package com.dobestmotos.webscrapper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ProductPriceExtractor {

	public Double extractProductPrice(String html) {

		Document doc = Jsoup.parse(html);
		Element priceElement = doc.selectFirst("meta[itemprop=\"price\"]");
		if (priceElement != null) {
			String priceText = priceElement.attr("content");
			double price = Double.parseDouble(priceText);
			return price;
		} else {
			return null;
		}

	}

}
