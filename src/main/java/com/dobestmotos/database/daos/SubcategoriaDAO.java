package com.dobestmotos.database.daos;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dobestmotos.database.HibernateUtil;
import com.dobestmotos.database.models.Categoria;
import com.dobestmotos.database.models.Subcategoria;
import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;

public class SubcategoriaDAO {

    private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

    public void insert(Subcategoria subcategoria) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            logger.info("Iniciando inserción de subcategoria: " + subcategoria.toString());
            
            tx = session.beginTransaction();
            session.save(subcategoria);

            tx.commit();
            logger.info("Subcategoría insertada exitosamente: " + subcategoria.toString());
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("Error al insertar la categoria: " + e.getMessage());
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public Subcategoria getByCodigo(String codigo) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
			logger.info("Obteniendo subcategoría por código: " + codigo);

			Query<Subcategoria> query = session.createQuery("FROM Subcategoria WHERE codigo = :codigo", Subcategoria.class);
			query.setParameter("codigo", codigo);
			List<Subcategoria> result = query.list();

			if (!result.isEmpty()) {
				logger.info("Subcategoría encontrada por código: " + codigo);
				return result.get(0);
			} else {
				logger.info("No se encontró ninguna subcategoría con el código: " + codigo);
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
    
    public List<Subcategoria> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            logger.info("Obteniendo todas las subcategorías.");

            List<Subcategoria> data = session.createCriteria(Subcategoria.class).list();

            logger.info("Subcategorías obtenidas exitosamente: " + data.size() + " categorías encontradas.");
            return data;
        } catch (HibernateException e) {
            logger.severe("Error al obtener todos las subcategorías: " + e.getMessage());
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }
}
