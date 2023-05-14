package open_closed;

public class Main {
    public static void main(String[] args) {
        var mainAccount = new MainAccount(100);
        System.out.println(mainAccount.getBalance());

        var balanceUpdater = new BalanceUpdater();
        balanceUpdater.updateBalance(mainAccount, 200);
        System.out.println("Updated balance: " + mainAccount.getBalance());

    }
}
