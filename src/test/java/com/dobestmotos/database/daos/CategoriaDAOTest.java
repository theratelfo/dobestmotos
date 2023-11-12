package com.dobestmotos.database.daos;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dobestmotos.database.models.Categoria;

public class CategoriaDAOTest {
	
	@Test
	public void getAll() {
		
		Categoria categoria = new Categoria();
		categoria.setCodigo("123");
		categoria.setNombre("nombre");
		
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		categoriaDAO.insert(categoria);
		
		assertTrue(categoriaDAO.getAll().size()>0);
		
	}
	
}
