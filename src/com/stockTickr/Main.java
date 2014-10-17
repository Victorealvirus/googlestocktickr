package com.stockTickr;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.lang.model.util.Elements;
import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Document doc = null;
        try {
            doc = Jsoup.connect("https://www.google.ca/finance?cid=304466804484872").get();
            String html = doc.html();

            Element element1 = Jsoup.parse(html);

            Gooey abc = new Gooey(element1.select("span.pr").text());

            abc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            abc.setVisible(true);
            abc.setSize(270, 180);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
