package Problem3;

public class CheckingAccount extends Account {

    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;

    public CheckingAccount(int accNumber) {
        super(accNumber);
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFee() {

        if (transactionCount > FREE_TRANSACTIONS) {

            double fee = (transactionCount - FREE_TRANSACTIONS) * 0.02;

            super.withdraw(fee);
        }

        transactionCount = 0;
    }

    @Override
    public String toString() {
        return "CheckingAccount " + getAccountNumber()
                + " Balance: " + getBalance()
                + " Transactions: " + transactionCount;
    }
}