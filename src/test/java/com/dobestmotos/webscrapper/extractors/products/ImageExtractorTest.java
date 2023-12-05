package com.dobestmotos.webscrapper.extractors.products;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.dobestmotos.utils.FileReader;
import com.dobestmotos.webscrapper.extractors.product.ImageExtractor;

public class ImageExtractorTest {

	@Test
	public void testObtenerImagenes() {
		
		final FileReader fileReader = new FileReader();
		String html = fileReader.getHtmlFromFile("ImageExtractorTestHtml.txt");
		ImageExtractor extractor = new ImageExtractor();
		List<String> imagenes = extractor.obtenerImagenes(html);
		assertTrue(imagenes.contains(
				"https://www.dobestmoto.com/qfy-content/uploads/2022/11/3bdd4bd3cfd106a569406adc02fb3928.jpg"));

	}

}
