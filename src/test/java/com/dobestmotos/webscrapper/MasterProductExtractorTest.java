package com.dobestmotos.webscrapper;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

public class MasterProductExtractorTest {

	@Test
	public void obtieneProducto() {

		final MasterProductExtractor masterProductExtractor = new MasterProductExtractor();
		try {
			final ProductModelExtractor productModelExtractor = masterProductExtractor.getProduct(
					"https://www.dobestmoto.com/?product=motorcycle-for-bmw-side-stand-enlarge-plate-r1200gs-r-1200-gs-adventure-2014-2015-2016-kickstand-extension-parts-accessories");
			assertTrue(productModelExtractor.getCodigoProducto().compareTo(
					"motorcycle-for-bmw-side-stand-enlarge-plate-r1200gs-r-1200-gs-adventure-2014-2015-2016-kickstand-extension-parts-accessories") == 0);
			assertTrue(productModelExtractor.getDescripcion().compareTo(
					"Motorcycle For BMW Side Stand Enlarge Plate R1200GS R 1200 GS Adventure 2014 2015 2016 Kickstand Extension Parts Accessories") == 0);
			assertTrue(productModelExtractor.getImagen().compareTo(
					"https://www.dobestmoto.com/qfy-content/uploads/2022/11/3bdd4bd3cfd106a569406adc02fb3928-300x300.jpg") == 0);
			assertTrue(productModelExtractor.getPrecio() == 16.11);
			assertTrue(productModelExtractor.getImagenes().contains(
					"https://www.dobestmoto.com/qfy-content/uploads/2022/11/3bdd4bd3cfd106a569406adc02fb3928.jpg"));
			assertTrue(productModelExtractor.getColores().contains("blue"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
