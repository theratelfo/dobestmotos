package com.dobestmotos.webscrapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.dobestmotos.database.daos.CategoriaDAO;
import com.dobestmotos.database.models.Categoria;

public class IteradorCategoriasModels {

	public HashMap<String, List<String>> itera() throws IOException {

		final CategoriaDAO categoriaDAO = new CategoriaDAO();
		final List<Categoria> categorias = categoriaDAO.getAll();

		final IteradorCategorias iterador = new IteradorCategorias();
		final HashMap<String, List<String>> resultados = iterador.iteraCategorias(categorias);

		return resultados;
	}

}
