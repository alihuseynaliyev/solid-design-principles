package liskov_substitution;

public class Main {
    public static void main(String[] args) {
        var mainBankAccount = new MainBankAccount(10); // SecondaryBankAccount
        System.out.println(mainBankAccount.getBalance());
        mainBankAccount.deposit(1020);
        System.out.println(mainBankAccount.getBalance());
    }
}
