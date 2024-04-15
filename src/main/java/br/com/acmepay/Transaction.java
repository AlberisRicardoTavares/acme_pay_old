package br.com.acmepay;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Transaction {

    public UUID transactionId;
    public BigDecimal transactionValue;
    public int destinationAccount;
    public int originAccount;
    public LocalDate transactionDate;
    public int accountId;

    public UUID getTransactionId() {
        return transactionId;
    }

    public BigDecimal getTransactionValue() {
        return transactionValue;
    }

    public int getDestinationAccount() {
        return destinationAccount;
    }

    public int getOriginAccount() {
        return originAccount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public void setTransactionValue(BigDecimal transactionValue) {
        this.transactionValue = transactionValue;
    }

    public void setDestinationAccount(int destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public void setOriginAccount(int originAccount) {
        this.originAccount = originAccount;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
}
