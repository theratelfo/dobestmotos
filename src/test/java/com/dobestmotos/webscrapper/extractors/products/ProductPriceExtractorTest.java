package com.dobestmotos.webscrapper.extractors.products;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dobestmotos.utils.FileReader;
import com.dobestmotos.webscrapper.extractors.product.ProductPriceExtractor;

public class ProductPriceExtractorTest {

	@Test
	public void testExtractProductPrice() {
		ProductPriceExtractor productPriceExtractor = new ProductPriceExtractor();
		final FileReader fileReader = new FileReader();
		String html = fileReader.getHtmlFromFile("ProductPriceExtractorTestHtml.txt");
		Double expectedProductPrice = 16.11;
		Double actualProductPrice = productPriceExtractor.extractProductPrice(html);
		assertEquals(expectedProductPrice, actualProductPrice);
	}

}
