package com.dobestmotos.webscrapper;


import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;


public class ObtieneHtmlTest {

    @Test
    public void obtenerHTMLDeUrlValida() throws IOException {
        // Arrange
        String url = "https://www.dobestmoto.com/?product_cat=accessories";

        // Act
        String html = ObtieneHtml.obtenerHTML(url);
        
        System.out.println(html);

        // Assert
        assertNotNull(html);
        assertTrue(html.contains("PRODUCT"));
    }

    /**@Test
    public void obtenerHTMLDeUrlNoValida() throws IOException {
        // Arrange
        String url = "http://example.com";
        String exceptionMessage = "URL no válida";

        // Act
        try {
            ObtieneHtml.obtenerHTML(url);
        } catch (IOException e) {
            assertEquals(exceptionMessage, e.getMessage());
        }
    } */
    
}