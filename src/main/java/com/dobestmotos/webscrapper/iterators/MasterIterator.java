package com.dobestmotos.webscrapper.iterators;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import com.dobestmotos.database.daos.PaginacionProductoXCategoriaDAO;
import com.dobestmotos.database.daos.ProductoDAO;
import com.dobestmotos.database.models.PaginacionProductoXCategoria;
import com.dobestmotos.database.models.Producto;
import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;
import com.dobestmotos.webscrapper.extractors.GetProductCodeExtractor;
import com.dobestmotos.webscrapper.extractors.HrefListExtractor;
import com.dobestmotos.webscrapper.extractors.MasterProductExtractor;
import com.dobestmotos.webscrapper.models.ProductModelExtractor;

public class MasterIterator {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public void iterate() throws IOException {
        try {
            logger.info("Iniciando iteración principal.");

            final PaginacionProductoXCategoriaDAO paginacionProductoXCategoriaDAO = new PaginacionProductoXCategoriaDAO();
            final List<PaginacionProductoXCategoria> paginacionProductoXCategorias = paginacionProductoXCategoriaDAO.getAll();

            final ProductoDAO productoDAO = new ProductoDAO();

            for (PaginacionProductoXCategoria paginacionProductoXCategoria : paginacionProductoXCategorias) {
                logger.info("Procesando PaginacionProductoXCategoria con ID: " + paginacionProductoXCategoria.getId());

                final HrefListExtractor hrefListExtractor = new HrefListExtractor();
                final List<String> urlProductFromPaginations = hrefListExtractor.getList(paginacionProductoXCategoria.getHtml());

                for (String urlProduct : urlProductFromPaginations) {
                    logger.info("Procesando URL de producto: " + urlProduct);

                    final GetProductCodeExtractor getProductCode = new GetProductCodeExtractor();
                    final String productCode = getProductCode.obtieneCodigo(urlProduct);
                    logger.info("Código del producto: " + productCode);
                    
                    if (productoDAO.getByCodigoProducto(productCode) != null) {
                        logger.info("El producto con código " + productCode + " ya existe. Saltando.");
                        continue;
                    }
                    
                    final MasterProductExtractor masterProductExtractor = new MasterProductExtractor();
                    final ProductModelExtractor productModelExtractor = masterProductExtractor.getProduct(urlProduct);                   
                    
                    logger.info("El producto con código " + productModelExtractor.getCodigoProducto() + " no existe. Procesando");

                    final Producto producto = new Producto();
                    producto.setCodigoProducto(productModelExtractor.getCodigoProducto());
                    producto.setColores(productModelExtractor.getColores().toString());
                    producto.setDescripcion(productModelExtractor.getDescripcion());
                    producto.setDiv1("");
                    producto.setDiv2("");
                    producto.setImagen(productModelExtractor.getImagen());
                    producto.setImagenes(productModelExtractor.getImagenes().toString());
                    producto.setPrecio(productModelExtractor.getPrecio());

                    productoDAO.insert(producto);
                    logger.info("Producto insertado exitosamente: " + producto);
                }
            }

            logger.info("Iteración principal completada exitosamente.");
        } catch (Exception e) {
            logger.severe("Error durante la iteración principal: " + e.getMessage());
            e.printStackTrace();
        }
    }
}