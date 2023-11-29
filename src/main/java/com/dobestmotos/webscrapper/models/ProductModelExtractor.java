package com.dobestmotos.webscrapper.models;

import java.util.List;

public class ProductModelExtractor {

	private String codigoProducto;
	private String descripcion;
	private String imagen;
	private List<String> imagenes;
	private List<String> colores;
	private double precio;

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public List<String> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<String> imagenes) {
		this.imagenes = imagenes;
	}

	public List<String> getColores() {
		return colores;
	}

	public void setColores(List<String> colores) {
		this.colores = colores;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
