package com.dobestmotos.iteradores;

import java.util.List;

public class Categoria {

    private final String nombre;
    private final List<String> urls;

    public Categoria(String nombre, List<String> urls) {
        this.nombre = nombre;
        this.urls = urls;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getUrls() {
        return urls;
    }
}
