package com.dobestmotos.webscrapper.iterators;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.dobestmotos.webscrapper.models.ProductModelExtractor;

public class FinalMasterIteratorTest {

	@Test
	public void iterateTest() {
		
		final FinalMasterIterator finalMasterIterator = new FinalMasterIterator();
		List<ProductModelExtractor> results = null;
		
		while(!finalMasterIterator.isCompleted()) {
			try {
				finalMasterIterator.iterate();
				results = finalMasterIterator.getProductModels();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}				
		
		assertTrue(results!=null);
		assertTrue(results.size()>0);
	}
}
