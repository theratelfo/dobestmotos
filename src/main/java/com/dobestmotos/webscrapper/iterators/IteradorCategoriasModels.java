package com.dobestmotos.webscrapper.iterators;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import com.dobestmotos.database.daos.CategoriaDAO;
import com.dobestmotos.database.models.Categoria;
import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;

public class IteradorCategoriasModels {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public HashMap<String, List<String>> itera() throws IOException {
        logger.info("Iniciando iteración de categorías y obtención de URLs.");

        final CategoriaDAO categoriaDAO = new CategoriaDAO();
        final List<Categoria> categorias = categoriaDAO.getAll();
        logger.info("Obteniendo todas las categorías.");

        final IteradorCategorias iterador = new IteradorCategorias();
        final HashMap<String, List<String>> resultados = iterador.iteraCategorias(categorias);

        logger.info("Iteración de categorías y obtención de URLs completada exitosamente.");
        return resultados;
    }
}
