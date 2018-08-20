package pl.sda.bookstore.menu;

import pl.sda.bookstore.Book;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BookCollectionMenu {

    private final Scanner sc;
    private final Set<Book>bookCollection;

    BookCollectionMenu(Scanner sc, Set<Book> bookCollection){
        this.sc = sc;
        this.bookCollection = bookCollection;
    }

    public void showMenu(){
        System.out.println("1. Dodaj ksiażkę w formacie: tytył, autor, cena, typ, ocena");
        System.out.println("2. Dodaj ksiażkę w formacie: tytył, autor, typ");
        System.out.println("3. Pokaż kolekcje ksiażek");
        System.out.println("4. Usuń ksiażkę - podaj tytuł");

        switch(sc.nextInt()){
            case 1:
                sc.nextLine();
                String dataFromUser = sc.nextLine();
                String[] splittedText = dataFromUser.split(",");
                bookCollection.add(new Book(splittedText[0], splittedText[1], Double.parseDouble(splittedText[2]), splittedText[3], Double.parseDouble(splittedText[4])));
                break;
            case 2:
                sc.nextLine();
                String dataFromUser2 = sc.nextLine();
                String[] splittedText2 = dataFromUser2.split(",");
                bookCollection.add(new Book(splittedText2[0], splittedText2[1], splittedText2[2]));
                break;
            case 3:
                sc.nextLine();
                for (Book book : bookCollection) {
                    System.out.println(book);
                }
            case 4:
                sc.nextLine();
                String titleToRemove = sc.nextLine();
                Book bookToRemove;
                for (Book book: bookCollection) {
                    if(book.getTitle().equals(titleToRemove)){
                        bookToRemove = book;
                        bookCollection.remove(bookToRemove);
                    }
                }
        }
    }
}
