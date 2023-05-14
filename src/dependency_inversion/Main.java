package dependency_inversion;

public class Main {
    public static void main(String[] args) {
        var creditService = new CreditService(new ComplexCreditCalculator()); // just change Complex to Simple
        creditService.calculateLoanPayment(100, 12, 20);
    }
}
