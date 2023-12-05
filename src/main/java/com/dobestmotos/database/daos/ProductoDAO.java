package com.dobestmotos.database.daos;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.dobestmotos.database.HibernateUtil;
import com.dobestmotos.database.models.Producto;
import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;

public class ProductoDAO {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public void insert(Producto producto) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            logger.info("Iniciando inserción de producto: " + producto.toString());

            tx = session.beginTransaction();
            session.save(producto);

            tx.commit();
            logger.info("Producto insertado exitosamente: " + producto.toString());
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

    @SuppressWarnings("deprecation")
    public List<Producto> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            logger.info("Obteniendo todos los productos.");

            List<Producto> data = session.createCriteria(Producto.class).list();

            logger.info("Productos obtenidos exitosamente: " + data.size() + " productos encontrados.");
            return data;
        } catch (HibernateException e) {
            logger.severe("Error al obtener todos los productos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }
        
    public long getCount() {
    	
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
        	
            logger.info("Obteniendo el total de todos los productos.");

            String hql = "SELECT COUNT(*) FROM Producto";
            
            Query<Long> query = session.createQuery(hql, Long.class);
            
            logger.info("Cantidad de registros obtenidos: " + query.uniqueResult());
            
            return query.uniqueResult();
                        
        } catch (HibernateException e) {
            logger.severe("Error al obtener todos los productos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            session.close();
        }
        return -1;
    }
    
    @SuppressWarnings("deprecation")
    public Producto getByCodigoProducto(String codigoProducto) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            logger.info("Obteniendo producto con código: " + codigoProducto);

            Criteria criteria = session.createCriteria(Producto.class)
                    .add(Restrictions.eq("codigoProducto", codigoProducto));

            Producto producto = (Producto) criteria.uniqueResult();

            if (producto != null) {
                logger.info("Producto obtenido exitosamente: " + producto);
            } else {
                logger.warning("No se encontró ningún producto con código: " + codigoProducto);
            }

            return producto;
        } catch (HibernateException e) {
            logger.severe("Error al obtener producto por código: " + e.getMessage());
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }
}
