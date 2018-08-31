package pl.sda.bookstore.customer;

public class Company extends Customer {
    private final String companyName;
    private final String taxCode;

    public Company(String address, String companyName, String taxCode) {
        super(address);
        this.companyName = companyName;
        this.taxCode = taxCode;
    }
    public String getCompanyName() {
        return companyName;
    }

    public String getTaxCode() {
        return taxCode;
    }
}
