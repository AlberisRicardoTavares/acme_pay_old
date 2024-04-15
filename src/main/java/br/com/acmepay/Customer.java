package br.com.acmepay;

import java.util.List;

public class Customer {

    public String customerDocument;
    public List<Account> customerAccounts;
    public String customerName;
    public String customerEmail;
    public String customerPhone;

    public String getCustomerDocument() {
        return customerDocument;
    }

    public List<Account> getCustomerAccounts() {
        return customerAccounts;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerDocument(String customerDocument) {
        this.customerDocument = customerDocument;
    }

    public void setCustomerAccounts(List<Account> customerAccounts) {
        this.customerAccounts = customerAccounts;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
