package inheritance;

public class Driver {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("C291332", 8600000, 2);
        // protected members (fields / methods)
        System.out.println(acc1.getBalance());

        CheckingAccount cacc1 = new CheckingAccount("A23932", 92320, 2, 20000);
        System.out.println(cacc1.getBalance());

        SavingsAccount sacc1 = new SavingsAccount("S23932", 92320, 6);
        System.out.println(sacc1.getBalance());
    }
}
