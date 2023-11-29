package com.dobestmotos.webscrapper.utils;

import static org.junit.Assert.*;
import org.junit.Test;


import java.io.IOException;

public class ObtieneHtmlTest {

    @Test
    public void obtenerHTMLDeUrlValida() throws IOException {
        // Arrange
        String url = "https://www.dobestmoto.com/?product=motorcycle-air-purifier-bicycle-vacuum-cleaner-for-honda-xlv650-xl650v-transalp-2000-2001-2002-2003-2004-2005-2007-17210-mcb-960-air-filters-systems";

        // Act
        final ObtieneHtml obtieneHtml = new ObtieneHtml();         
        String html = obtieneHtml.obtenerHTML(url);
        
        System.out.println(html);

        // Assert
        assertNotNull(html);
        assertTrue(html.contains("PRODUCT"));
    }
}