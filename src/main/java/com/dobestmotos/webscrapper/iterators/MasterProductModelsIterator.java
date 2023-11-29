package com.dobestmotos.webscrapper.iterators;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.dobestmotos.database.daos.PaginacionProductoXCategoriaDAO;
import com.dobestmotos.database.models.PaginacionProductoXCategoria;
import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;
import com.dobestmotos.webscrapper.utils.ObtieneHtml;

public class MasterProductModelsIterator {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public void iterate() throws IOException {
        logger.info("Iniciando iteración y extracción de información de productos.");

        final PaginacionProductoXCategoriaDAO paginacionProductoXCategoriaDAO = new PaginacionProductoXCategoriaDAO();
        final List<PaginacionProductoXCategoria> paginacionesProductosXCategorias = paginacionProductoXCategoriaDAO.getRegistrosConHtmlNulo();
        logger.info("Obtención de URLs por paginación de productos completada.");        

        for(PaginacionProductoXCategoria paginacionProductoXCategoria : paginacionesProductosXCategorias) {
        	
        	logger.info("Procesando: " + paginacionProductoXCategoria.getCodigoCategoria() + ": " + paginacionProductoXCategoria.getUrlPaginacionProducto());

            final ObtieneHtml obtieneHtml = new ObtieneHtml();
            final String html = obtieneHtml.obtenerHTML(paginacionProductoXCategoria.getUrlPaginacionProducto());
            paginacionProductoXCategoria.setHtml(html);
            
            paginacionProductoXCategoriaDAO.updatePaginacionProductoXCategoria(paginacionProductoXCategoria);
            
        }
        
        logger.info("Iteración y extracción de información de productos completada exitosamente.");        
    }
}
