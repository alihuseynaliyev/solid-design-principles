package interface_segregation.good;

public interface BankAccount {
    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();
}