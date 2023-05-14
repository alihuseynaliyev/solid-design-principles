package interface_segregation.bad;

public interface BankAccount {
    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();

    double getInterestRate();

    double getWithdrawalFee();

    boolean isOverdraftAvailable();
}
