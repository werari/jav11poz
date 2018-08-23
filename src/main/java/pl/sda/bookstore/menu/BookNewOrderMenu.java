package pl.sda.bookstore.menu;

import java.util.Scanner;

public class BookNewOrderMenu {
    private final Scanner sc;

    public BookNewOrderMenu(Scanner sc) {
        this.sc = sc;
    }


    public void showMenu() {
        System.out.println("Podaj swoje dane w formacie: imię, nazwisko, adres");
        sc.nextLine();
//TODO tutaj należy dodać sobie jakieś inicjalizowanie zamówienia na podstawie wprowadzonych danych

        while (true) {
        System.out.println("1. Znajdz książkę - przejdź do nowego menu");
        System.out.println("2. Dodaj książkę do zamówienie - podaj tytuł, autor");
        System.out.println("3. Usuń książkę z zamówienia");
        System.out.println("4. Wybierz opcje wysyłki");
        System.out.println("5. Dodaj kod rabatowy");
        System.out.println("6. Oblicz cenę");
        System.out.println("7. Zamów");
        System.out.println("8. Anuluj i wróć");


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
                    sc.nextLine();
                    break;
                case 6:
                    sc.nextLine();
                    break;
                case 7:
                    sc.nextLine();
                    break;
                case 8:
                    return;
            }
        }
    }
}
