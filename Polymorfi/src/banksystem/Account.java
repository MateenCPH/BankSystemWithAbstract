package banksystem;

public abstract class Account {
    protected double balance = 0.0;

    public double getBalance() {
        return balance;
    }


    public abstract boolean withdraw(double amount);



    public void deposit(double amount) {
        balance += amount;
    }

}
