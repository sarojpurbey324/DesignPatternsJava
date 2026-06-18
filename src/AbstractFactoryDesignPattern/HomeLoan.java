package AbstractFactoryDesignPattern;

public class HomeLoan extends Loan {

    @Override
    void getInterestRate(Double r) {
        rate = r;
    }
}
