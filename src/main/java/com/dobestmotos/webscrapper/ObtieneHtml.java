package com.dobestmotos.webscrapper;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ObtieneHtml {


	public static String obtenerHTML(String url) throws IOException {
		Document doc = Jsoup.connect(url).get();
		return doc.html();
	}

}
