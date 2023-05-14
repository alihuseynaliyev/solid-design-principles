package open_closed;

public class MainAccount implements BankAccount {
    private double balance;

    public MainAccount(double balance) {
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
