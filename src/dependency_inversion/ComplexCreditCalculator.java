package dependency_inversion;

public class ComplexCreditCalculator implements CreditCalculator{
    @Override
    public double calculate(double loanAmount, int term, double interestRate) {
        System.out.println("This is complex calculator");
        return 10000;
    }
}
