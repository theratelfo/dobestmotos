package com.dobestmotos.webscrapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserPaginasProductos {

	public List<String> getUrlProducts(final String codigoCategoria) throws IOException {

		final List<String> urls = new ArrayList<>();
		
		for (int x = 1; x <= 1000; x++) {
			ObtieneHtml obtieneHtml = new ObtieneHtml();
			final String url = "https://www.dobestmoto.com/?product_cat=" + codigoCategoria + "&&paged=" + x;
			System.out.println(url);
			final String html = obtieneHtml.obtenerHTML(url);
			if (html.contains("No results found.")) {
				break;
			}
			urls.add(url);
		}

		return urls;

	}

}
