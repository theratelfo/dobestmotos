package com.dobestmotos.webscrapper.iterators;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import com.dobestmotos.database.models.Categoria;
import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;
import com.dobestmotos.webscrapper.ParserPaginasProductos;

public class IteradorCategorias {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public HashMap<String, List<String>> iteraCategorias(final List<Categoria> categorias) throws IOException {
        logger.info("Iniciando iteración de categorías.");

        final HashMap<String, List<String>> resultados = new HashMap<>();

        for (Categoria categoria : categorias) {
            logger.info("Procesando categoría: " + categoria.getCodigo());

            ParserPaginasProductos parser = new ParserPaginasProductos();
            final List<String> urls = parser.getUrlProducts(categoria.getCodigo());

            logger.info("Número de URLs encontradas para la categoría " + categoria.getCodigo() + ": " + urls.size());
            
            resultados.put(categoria.getCodigo(), urls);
        }

        logger.info("Iteración de categorías completada exitosamente.");
        return resultados;
    }
}
