package pl.sda.bookstore.menu;

import pl.sda.bookstore.Book;
import pl.sda.bookstore.BookCollection;

import java.util.*;

public class MainMenu {

    Scanner sc = new Scanner(System.in);
    BookCollection bookCollection = new BookCollection(new HashSet<>());


    public void showMenu() {
        System.out.println("Wybierz menu");
        System.out.println("1. Kolekcja książek");
        System.out.println("2. Magazyn");
        System.out.println("3. Aktualne Zamówienia");
        System.out.println("4. Zamów");
        System.out.println("5. Zakończ");

        switch (sc.nextInt()) {
            case 1:
                BookCollectionMenu bookCollectionMenu = new BookCollectionMenu(sc, bookCollection);
                bookCollectionMenu.showMenu();
                break;
            case 2:
                BookStorageMenu bookStorageMenu = new BookStorageMenu(sc);
                bookStorageMenu.showMenu();
                break;
            case 3:
                BookCurrentOrdersMenu bookCurrentOrdersMenu = new BookCurrentOrdersMenu(sc);
                bookCurrentOrdersMenu.showMenu();
                break;
            case 4:
                BookNewOrderMenu bookNewOrderMenu = new BookNewOrderMenu(sc);
                bookNewOrderMenu.showMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Wybrałeś niewspieraną opcje");
        }
    }

}
