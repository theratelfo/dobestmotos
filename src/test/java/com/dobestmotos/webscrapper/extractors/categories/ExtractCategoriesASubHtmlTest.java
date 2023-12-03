package com.dobestmotos.webscrapper.extractors.categories;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExtractCategoriesASubHtmlTest {

	@Test
	public void extractTest() {
		
		final ExtractCategoriesASubHtml extractCategoriesASubHtml = new ExtractCategoriesASubHtml();
		final ResultExtractCategoriesASubModel resultExtractCategoriesASubModel = extractCategoriesASubHtml.extract();
		
		assertTrue(resultExtractCategoriesASubModel.getCategorias().size()>0);
		assertTrue(resultExtractCategoriesASubModel.getSubcategorias().size()>0);		
	}
}
