package com.dobestmotos.database.daos;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dobestmotos.database.models.Producto;

public class ProductoDAOTest {

	@Test
	public void gettAll() {

		// Inserta un producto en la base de datos
		Producto producto = new Producto();

		producto.setDescripcion("soy una descripcion");
		producto.setCodigoProducto("test");
		producto.setColores("rojo/negro");
		producto.setImagen("imagen");
		producto.setImagenes("imageses");
		producto.setPrecio(10.10);
		producto.setDiv1("soy un div");
		producto.setSku("");

		ProductoDAO productoDAO = new ProductoDAO();

		productoDAO.insert(producto);
		assertTrue(!new ProductoDAO().getAll().isEmpty());

	}
}
