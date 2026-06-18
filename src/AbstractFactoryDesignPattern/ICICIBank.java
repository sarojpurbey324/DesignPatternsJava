package AbstractFactoryDesignPattern;

public class ICICIBank implements Bank {

    private final String bankName;

    public ICICIBank() {
        this.bankName = "ICICI Bank";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
