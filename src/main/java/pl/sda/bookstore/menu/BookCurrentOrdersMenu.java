package pl.sda.bookstore.menu;

import java.util.Scanner;

public class BookCurrentOrdersMenu {
    private final Scanner sc;

    public BookCurrentOrdersMenu(Scanner sc) {
        this.sc = sc;
    }

    public void showMenu() {
        while(true) {
            System.out.println("1. Pobierz zamówienie do realizacji");
            System.out.println("2. Usuń zamówienie z listy");
            System.out.println("3. Powrót");

            switch (sc.nextInt()) {
                case 1:
                    sc.nextLine();
                    break;
                case 2:
                    sc.nextLine();
                    break;
                case 3:
                    return;
            }
        }
    }
}
