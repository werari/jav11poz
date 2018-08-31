package pl.sda.bookstore.menu;

import pl.sda.bookstore.Book;

import java.util.Arrays;
import java.util.List;

public class BookManager {
    public static List<Book> createBooks(){
        Book book1 = new Book("Harry Potter1", "J.K.Rowling", 20.50,  "mlodziezowa", 7.5);
        Book book2 = new Book("Harry Potter2", "J.K.Rowling", 21.50,  "mlodziezowa", 6.5);
        Book book3 = new Book("Harry Potter3", "J.K.Rowling", 22.50,  "mlodziezowa", 5.5);
        Book book4 = new Book("Harry Potter4", "J.K.Rowling", 23.50,  "mlodziezowa", 4.5);
        Book book5 = new Book("Harry Potter5", "J.K.Rowling", 24.50,  "mlodziezowa", 3.5);

        List<Book> books = Arrays.asList(book1, book2, book3, book4, book5);
        return books;
    }
}

