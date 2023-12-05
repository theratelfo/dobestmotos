package com.dobestmotos.webscrapper.iterators;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.dobestmotos.database.daos.ProductoDAO;
import com.dobestmotos.database.daos.ProductoXSubcategoriaDAO;
import com.dobestmotos.database.models.Producto;
import com.dobestmotos.database.models.ProductoXSubcategoria;
import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;
import com.dobestmotos.webscrapper.models.ProductModelExtractor;

public class KingMasterIterator {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public void iterate() {

        final FinalMasterIterator finalMasterIterator = new FinalMasterIterator();
        List<ProductModelExtractor> results = null;

        logger.log(Level.INFO, "Starting iteration...");

        while (!finalMasterIterator.isCompleted()) {
            try {
                finalMasterIterator.iterate();
                results = finalMasterIterator.getProductModels();
            } catch (IOException e) {
                logger.log(Level.SEVERE, "Error during iteration: ", e);
            }
        }

        logger.log(Level.INFO, "Iteration completed. Processing results...");

        final ProductoDAO productoDAO = new ProductoDAO();
        final ProductoXSubcategoriaDAO productoXSubcategoriaDAO = new ProductoXSubcategoriaDAO();

        for (ProductModelExtractor productModelExtractor : results) {

            logger.log(Level.INFO, "Processing ProductModelExtractor with codigoProducto: {0}", productModelExtractor.getCodigoProducto());

            final Producto producto = new Producto();
            producto.setCodigoProducto(productModelExtractor.getCodigoProducto());
            producto.setColores(productModelExtractor.getColores().toString());
            producto.setDescripcion(productModelExtractor.getDescripcion());
            producto.setDiv1(productModelExtractor.getDiv1());
            producto.setImagen(productModelExtractor.getImagen());
            producto.setImagenes(productModelExtractor.getImagenes().toString());
            producto.setPrecio(productModelExtractor.getPrecio());
            producto.setSku("");

            productoDAO.insert(producto);
            logger.log(Level.INFO, "Inserted Producto with codigoProducto: {0}", producto.getCodigoProducto());

            if (productoXSubcategoriaDAO.getByCodigoProductoSubcategoria(productModelExtractor.getCodigoProducto(), productModelExtractor.getCodigoSubcategoria()) != null) {

                logger.log(Level.WARNING, "ProductoXSubcategoria already exists for codigoProducto: {0}, codigoSubcategoria: {1}",
                        new Object[]{productModelExtractor.getCodigoProducto(), productModelExtractor.getCodigoSubcategoria()});
            } else {

                final ProductoXSubcategoria productoXSubcategoria = new ProductoXSubcategoria();
                productoXSubcategoria.setCodigoSubcategoria(productModelExtractor.getCodigoSubcategoria());
                productoXSubcategoria.setCodigoProducto(productModelExtractor.getCodigoProducto());

                productoXSubcategoriaDAO.insert(productoXSubcategoria);
                logger.log(Level.INFO, "Inserted ProductoXSubcategoria with codigoProducto: {0}, codigoSubcategoria: {1}",
                        new Object[]{productoXSubcategoria.getCodigoProducto(), productoXSubcategoria.getCodigoSubcategoria()});
            }
        }

        logger.log(Level.INFO, "Processing completed.");
    }
}
