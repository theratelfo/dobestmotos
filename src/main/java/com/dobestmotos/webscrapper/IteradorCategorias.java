package com.dobestmotos.webscrapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class IteradorCategorias {

	public HashMap<String, List<String>> iteraCategorias(final List<String> codigoCategorias) throws IOException {

		final HashMap<String, List<String>> resultados = new HashMap<>();

		for (String codigoCategoria : codigoCategorias) {
			System.out.println(codigoCategoria);
			ParserPaginasProductos parser = new ParserPaginasProductos();
			final List<String> urls = parser.getUrlProducts(codigoCategoria);
			System.out.println(urls.size());
			resultados.put(codigoCategoria, urls);
		}

		return resultados;

	}

}
