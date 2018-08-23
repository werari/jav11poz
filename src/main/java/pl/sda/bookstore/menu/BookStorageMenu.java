package pl.sda.bookstore.menu;

import java.util.Scanner;

public class BookStorageMenu {
    private final Scanner sc;

    public BookStorageMenu(Scanner sc) {
        this.sc = sc;
    }

    public void showMenu() {
        while(true) {
            System.out.println("1. Zwiększ stan magazynowy książki. Podaj: tytuł, autor, ilość");
            System.out.println("2. Zmniejsz stan magazynowy książki. Podaj: tytuł, autor, ilość");
            System.out.println("3. Wyświetl wszystkie książki ze stanem 0");
            System.out.println("4. Wyświetl wszystkie książki ze stanem poniżej 10");
            System.out.println("5. Powrót");

            switch (sc.nextInt()) {
                case 1:
                    sc.nextLine();
                    break;
                case 2:
                    sc.nextLine();
                    break;
                case 3:
                    sc.nextLine();
                    break;
                case 4:
                    sc.nextLine();
                    break;
                case 5:
                    return;
            }
        }
    }
}
