package com.dobestmotos.database.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PaginacionProductoXCategoria")
public class PaginacionProductoXCategoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String codigoCategoria;
	private String urlPaginacionProducto;
	private String html;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(String codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public String getUrlPaginacionProducto() {
		return urlPaginacionProducto;
	}

	public void setUrlPaginacionProducto(String urlPaginacionProducto) {
		this.urlPaginacionProducto = urlPaginacionProducto;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}
}