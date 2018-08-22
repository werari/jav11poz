package pl.sda.bookstore;

import java.util.Set;

public class BookCollection {

    private final Set<Book> bookCollection;

    public BookCollection(Set<Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public void add(String data){
        String[] splittedText = data.split(",");
        if (splittedText.length == 3 ){
            bookCollection.add(new Book(splittedText[0], splittedText[1],splittedText[2]));
        }else if (splittedText.length == 5){
            bookCollection.add(new Book(splittedText[0], splittedText[1],Double.parseDouble(splittedText[2]),splittedText[3],Double.parseDouble(splittedText[4])));
        }
    }

    public void showAllBooks() {
        for (Book book : bookCollection) {
            System.out.println(book);
        }
    }

    public void removeBook(String s) {
        Book bookToRemove = null;
        for (Book book: bookCollection) {
            if(book.getTitle().equals(s)){
                bookToRemove = book;
            }
        }

        bookCollection.remove(bookToRemove);
    }
}
