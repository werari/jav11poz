package pl.sda.bookstore.menu;

import org.junit.jupiter.api.Test;
import pl.sda.bookstore.Book;
import pl.sda.bookstore.BookCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.jupiter.api.Assertions.*;

class BookCollectionTest {

    @Test
    public void test() {
        //given
        Set<Book> bookCollection = new HashSet<>();
        BookCollection collecion = new BookCollection(bookCollection);
        //when
        collecion.add("tytul, autor, typ");
        collecion.add("tytul, autor,33.33,typ,9.0");
        //then
        assertEquals(2, bookCollection.size());
    }

    @Test
    public void test2() {

        Set<Book> bookCollection = ConcurrentHashMap.newKeySet();
        BookCollection collection2 = new BookCollection(bookCollection);

        collection2.add("tytul, autor, typ");
        collection2.add("tytul-do-usuniecia, autor, typ");
        collection2.removeBook("tytul-do-usuniecia");
        assertEquals(1, bookCollection.size());


    }
}