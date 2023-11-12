package com.dobestmotos.database.daos;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.CriteriaQuery;

import com.dobestmotos.database.HibernateUtil;
import com.dobestmotos.database.models.Categoria;

public class CategoriaDAO {

	public void insert(Categoria categoria) {

		Transaction tx = null;
		// Get the session object.
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			// Start hibernate session.
			tx = session.beginTransaction();

			// Insert a new student record in the database.
			session.save(categoria);

			// Commit hibernate transaction if no exception occurs.
			tx.commit();
			System.out.println("Saved Successfully.");
		} catch (HibernateException e) {
			if (tx != null) {
				// Roll back if any exception occurs.
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			// Close hibernate session.
			session.close();
		}
	}

	public List<Categoria> getAll() {

		// Get the session object.
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {

			List<Categoria> data = session.createCriteria(Categoria.class).list();
			return data;

		} catch (HibernateException e) {

			e.printStackTrace();
		} finally {
			// Close hibernate session.
			session.close();
			
		}
		return null;

	}
}
