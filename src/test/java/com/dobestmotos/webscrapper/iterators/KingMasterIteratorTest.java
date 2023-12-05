package com.dobestmotos.webscrapper.iterators;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.dobestmotos.database.daos.ProductoDAO;
import com.dobestmotos.database.daos.ProductoXSubcategoriaDAO;

public class KingMasterIteratorTest {

	@Test
	public void iterateTest() {
		
		final KingMasterIterator kingMasterIterator = new KingMasterIterator();
		kingMasterIterator.iterate();
		
		final ProductoDAO productoDAO = new ProductoDAO();		
		final ProductoXSubcategoriaDAO productoXSubcategoriaDAO = new ProductoXSubcategoriaDAO();
		
		assertTrue(productoDAO.getCount()>0);
		assertTrue(productoXSubcategoriaDAO.getCount()>0);
		
	}
}
