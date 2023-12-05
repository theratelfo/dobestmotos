package com.dobestmotos.webscrapper.extractors.products;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.dobestmotos.utils.FileReader;
import com.dobestmotos.webscrapper.extractors.product.ObtenerColoresExtractor;

public class ObtenerColoresExrtractorTest {

	@Test
	public void testObtenerColores() {
		
		final FileReader fileReader = new FileReader();
		String html = fileReader.getHtmlFromFile("ObtenerColoresExrtractorTestHtml.txt");
		ObtenerColoresExtractor extractor = new ObtenerColoresExtractor();
		List<String> colores = extractor.obtenerColores(html);
		assertEquals(5, colores.size());
		assertTrue(colores.contains("black"));
		assertTrue(colores.contains("gold"));
		assertTrue(colores.contains("red"));
		assertTrue(colores.contains("blue"));
		assertTrue(colores.contains("titanium"));
	}

}
