package com.dobestmotos.webscrapper;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IteradorCategoriasModelsTest {

	@Test
	public void iteraDebeRetornarResultadosNoVacios() throws IOException {
		// Arrange
		IteradorCategoriasModels iterador = new IteradorCategoriasModels();

		// Act

		HashMap<String, List<String>> resultados = iterador.itera();
		for (Map.Entry<String, List<String>> entry : resultados.entrySet()) {
			String categoria = entry.getKey();
			List<String> urls = entry.getValue();
			System.out.println("Categoría: " + categoria);
			System.out.println("URLs:");
			for (String url : urls) {
				System.out.println(url);
			}
		}

		// Assert
		assertNotNull(resultados);
		assertFalse(resultados.isEmpty());
	}
}
