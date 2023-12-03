package com.dobestmotos.webscrapper.extractors.categories;

import java.util.List;
import java.util.logging.Logger;

import com.dobestmotos.database.models.Categoria;
import com.dobestmotos.database.models.Subcategoria;
import com.dobestmotos.utils.Constants;
import com.dobestmotos.database.daos.CategoriaDAO;
import com.dobestmotos.database.daos.SubcategoriaDAO;

public class DatabaseInsertCategoriasASub {

	private static final Logger logger = Logger.getLogger(Constants.LOG_FILE_PATH);

	private CategoriaDAO categoriaDAO;
	private SubcategoriaDAO subcategoriaDAO;

	public DatabaseInsertCategoriasASub() {
		this.categoriaDAO = new CategoriaDAO();
		this.subcategoriaDAO = new SubcategoriaDAO();
	}

	public void insertData() {
		
		logger.info("Iniciando ...");
		
		final ExtractCategoriesASubHtml extractCategoriesASubHtml = new ExtractCategoriesASubHtml();
		final ResultExtractCategoriesASubModel resultExtractCategoriesASubModel = extractCategoriesASubHtml.extract();
		
		logger.info("Iniciando inserción de datos en la base de datos...");
		insertCategorias(resultExtractCategoriesASubModel.getCategorias());
		insertSubcategorias(resultExtractCategoriesASubModel.getSubcategorias());
		logger.info("Inserción de datos completada.");
	}

	private void insertCategorias(List<Categoria> categorias) {
		logger.info("Iniciando inserción de categorías en la base de datos...");
		for (Categoria categoria : categorias) {
			Categoria existingCategoria = categoriaDAO.getByCodigo(categoria.getCodigo());

			if (existingCategoria == null) {
				categoriaDAO.insert(categoria);
				logger.info("Categoría insertada en la base de datos: " + categoria.toString());
			} else {
				logger.info("Categoría ya existente en la base de datos. Código: " + categoria.getCodigo());
				// Puedes manejar esto según tus requisitos (por ejemplo, actualizarla).
			}
		}
		logger.info("Inserción de categorías completada.");
	}

	private void insertSubcategorias(List<Subcategoria> subcategorias) {
		logger.info("Iniciando inserción de subcategorías en la base de datos...");
		for (Subcategoria subcategoria : subcategorias) {
			Subcategoria existingSubcategoria = subcategoriaDAO.getByCodigo(subcategoria.getCodigo());

			if (existingSubcategoria == null) {
				subcategoriaDAO.insert(subcategoria);
				logger.info("Subcategoría insertada en la base de datos: " + subcategoria.toString());
			} else {
				logger.info("Subcategoría ya existente en la base de datos. Código: " + subcategoria.getCodigo());
				// Puedes manejar esto según tus requisitos (por ejemplo, actualizarla).
			}
		}
		logger.info("Inserción de subcategorías completada.");
	}
}
