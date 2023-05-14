package open_closed;

public class BalanceUpdater implements AccountUpdater {

    public void updateBalance(BankAccount bankAccount, double amount) {
        bankAccount.updateBalance(amount);
    }
}
