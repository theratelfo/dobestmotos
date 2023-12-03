package com.dobestmotos.webscrapper.extractors.categories;

import java.util.ArrayList;
import java.util.List;

import com.dobestmotos.database.models.Categoria;
import com.dobestmotos.database.models.Subcategoria;

public class ResultExtractCategoriesASubModel {

	private List<Categoria> categorias = new ArrayList<>();
	private List<Subcategoria> subcategorias = new ArrayList<>();
	
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	public List<Subcategoria> getSubcategorias() {
		return subcategorias;
	}
	public void setSubcategorias(List<Subcategoria> subcategorias) {
		this.subcategorias = subcategorias;
	}
}
