package com.dobestmotos.database.daos;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dobestmotos.database.models.Producto;

public class ProductoDAOTest {

    @Test
    public void gettAll() {

        // Inserta un producto en la base de datos
        Producto producto = new Producto();

        producto.setId(1);
        producto.setDescripcion("soy una descripcion");
        producto.setPrecio("soy un precio");
        producto.setEscala("soy una categoria");
        producto.setDiv1("soy un div");
        producto.setDiv2("soy un div");

        ProductoDAO productoDAO = new ProductoDAO();

        productoDAO.insert(producto);
        assertTrue(!ProductoDAO.getAll().isEmpty());
        
        

    }
}

/**
 * 
 *
 * assertTrue(ProductoDAO.getAll().isEmpty());*
 */
