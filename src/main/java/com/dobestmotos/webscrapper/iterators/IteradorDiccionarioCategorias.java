package com.dobestmotos.webscrapper.iterators;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dobestmotos.database.daos.PaginacionProductoXCategoriaDAO;
import com.dobestmotos.database.models.PaginacionProductoXCategoria;

public class IteradorDiccionarioCategorias {

	public void iterate() throws IOException {
		
		final IteradorCategoriasModels iteradorCategoriasModels = new IteradorCategoriasModels();
        final HashMap<String, List<String>> diccionario = iteradorCategoriasModels.itera();
        
        final PaginacionProductoXCategoriaDAO paginacionProductoXCategoriaDAO = new PaginacionProductoXCategoriaDAO();
        
        for (Map.Entry<String, List<String>> entry : diccionario.entrySet()) {
            String categoria = entry.getKey();
            List<String> urlsProductosPaginación = entry.getValue();

            for(String urlProductoPaginacion : urlsProductosPaginación) {
            
            	final PaginacionProductoXCategoria paginacionProductoXCategoria = new PaginacionProductoXCategoria();
            	paginacionProductoXCategoria.setCodigoCategoria(categoria);
            	paginacionProductoXCategoria.setUrlPaginacionProducto(urlProductoPaginacion);            	
            	            	
            	paginacionProductoXCategoriaDAO.insert(paginacionProductoXCategoria);
            }           
        }       
	}
}
