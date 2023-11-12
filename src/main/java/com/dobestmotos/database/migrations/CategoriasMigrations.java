package com.dobestmotos.database.migrations;

import com.dobestmotos.database.daos.CategoriaDAO;
import com.dobestmotos.database.models.Categoria;

public class CategoriasMigrations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Categoria categoria = new Categoria();
		categoria.setCodigo("123");
		categoria.setNombre("nombre");

		CategoriaDAO categoriaDAO = new CategoriaDAO();
		categoriaDAO.insert(categoria);
		
		categoria=new Categoria();
		categoria.setCodigo("123");
		categoria.setNombre("nombre");
		categoriaDAO.insert(categoria);
		
		categoria=new Categoria();
		categoria.setCodigo("123");
		categoria.setNombre("nombre");
		categoriaDAO.insert(categoria);

		

	}

}
