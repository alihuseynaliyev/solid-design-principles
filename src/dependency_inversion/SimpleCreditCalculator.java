package dependency_inversion;

public class SimpleCreditCalculator implements CreditCalculator{
    @Override
    public double calculate(double loanAmount, int term, double interestRate) {
        System.out.println("This is a simple calculator");
        return 100;
    }
}
