package com.dobestmotos.database.daos;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dobestmotos.database.models.Producto;

public class ProductoDAOTest {

    @Test
    public void getAll() {
        ProductoDAO productoDAO = new ProductoDAO();

        // Inserta un producto en la base de datos
        Producto producto = new Producto();
        producto.setId(1);
        producto.setCategoria("esta es  una de esas");
        producto.setDescripcion("esta es una descripcion"); 
        producto.setDiv1("soy un div");
        producto.setDiv2("soy un div");
        producto.setCategoria("soy una categoria");
        productoDAO.insert(producto);

        assertTrue(ProductoDAO.getAll().size()>0);
    }
}

