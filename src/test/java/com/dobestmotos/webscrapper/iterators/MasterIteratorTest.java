package com.dobestmotos.webscrapper.iterators;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;

import com.dobestmotos.database.daos.ProductoDAO;
import com.dobestmotos.database.models.Producto;
import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;

public class MasterIteratorTest {

	private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    @Test
    public void iterateTest() throws IOException {
        try {
            logger.info("Iniciando prueba de iteración.");

            final MasterIterator masterIterator = new MasterIterator();
            masterIterator.iterate();

            logger.info("Iteración completada exitosamente.");

            final ProductoDAO productoDAO = new ProductoDAO();
            final List<Producto> products = productoDAO.getAll();

            assertTrue("La lista de productos no está vacía", products.size() > 0);
            logger.info("Prueba de iteración exitosa. Productos encontrados: " + products.size());
        } catch (Exception e) {
            logger.severe("Error durante la prueba de iteración: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
