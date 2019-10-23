package inheritance;

public class SavingsAccount extends BankAccount {
    private int transactions;

    public SavingsAccount(String accountNumber, int bankCode, int transactions) {
        super(accountNumber, bankCode);
        this.setBalance(0);
        this.transactions = transactions;
    }

    public final int getTransactions() {
        return transactions;
    }

    public final void setTransactions(int transactions) {
        this.transactions = transactions;
    }
}
