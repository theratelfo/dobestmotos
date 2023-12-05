package com.dobestmotos.webscrapper.extractors.products;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dobestmotos.utils.FileReader;
import com.dobestmotos.webscrapper.extractors.product.ProductDescriptionExtractor;

public class ProductDescriptionExtractorTest {

	@Test
	public void testExtractProductDescription() {
				
		ProductDescriptionExtractor productDescriptionExtractor = new ProductDescriptionExtractor();
		final FileReader fileReader = new FileReader();
		String html = fileReader.getHtmlFromFile("ProductDescriptionExtractorTestHtml.txt");
		String expectedProductDescription = "Motorcycle For BMW Side Stand Enlarge Plate R1200GS R 1200 GS Adventure 2014 2015 2016 Kickstand Extension Parts Accessories";
		String actualProductDescription = productDescriptionExtractor.extractProductDescription(html);
		assertEquals(expectedProductDescription, actualProductDescription);
	}
}
