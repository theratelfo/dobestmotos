package com.dobestmotos.webscrapper;

import static org.junit.Assert.*;
import org.junit.Test;

import com.dobestmotos.database.models.Categoria;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class IteradorCategoriasTest {

    @Test
    public void iteraCategoriasDebeRetornarResultadosNoVacios() throws IOException {
        // Arrange
        IteradorCategorias iterador = new IteradorCategorias();
        
        final Categoria categoriaAccesories = new Categoria();
        categoriaAccesories.setCodigo("accessories");
        final Categoria categoriaAirFilter = new Categoria();
        categoriaAirFilter.setCodigo("air-filter");
        
        List<Categoria> categorias = new ArrayList<>();
        categorias.add(categoriaAccesories);
        categorias.add(categoriaAirFilter);

        // Act
        HashMap<String, List<String>> resultados = iterador.iteraCategorias(categorias);

        // Assert
        assertNotNull(resultados);
        assertFalse(resultados.isEmpty());
        
        final List<String> accesorios = resultados.get("accessories");
        final List<String> airFilters = resultados.get("air-filter");

        assertTrue(accesorios.size()==2);
        assertTrue(airFilters.size()==8);
        
    }
/*
    @Test
    public void iteraCategoriasDebeRetornarResultadosVacios() throws IOException {
        // Arrange
        IteradorCategorias iterador = new IteradorCategorias();
        List<String> codigoCategorias = new ArrayList<>();

        // Act
        HashMap<String, List<String>> resultados = iterador.iteraCategorias(codigoCategorias);

        // Assert
        assertNotNull(resultados);
        assertTrue(resultados.isEmpty());
    }*/
}