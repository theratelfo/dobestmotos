package com.dobestmotos.webscrapper.extractors.products;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.dobestmotos.utils.FileReader;
import com.dobestmotos.webscrapper.extractors.product.Div1Extractor;

public class Div1ExtractorTest {

	@Test
	public void testObtenerImagenes() {

		final FileReader fileReader = new FileReader();
		String html = fileReader.getHtmlFromFile("Div1ExtractorHtmlTest.txt");

		Div1Extractor div1Extractor = new Div1Extractor();
		String section = div1Extractor.extract(html);

		System.out.println(section);
		
		assertTrue(section != null);
		assertTrue(!section.isEmpty());
		assertTrue(section.contains("1A016566"));		
	}

}
