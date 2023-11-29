package com.dobestmotos.webscrapper.iterators;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.dobestmotos.database.daos.PaginacionProductoXCategoriaDAO;

public class IteradorDiccionarioCategoriasTest {

	@Test
    public void iterateTest() throws IOException {
		
		final IteradorDiccionarioCategorias iteradorDiccionarioCategorias = new IteradorDiccionarioCategorias();
		iteradorDiccionarioCategorias.iterate();
		
		final PaginacionProductoXCategoriaDAO paginacionProductoXCategoriaDAO = new PaginacionProductoXCategoriaDAO();
		
		assertTrue(paginacionProductoXCategoriaDAO.getAll().size()>0);
	}
}
