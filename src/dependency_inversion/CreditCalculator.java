package dependency_inversion;

public interface CreditCalculator {
    double calculate(double loanAmount, int term, double interestRate);
}
