package pl.sda.bookstore.customer;

import java.util.Scanner;

public class CustomerManager {

    public static Customer createCustomer(Scanner scanner) {
        System.out.println("Wybierz:");
        System.out.println("1. Uzytkownik prywatny");
        System.out.println("2.Firma");

        int option = scanner.nextInt();
        scanner.nextInt();

//TODO zaimplementować petle wyboru- zmienna boolean, w while;

        if (option == 1) {
            System.out.println("Proszę podaj imię");
            String name = scanner.nextLine();
            System.out.println("Proszę podaj nazwisko");
            String surname = scanner.nextLine();
            System.out.println("Proszę podaj adres");
            String address = scanner.nextLine();

            return new User(name, surname, address);

        } else if (option == 2) {
            System.out.println("Proszę podaj nazwę Firmy");
            String companyName = scanner.nextLine();
            System.out.println("Proszę podaj NIP");
            String taxCode = scanner.nextLine();
            System.out.println("Proszę podaj adres");
            String address = scanner.nextLine();

            return new Company(companyName, taxCode, address);
        } else {
            System.out.println("Opcja nieobsługiwana");
            return null;

        }
    }
}

