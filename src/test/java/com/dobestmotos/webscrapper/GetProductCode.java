package com.dobestmotos.webscrapper;

public class GetProductCode {

	public String obtieneCodigo(final String url) {
		String productCode = "";
		int index = url.indexOf("product=");
		if (index != -1) {
			productCode = url.substring(index + 8);
		}
		return productCode;

	}

}
