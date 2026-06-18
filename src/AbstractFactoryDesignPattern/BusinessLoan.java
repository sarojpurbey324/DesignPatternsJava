package AbstractFactoryDesignPattern;

public class BusinessLoan extends Loan {

    @Override
    void getInterestRate(Double r) {
        rate = r;
    }
}
