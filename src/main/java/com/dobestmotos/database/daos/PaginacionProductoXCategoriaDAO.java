package com.dobestmotos.database.daos;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.dobestmotos.database.HibernateUtil;
import com.dobestmotos.database.models.PaginacionProductoXCategoria;
import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;

public class PaginacionProductoXCategoriaDAO {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public void insert(PaginacionProductoXCategoria productoXCategoria) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            logger.info("Iniciando inserción de url de paginación producto: " + productoXCategoria.getUrlPaginacionProducto());
            logger.info("para la categoría: " + productoXCategoria.getCodigoCategoria());

            tx = session.beginTransaction();
            session.save(productoXCategoria);

            tx.commit();
            logger.info("Registro insertado exitosamente: " + productoXCategoria);
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("Error al insertar el producto: " + e.getMessage());
            e.printStackTrace();
        } finally {
            session.close();
        }
    }       

    public void updatePaginacionProductoXCategoria(PaginacionProductoXCategoria productoXCategoria) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            logger.info("Iniciando actualización de PaginacionProductoXCategoria con ID: " + productoXCategoria.getId());

            tx = session.beginTransaction();

            // Realizar la actualización usando merge
            session.merge(productoXCategoria);

            tx.commit();
            logger.info("Actualización de PaginacionProductoXCategoria realizada exitosamente para el ID: " + productoXCategoria.getId());
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("Error al realizar la actualización de PaginacionProductoXCategoria: " + e.getMessage());
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    
    @SuppressWarnings("deprecation")
    public List<PaginacionProductoXCategoria> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            logger.info("Obteniendo todos los productos X categorías.");

            List<PaginacionProductoXCategoria> data = session.createCriteria(PaginacionProductoXCategoria.class).list();

            logger.info("Registros obtenidos exitosamente: " + data.size() + " registros encontrados.");
            return data;
        } catch (HibernateException e) {
            logger.severe("Error al obtener todos los productos X categorías: " + e.getMessage());
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }
    
    @SuppressWarnings("deprecation")
    public List<PaginacionProductoXCategoria> getRegistrosConHtmlNulo() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            logger.info("Obteniendo registros con campo html nulo.");

            Criteria criteria = session.createCriteria(PaginacionProductoXCategoria.class)
                    .add(Restrictions.isNull("html"));

            List<PaginacionProductoXCategoria> data = criteria.list();

            logger.info("Registros obtenidos exitosamente: " + data.size() + " registros encontrados.");
            return data;
        } catch (HibernateException e) {
            logger.severe("Error al obtener registros con campo html nulo: " + e.getMessage());
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }

}
