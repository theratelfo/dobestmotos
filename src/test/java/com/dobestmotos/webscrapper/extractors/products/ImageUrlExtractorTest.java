package com.dobestmotos.webscrapper.extractors.products;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dobestmotos.utils.FileReader;
import com.dobestmotos.webscrapper.extractors.product.ImageUrlExtractor;

public class ImageUrlExtractorTest {

	@Test
	public void testExtractImageUrl() {
		
		ImageUrlExtractor imageUrlExtractor = new ImageUrlExtractor();
		final FileReader fileReader = new FileReader();
		String html = fileReader.getHtmlFromFile("ImageUrlExtractorTestHtml.txt");
		String expectedImageUrl = "https://www.dobestmoto.com/qfy-content/uploads/2022/11/3bdd4bd3cfd106a569406adc02fb3928-300x300.jpg";
		String actualImageUrl = imageUrlExtractor.extractImageUrl(html);
		assertEquals(expectedImageUrl, actualImageUrl);
	}

}
