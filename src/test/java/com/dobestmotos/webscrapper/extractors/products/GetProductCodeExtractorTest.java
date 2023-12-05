package com.dobestmotos.webscrapper.extractors.products;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dobestmotos.webscrapper.extractors.product.GetProductCodeExtractor;

public class GetProductCodeExtractorTest {

	@Test
	public void testObtieneCodigo() {
		GetProductCodeExtractor getProductCode = new GetProductCodeExtractor();
		String url = "https://www.dobestmoto.com/?product=motorcycle-for-bmw-side-stand-enlarge-plate-r1200gs-r-1200-gs-adventure-2014-2015-2016-kickstand-extension-parts-accessories";
		String expectedProductCode = "motorcycle-for-bmw-side-stand-enlarge-plate-r1200gs-r-1200-gs-adventure-2014-2015-2016-kickstand-extension-parts-accessories";
		String actualProductCode = getProductCode.obtieneCodigo(url);
		assertEquals(expectedProductCode, actualProductCode);
	}
}