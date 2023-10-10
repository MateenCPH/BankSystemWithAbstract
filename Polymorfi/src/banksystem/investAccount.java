package banksystem;

public class investAccount extends Account {

    public boolean withdraw(double amount) {
        if (amount > 1000 && amount < 8000000) {
            balance -= amount;
            return true;
        } else {
            return false;
        }

    }


}
