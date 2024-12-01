package ua.edu.ucu.apps.Docs;

public class DocumentDecorator implements Document{
    private Document document;
    public DocumentDecorator(Document doc) {
        this.document = doc;
    }
    @Override
    public String parse(String path) {
        return document.parse(path);
    }
}
