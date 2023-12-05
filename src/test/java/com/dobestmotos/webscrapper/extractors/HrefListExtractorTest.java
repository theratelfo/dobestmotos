package com.dobestmotos.webscrapper.extractors;

import org.junit.Test;

import com.dobestmotos.utils.FileReader;

import static org.junit.Assert.assertTrue;

import java.util.List;

public class HrefListExtractorTest {

	@Test
	public void testGetList() {
		
		HrefListExtractor hrefList = new HrefListExtractor();
		final FileReader fileReader = new FileReader();
		String input = fileReader.getHtmlFromFile("HrefListExtractorTestHtml.txt");
		List<String> actualHrefList = hrefList.getList(input);
		assertTrue(actualHrefList.contains(
				"https://www.dobestmoto.com/?product=motorcycle-for-bmw-side-stand-enlarge-plate-r1200gs-r-1200-gs-adventure-2014-2015-2016-kickstand-extension-parts-accessories"));
	}
}