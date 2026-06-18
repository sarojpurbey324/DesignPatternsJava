package AbstractFactoryDesignPattern;

public class EducationLoan extends Loan {

    @Override
    void getInterestRate(Double r) {
        rate = r;
    }
}
