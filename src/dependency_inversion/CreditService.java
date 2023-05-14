package dependency_inversion;

public class CreditService {
    CreditCalculator creditCalculator;

    public CreditService(CreditCalculator creditCalculator) {
        this.creditCalculator = creditCalculator;
    }

    public double calculateLoanPayment(double loanAmount, int term, double interestRate){
        return  creditCalculator.calculate(loanAmount,term,interestRate);
    }
}
