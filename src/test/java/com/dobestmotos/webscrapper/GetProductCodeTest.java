package com.dobestmotos.webscrapper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GetProductCodeTest {

	@Test
	public void testObtieneCodigo() {
		GetProductCode getProductCode = new GetProductCode();
		String url = "https://www.dobestmoto.com/?product=motorcycle-for-bmw-side-stand-enlarge-plate-r1200gs-r-1200-gs-adventure-2014-2015-2016-kickstand-extension-parts-accessories";
		String expectedProductCode = "motorcycle-for-bmw-side-stand-enlarge-plate-r1200gs-r-1200-gs-adventure-2014-2015-2016-kickstand-extension-parts-accessories";
		String actualProductCode = getProductCode.obtieneCodigo(url);
		assertEquals(expectedProductCode, actualProductCode);
	}
}