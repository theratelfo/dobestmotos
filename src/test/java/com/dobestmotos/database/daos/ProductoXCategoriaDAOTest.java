package com.dobestmotos.database.daos;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dobestmotos.database.models.PaginacionProductoXCategoria;

public class ProductoXCategoriaDAOTest {

	@Test
	public void gettAll() {

		// Inserta un producto en la base de datos
		PaginacionProductoXCategoria productoXCategoria = new PaginacionProductoXCategoria();

		productoXCategoria.setCodigoCategoria("bmw-brake-guard-with-installation-kit");
		productoXCategoria.setUrlPaginacionProducto("https://www.dobestmoto.com/?product_cat=accessories&&paged=2&qfyuuid=products_list_f6uyq-c-oo");

		PaginacionProductoXCategoriaDAO productoXCategoriaDAO = new PaginacionProductoXCategoriaDAO();

		productoXCategoriaDAO.insert(productoXCategoria);
		assertTrue(!new PaginacionProductoXCategoriaDAO().getAll().isEmpty());

	}
}
