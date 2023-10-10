package banksystem;

public class VipAccount extends Account {

    @Override
    public boolean withdraw(double amount) {
        if (amount < 1000000) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
