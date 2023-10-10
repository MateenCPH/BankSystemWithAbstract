package banksystem;

public class CreditAccount extends Account {

    private double maxCredit;

    CreditAccount(double maxCredit) {
        super();
        this.maxCredit = maxCredit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= maxCredit) {
            balance -= amount;
            return true;
        } else {
            return false;

        }
    }
}
