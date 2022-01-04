package C2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

// A program to extract text from a specific html tag
public class HTML_extraction {
    public static void main(String[] args) {
        String html ="<body>"+
                "<div>"+
                "<p>Transaction Successful</p>"+
                "<p>Trnx ID: TXN5164870</p>"+
                "</div>"+
                "</body>"+
                "</html>";
        Document doc = Jsoup.parse(html);
        Element elem = doc.select("p").last();
        String text = elem.text();
        System.out.println(text);
    }
}
