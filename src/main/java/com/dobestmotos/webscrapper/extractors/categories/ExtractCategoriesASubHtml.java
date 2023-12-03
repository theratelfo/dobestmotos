package com.dobestmotos.webscrapper.extractors.categories;

import java.io.InputStream;
import java.util.Scanner;

public class ExtractCategoriesASubHtml {

	public ResultExtractCategoriesASubModel extract() {
		
		final String html = getHtmlFromFile();
		
		final ExtractCategoriesASub extractCategoriesASub = new ExtractCategoriesASub();
		final ResultExtractCategoriesASubModel resultExtractCategoriesASubModel = extractCategoriesASub.extract(html);
		
		return resultExtractCategoriesASubModel;
	}
	
	private String getHtmlFromFile() {
		
		// Nombre del archivo en el directorio resources
        String fileName = "categories_html.txt";

        // Cargar el archivo usando ClassLoader
        ClassLoader classLoader = ExtractCategoriesASubHtml.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

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
            System.err.println("No se pudo encontrar el archivo: " + fileName);
        }
        
        return content.toString();
	}
}
