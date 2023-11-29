package com.dobestmotos.webscrapper.iterators;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.dobestmotos.database.daos.PaginacionProductoXCategoriaDAO;

public class MasterProductModelsIteratorTest {

	@Test
    public void iterateTest() throws IOException {
		
		final MasterProductModelsIterator masterIterator = new MasterProductModelsIterator();
		masterIterator.iterate();
		
		final PaginacionProductoXCategoriaDAO paginacionProductoXCategoriaDAO = new PaginacionProductoXCategoriaDAO();
		assertTrue(paginacionProductoXCategoriaDAO.getRegistrosConHtmlNulo().isEmpty());
	}
}
