package open_closed;

public class OtherAccount implements BankAccount {
    double balance;

    public OtherAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void updateBalance(double amount) {
        balance += amount;
    }
}
