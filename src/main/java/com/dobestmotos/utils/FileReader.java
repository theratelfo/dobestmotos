package com.dobestmotos.utils;

import java.io.InputStream;
import java.util.Scanner;

import com.dobestmotos.webscrapper.extractors.categories.ExtractCategoriesASubHtml;

public class FileReader {

	public String getHtmlFromFile(final String file) {

		// Cargar el archivo usando ClassLoader
		ClassLoader classLoader = ExtractCategoriesASubHtml.class.getClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream(file);

		StringBuilder content = new StringBuilder();

		if (inputStream != null) {
			// Utilizar un Scanner para leer el contenido del archivo
			try (Scanner scanner = new Scanner(inputStream)) {
				// Utilizar StringBuilder para almacenar el contenido del archivo

				while (scanner.hasNextLine()) {
					content.append(scanner.nextLine()).append("\n");
				}

				// Imprimir o utilizar la variable "content" según tus necesidades
				System.out.println("Contenido del archivo:\n" + content.toString());
			}
		} else {
			System.err.println("No se pudo encontrar el archivo: " + file);
		}

		return content.toString();
	}
}
