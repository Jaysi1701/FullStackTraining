// ===============================
// day11pp/Account.java
// Problem 2 - Debit Method
// ===============================
package day11pp;

public class Account {
    private double balance;

    public Account(double balance) {
        if (balance > 0)
            this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Debit amount exceeded account balance.");
        }
    }
}