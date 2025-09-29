package bank;

import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<String> transactions;

    public Account() {
        balance = 0.0;
        transactions = new ArrayList<>();
        transactions.add("Account created with balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: " + amount);
            System.out.println("**** Deposited successful! ****");
        } else {
            System.out.println("**** Deposit amount must be positive. ****");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add("Withdrew: " + amount);
            System.out.println("**** Withdrawen successful! ****");
        } else {
            System.out.println("**** Invalid withdrawal amount. ****");
        }
    }

    public void showBalance() {
        System.out.println("---- Current Balance: " + balance + " ----");
    }

    public void showTransactions() {
        System.out.println("**** Transaction History ****");
        for (String t : transactions) {
            System.out.println(t);
        }
        System.out.println("*****************************");
    }
}
