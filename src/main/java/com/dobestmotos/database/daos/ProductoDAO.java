package com.dobestmotos.database.daos;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dobestmotos.database.HibernateUtil;
import com.dobestmotos.database.models.Producto;

public class ProductoDAO {

	public void insert(Producto producto) {

		Transaction tx = null;
		// Get the session object.
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			// Start hibernate session.
			tx = session.beginTransaction();

			// Insert a new student record in the database.
			session.save(producto);

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

	@SuppressWarnings("deprecation")
	public static List<Producto> getAll() {

		// Get the session object.
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {

			List<Producto> data = session.createCriteria(Producto.class).list();
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
