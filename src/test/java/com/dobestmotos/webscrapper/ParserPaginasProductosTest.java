package com.dobestmotos.webscrapper;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;
import java.util.List;

public class ParserPaginasProductosTest {

    @Test
    public void getUrlProductsDeCategoriaValida() throws IOException {
        // Arrange
        ParserPaginasProductos parser = new ParserPaginasProductos();
        String codigoCategoria = "accessories"; // Código de categoría válido
        int expectedSize = 2; // Suponiendo que se obtendrán 10 URLs válidas

        // Act
        List<String> urls = parser.getUrlProducts(codigoCategoria);

        // Assert
        assertNotNull(urls);
        assertEquals(expectedSize, urls.size());
    } 
}