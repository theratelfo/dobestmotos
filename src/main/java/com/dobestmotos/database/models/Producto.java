package com.dobestmotos.database.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	private String descripcion;
	private double precio;
	private String categoria;
	private String div1;
	private String div2;

	// Constructor vacío (necesario para JPA)
	public Producto() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDiv1() {
		return div1;
	}

	public void setDiv1(String div1) {
		this.div1 = div1;
	}

	public String getDiv2() {
		return div2;
	}

	public void setDiv2(String div2) {
		this.div2 = div2;
	}

}
