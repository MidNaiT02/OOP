package Problem3;

public class BankTest {

    public static void main(String[] args) {

        Bank bank = new Bank();

        SavingsAccount savings = new SavingsAccount(1001, 5);
        CheckingAccount checking = new CheckingAccount(2001);

        bank.addAccount(savings);
        bank.addAccount(checking);

        // Deposits
        savings.deposit(1000);
        checking.deposit(500);

        // Multiple transactions
        checking.withdraw(50);
        checking.deposit(100);
        checking.withdraw(30);
        checking.deposit(20);

        // Transfer
        savings.transfer(200, checking);

        System.out.println("Before update:");
        bank.printAccounts();

        // Apply interest and fees
        bank.update();

        System.out.println("\nAfter update:");
        bank.printAccounts();

        // Remove account
        bank.removeAccount(2001);

        System.out.println("\nAfter removing checking account:");
        bank.printAccounts();
    }
}