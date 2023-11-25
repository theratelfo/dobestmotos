package com.dobestmotos.webscrapper;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ImageExtractor {
	public List<String> obtenerImagenes(String html) {
		List<String> imagenes = new ArrayList<>();
		Document doc = Jsoup.parse(html);
		Element thumbnails = doc.selectFirst("div.thumbnails");
		Elements elementos = thumbnails.select("a[src-img]");
		for (Element elemento : elementos) {
			String imagen = elemento.attr("src-img");
			imagenes.add(imagen);
		}
		return imagenes;
	}
}