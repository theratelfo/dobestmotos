package com.dobestmotos.database.daos;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dobestmotos.database.models.Subcategoria;

public class SubcategoriaDAOTest {
	
	@Test
	public void getAll() {
		
		Subcategoria modelo = new Subcategoria();
		modelo.setCodigo("123");
		modelo.setNombre("nombre");
		
		SubcategoriaDAO modeloDAO = new SubcategoriaDAO();
		modeloDAO.insert(modelo);
		
		assertTrue(!modeloDAO.getAll().isEmpty());
		
	}
	
}
