package com.dobestmotos.webscrapper;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ObtenerColores {

	
	public List<String> obtenerColores(String html) {
	    List<String> colores = new ArrayList<>();
	    Document doc = Jsoup.parse(html);
	    Element select = doc.selectFirst("select#color");
	    Elements opciones = select.select("option[value]:not([value=''])");
	    for (Element opcion : opciones) {
	        String color = opcion.attr("value");
	        colores.add(color);
	    }

	    return colores;
	}
}
