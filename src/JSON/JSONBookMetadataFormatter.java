package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import Book.Book;

import Book.BookMetadataFormatter;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONArray jsons;

    public JSONBookMetadataFormatter() {
        reset();
    }
    @Override
    public BookMetadataFormatter reset() {
        jsons = new JSONArray();
        // Please implement this method. You may create additional methods as you see fit.
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject json = new JSONObject();
        json.put(Book.Metadata.AUTHORS, b.getAuthors());
        json.put(Book.Metadata.ISBN, b.getISBN());
        json.put(Book.Metadata.PUBLISHER, b.getPublisher());
        json.put(Book.Metadata.TITLE, b.getTitle());
        jsons.add(json);
        return this;
    }

    @Override
    public String getMetadataString() {
        return jsons.toString();
    }
}
