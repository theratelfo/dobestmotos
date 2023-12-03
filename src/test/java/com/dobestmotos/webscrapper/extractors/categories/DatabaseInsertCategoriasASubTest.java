package com.dobestmotos.webscrapper.extractors.categories;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.dobestmotos.database.daos.CategoriaDAO;
import com.dobestmotos.database.daos.SubcategoriaDAO;

public class DatabaseInsertCategoriasASubTest {

	@Test
	public void extractTest() {
		
		final DatabaseInsertCategoriasASub databaseInsertCategoriasASub = new DatabaseInsertCategoriasASub();
		databaseInsertCategoriasASub.insertData();
		
		final CategoriaDAO categoriaDAO = new CategoriaDAO();		
		final SubcategoriaDAO subcategoriaDAO = new SubcategoriaDAO();
		
		assertTrue(categoriaDAO.getAll().size()>0);
		assertTrue(subcategoriaDAO.getAll().size()>0);		
	}
}
