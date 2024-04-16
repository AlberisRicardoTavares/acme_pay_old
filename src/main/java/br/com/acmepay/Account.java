package br.com.acmepay;

import java.math.BigDecimal;

public class Account {

    private int accountNumber;
    private int agencyNumber;
    private BigDecimal balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAgencyNumber(int agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
