package inheritance;

// why am I getting this error?
// - because my superclass has non-default constructor!
//   ex) BackAccount(String accountNumber, ...) {}
// - every instance of subclasses has to call super class' constructor (super());
//   "There's no CheckingAccount without BankAccount"
public class CheckingAccount extends BankAccount {
    private long limit;

    public CheckingAccount(String accountNumber, double balance,
                           int bankCode, long limit) {
        // YOU MUST HAVE THIS! super()
        super(accountNumber, balance, bankCode);
        this.limit = limit;
    }

    public final long getLimit() {
        return limit;
    }

    public final void setLimit(long limit) {
        this.limit = limit;
    }
}
