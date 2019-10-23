package inheritance;

import java.util.Objects;

public class BankAccount {
    private String accountNumber;
    private double balance;
    protected int bankCode;

    // constructor (overloading)
    public BankAccount() {
        this.accountNumber = "";
        this.balance = 0.0;
        this.bankCode = 0;
    }

    public BankAccount(String accountNumber, int bankCode) {
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, double balance, int bankCode) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankCode = bankCode;
    }

    public final double getBalance() {
        return balance;
    }

    public final void setBalance(double balance) {
        this.balance = balance;
    }

    public final String getAccountNumber() {
        return accountNumber;
    }

    public final void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return this.accountNumber;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        // down-casting
//        BankAccount that = (BankAccount) obj;
//        return this.accountNumber.equals(that.accountNumber);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // memory address comparing
        if (o == null || getClass() != o.getClass()) return false; // type comparing
        BankAccount that = (BankAccount) o;
        return Objects.equals(accountNumber, that.accountNumber); // compare value
    }

}
