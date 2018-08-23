package pl.sda.bookstore;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<Book> books = new ArrayList<>();

    String name;
    String surname;
    String address;

    public Order(String user) {
        String[] split = user.split(",");

        this.name = split[0];
        this.surname = split[1];
        this.address = split[2];
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public int size() {
        return books.size();
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Double price() {
        double sum = 0;
//        return books.get(0).getPrice();
//        books.stream().forEach(a -> {})
        for (Book book : books) {
            sum += book.getPrice();
        }
        return sum;
    }
}
