package com.dobestmotos.webscrapper.extractors.products;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.dobestmotos.utils.FileReader;
import com.dobestmotos.webscrapper.extractors.product.RulesForReturnAndExchangeExtractor;

public class RulesForReturnAndExchangeExtractorTest {

	@Test
	public void extractTest() {
		
		final RulesForReturnAndExchangeExtractor rulesForReturnAndExchangeExtractor = new RulesForReturnAndExchangeExtractor();
		final FileReader fileReader = new FileReader();
		final String html = fileReader.getHtmlFromFile("RulesForReturnAndExchangeExtractorTestHtml.txt");
		final String rulesForReturnAndExchange = rulesForReturnAndExchangeExtractor.parse(html);
		
		assertTrue(rulesForReturnAndExchange!=null);
		assertTrue(!rulesForReturnAndExchange.isBlank());
	}
}
