// Account.java for qap 1
// By Brian Jackman
// 09/24/2024

public class Account {
    // Private fields for account ID, name, and balance
    private String id;
    private String name;
    private int balance = 0;

    // Constructor to initialize account with ID and name
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor to initialize account
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Get method for account ID
    public String getID() {
        return id;
    }

    // Get method for account name
    public String getName() {
        return name;
    }

    // Get method for account balance
    public int getBalance() {
        return balance;
    }

    // Method to credit an amount to the account balance
    public int credit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    // Method to debit an amount from the account balance
    public int debit(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Method to transfer an amount from this account to another account
    public int transferTo(Account another, int amount) {
        if (amount > 0 && amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Override toString() method to provide a string representation of the account
    @Override
    public String toString() {
        return String.format("Account[id=%s, name=%s, balance=%d]", id, name, balance);
    }
}