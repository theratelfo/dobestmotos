package com.dobestmotos.database.daos;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dobestmotos.database.HibernateUtil;
import com.dobestmotos.database.models.ProductoXSubcategoria;
import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;

public class ProductoXSubcategoriaDAO {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public void insert(ProductoXSubcategoria productoXSubcategoria) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            logger.info("Iniciando inserción de producto x subcategoria: " + productoXSubcategoria.toString());

            tx = session.beginTransaction();
            session.save(productoXSubcategoria);

            tx.commit();
            logger.info("Producto x subcategoria insertado exitosamente: " + productoXSubcategoria.toString());
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("Error al insertar el producto x subcategoria: " + e.getMessage());
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
    public long getCount() {
    	
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
        	
            logger.info("Obteniendo el total de todos los productos x subcategorías.");

            String hql = "SELECT COUNT(*) FROM ProductoXSubcategoria";
            
            Query<Long> query = session.createQuery(hql, Long.class);
            
            logger.info("Cantidad de registros obtenidos: " + query.uniqueResult());
            
            return query.uniqueResult();
                        
        } catch (HibernateException e) {
            logger.severe("Error al obtener los productos x subcategorias: " + e.getMessage());
            e.printStackTrace();
        } finally {
            session.close();
        }
        return -1;
    }

    public ProductoXSubcategoria getByCodigoProductoSubcategoria(String codigoProducto, String codigoSubcategoria) {
    	
		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
			logger.info("Obteniendo objeto por codigo de producto " + codigoProducto + " y codigo de subcategoría " + codigoSubcategoria);

			Query<ProductoXSubcategoria> query = session.createQuery("FROM ProductoXSubcategoria WHERE codigoProducto = :codigoProducto AND codigoSubcategoria = :codigoSubcategoria", ProductoXSubcategoria.class);
			query.setParameter("codigoProducto", codigoProducto);
			query.setParameter("codigoSubcategoria", codigoSubcategoria);
			List<ProductoXSubcategoria> result = query.list();

			if (!result.isEmpty()) {
				logger.info("Registro encontrado");
				return result.get(0);
			} else {
				logger.info("No se encontró ningún registro");
				return null;
			}
		} catch (HibernateException e) {
			logger.severe("Error al obtener la subcategoría por código: " + e.getMessage());
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
    
    public ProductoXSubcategoria getByCodigoSubcategoria(String codigoSubcategoria) {
    	
		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
			logger.info("Obteniendo objeto por codigo de subcategoría " + codigoSubcategoria);

			Query<ProductoXSubcategoria> query = session.createQuery("FROM ProductoXSubcategoria WHERE codigoSubcategoria = :codigoSubcategoria", ProductoXSubcategoria.class);			
			query.setParameter("codigoSubcategoria", codigoSubcategoria);
			List<ProductoXSubcategoria> result = query.list();

			if (!result.isEmpty()) {
				logger.info("Registro encontrado");
				return result.get(0);
			} else {
				logger.info("No se encontró ningún registro");
				return null;
			}
		} catch (HibernateException e) {
			logger.severe("Error al obtener la subcategoría por código: " + e.getMessage());
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
    
    @SuppressWarnings("deprecation")
    public List<ProductoXSubcategoria> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            logger.info("Obteniendo todos los productos x subcategoria.");

            List<ProductoXSubcategoria> data = session.createCriteria(ProductoXSubcategoria.class).list();

            logger.info("Productos x subcategoria obtenidos exitosamente: " + data.size() + " productos x subcategoria encontrados.");
            return data;
        } catch (HibernateException e) {
            logger.severe("Error al obtener todos los productos x subcategoria: " + e.getMessage());
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }        
}
