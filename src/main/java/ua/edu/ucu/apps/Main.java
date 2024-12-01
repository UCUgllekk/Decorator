package ua.edu.ucu.apps;

import ua.edu.ucu.apps.Docs.CachedDocument;
import ua.edu.ucu.apps.Docs.Document;
import ua.edu.ucu.apps.Docs.SmartDocument;
import ua.edu.ucu.apps.Docs.TimedDocument;

public class Main {
    public static void main(String[] args) {
        Document doc = new TimedDocument(new SmartDocument());
        doc.parse("test.jpg");
        System.out.println(doc.parse("test.jpg"));
        System.out.println(new SmartDocument().parse("test.jpg"));
        Document docC = new CachedDocument(new SmartDocument());
        System.out.println(docC.parse("test.jpg"));
    }
}