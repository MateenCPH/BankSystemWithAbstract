package banksystem;

public class Bank {


    public boolean transfer(Account from, Account to, double amount) {
        if (from.withdraw(amount)) {
            to.deposit(amount);
            return true;
        } else {
            return false;
        }

    }
}
