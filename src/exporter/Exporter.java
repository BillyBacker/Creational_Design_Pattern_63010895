package exporter;

import java.util.Set;
import Book.Book;

public interface Exporter {
    public String getMetadataString(Set<Book> books);
}
