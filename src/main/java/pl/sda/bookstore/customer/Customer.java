package pl.sda.bookstore.customer;

public abstract class Customer {
    private final String address;

    public Customer(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

}
