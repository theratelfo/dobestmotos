package com.dobestmotos.webscrapper.extractors.categories;

import com.dobestmotos.utils.FileReader;

public class ExtractCategoriesASubHtml {

	public ResultExtractCategoriesASubModel extract() {
		
		final FileReader fileReader = new FileReader();
		final String html = fileReader.getHtmlFromFile("categories_html.txt");
		
		final ExtractCategoriesASub extractCategoriesASub = new ExtractCategoriesASub();
		final ResultExtractCategoriesASubModel resultExtractCategoriesASubModel = extractCategoriesASub.extract(html);
		
		return resultExtractCategoriesASubModel;
	}		
}
