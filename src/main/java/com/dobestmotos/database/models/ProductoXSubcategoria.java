package com.dobestmotos.database.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto_x_subcategoria")
public class ProductoXSubcategoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="codigo_producto")
	private String codigoProducto;
	
	@Column(name="codigo_subcategoria")
	private String codigoSubcategoria;	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getCodigoSubcategoria() {
		return codigoSubcategoria;
	}

	public void setCodigoSubcategoria(String codigoSubcategoria) {
		this.codigoSubcategoria = codigoSubcategoria;
	}	
}