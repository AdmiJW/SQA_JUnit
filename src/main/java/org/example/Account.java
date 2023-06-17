package org.example;

public class Account {
    private int accountNumber;
    private int pin;
    private double totalBalance;

    public Account(int accountNumber, int pin, double totalBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.totalBalance = totalBalance;
    }

    public boolean validatePin(int pin) {
        return this.pin == pin;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void credit(double amount) {
        totalBalance += amount;
    }

    public void debit(double amount) {
        totalBalance -= amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
