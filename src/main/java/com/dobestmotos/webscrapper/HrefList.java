package com.dobestmotos.webscrapper;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HrefList {

    public List<String> getList(final String html) {

        List<String> hrefList = new ArrayList<>();
        Document doc = Jsoup.parse(html);
        Elements links = doc.select("a[href]");
        for (Element link : links) {
            if (link.hasClass("product_a pitem")) {
                hrefList.add(link.attr("href"));
            }
        }
        
        System.out.println(hrefList);
        return hrefList;
    }
}