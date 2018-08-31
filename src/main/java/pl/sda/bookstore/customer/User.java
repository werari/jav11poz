package pl.sda.bookstore.customer;

public class User extends Customer {
    private final String name;
    private final String surname;

    public User(String address, String name, String surname) {
        super(address);
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
