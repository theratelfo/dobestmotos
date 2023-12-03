package com.dobestmotos.database.daos;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dobestmotos.database.HibernateUtil;
import com.dobestmotos.database.models.Categoria;
import com.dobestmotos.utils.Constants;
import com.dobestmotos.utils.LoggerConfig;

public class CategoriaDAO {

	private static final Logger logger = LoggerConfig.setupLogger(Constants.LOG_FILE_PATH);

	public void insert(Categoria categoria) {
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
			logger.info("Iniciando inserción de categoría: " + categoria.toString());

			tx = session.beginTransaction();
			session.save(categoria);

			tx.commit();
			logger.info("Categoría insertada exitosamente: " + categoria.toString());
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			logger.severe("Error al insertar la categoría: " + e.getMessage());
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public Categoria getByCodigo(String codigo) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
			logger.info("Obteniendo categoría por código: " + codigo);

			Query<Categoria> query = session.createQuery("FROM Categoria WHERE codigo = :codigo", Categoria.class);
			query.setParameter("codigo", codigo);
			List<Categoria> result = query.list();

			if (!result.isEmpty()) {
				logger.info("Categoría encontrada por código: " + codigo);
				return result.get(0);
			} else {
				logger.info("No se encontró ninguna categoría con el código: " + codigo);
				return null;
			}
		} catch (HibernateException e) {
			logger.severe("Error al obtener la categoría por código: " + e.getMessage());
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	public List<Categoria> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
			logger.info("Obteniendo todas las categorías.");

			List<Categoria> data = session.createCriteria(Categoria.class).list();

			logger.info("Categorías obtenidas exitosamente: " + data.size() + " categorías encontradas.");
			return data;
		} catch (HibernateException e) {
			logger.severe("Error al obtener todas las categorías: " + e.getMessage());
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
}
