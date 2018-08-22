package pl.sda.bookstore;

import java.util.Map;

public class BookStorage {

    private final Map<Book, Integer> storage;

    public BookStorage(Map<Book, Integer> storage) {
        this.storage = storage;
    }

    public void updateBookCount(Book book, int diff) {
        storage.put(book, storage.get(book) + diff);
    }
}
