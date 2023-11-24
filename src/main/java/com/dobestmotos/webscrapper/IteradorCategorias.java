package com.dobestmotos.webscrapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.dobestmotos.database.models.Categoria;

public class IteradorCategorias {

	public HashMap<String, List<String>> iteraCategorias(final List<Categoria> categorias) throws IOException {

		final HashMap<String, List<String>> resultados = new HashMap<>();

		for (Categoria categoria : categorias) {
			System.out.println(categoria.getCodigo());
			ParserPaginasProductos parser = new ParserPaginasProductos();
			final List<String> urls = parser.getUrlProducts(categoria.getCodigo());
			System.out.println(urls.size());
			resultados.put(categoria.getCodigo(), urls);
		}

		return resultados;

	}

}
