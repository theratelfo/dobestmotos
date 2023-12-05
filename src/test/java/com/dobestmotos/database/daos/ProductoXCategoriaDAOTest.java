package com.dobestmotos.database.daos;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dobestmotos.database.models.ProductoXSubcategoria;

public class ProductoXCategoriaDAOTest {

	@Test
	public void gettAll() {

		// Inserta un producto en la base de datos
		ProductoXSubcategoria productoXSubcategoria = new ProductoXSubcategoria();
		productoXSubcategoria.setCodigoProducto("codigo_producto_test");
		productoXSubcategoria.setCodigoSubcategoria("codigo_subcategoria_test");

		ProductoXSubcategoriaDAO productoXSubcategoriaDAO = new ProductoXSubcategoriaDAO();

		productoXSubcategoriaDAO.insert(productoXSubcategoria);
		assertTrue(!new ProductoXSubcategoriaDAO().getAll().isEmpty());

	}
}
