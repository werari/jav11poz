package pl.sda.bookstore.menu;

import java.util.Scanner;

public class MainMenu {

    Scanner sc = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Wybierz menu");
        System.out.println("1. Kolekcja książek");
        System.out.println("2. Magazyn");
        System.out.println("3. Aktualne Zamówienia");
        System.out.println("4. Zamów");
        System.out.println("5. Zakończ");

        switch (sc.nextInt()) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Wybrałeś niewspieraną opcje");
        }
    }

}
