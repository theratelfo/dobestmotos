package com.dobestmotos.webscrapper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ImageUrlExtractor {

	public String extractImageUrl(String html) {
		Document doc = Jsoup.parse(html);
		Element imgElement = doc.selectFirst("img.attachment-shop_single.qf-post-image.ag_image");
		if (imgElement != null) {
			return imgElement.attr("src");
		} else {
			return "URL de la imagen no encontrada";
		}
	}

}
