package single_responsibility;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void transfer(Account destination, double amount) {
        if (balance >= amount) {
            balance -= amount;
            destination.balance += amount;
        } else {
            throw new RuntimeException("Insufficient balance."  + balance);
        }
    }
}
