package Problem3;

public class Account {

    private double balance;
    private int accNumber;

    public Account(int accNumber) {
        this.accNumber = accNumber;
        this.balance = 0.0;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            balance += sum;
        }
    }

    public void withdraw(double sum) {

        if (sum > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= sum;
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {

        if (amount <= balance) {
            withdraw(amount);
            other.deposit(amount);
        } else {
            System.out.println("Transfer failed: insufficient funds.");
        }
    }

    @Override
    public String toString() {
        return "Account " + accNumber + " Balance: " + balance;
    }

    public final void print() {
        System.out.println(toString());
    }
}