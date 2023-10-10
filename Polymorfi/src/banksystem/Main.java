package banksystem;

public class Main {
    public static void main(String[] args) {





//        Account b = new Account();
//        a.deposit(100);
//        System.out.println("Account a: " + a.getBalance());
//        System.out.println("Account b: " + b.getBalance());
        Bank bank = new Bank();
//        bank.transfer(a, b, 50);
//        System.out.println("Account a: " + a.getBalance());
//        System.out.println("Account b: " + b.getBalance());

        Account p = new PenguinAccount();
        p.deposit(100);
        System.out.println("Penguin account: " + p.getBalance());
        p.withdraw(200);
        System.out.println("Penguin account: " + p.getBalance());
        p.withdraw(50);
        System.out.println("Penguin account: " + p.getBalance());

        Account c = new CreditAccount(-10000);
        System.out.println("Credit: " + c.getBalance());
        c.withdraw(20000);
        System.out.println("Credit account: " + c.getBalance());
        c.withdraw(7000);
        System.out.println("Credit account: " + c.getBalance());

        Account v = new VipAccount();
        System.out.println("VipAccount: " + v.getBalance());
        v.deposit(3000000);
        System.out.println("VipAccount: " + v.getBalance());
        v.withdraw(100000);
        System.out.println("VipAccount: " + v.getBalance());

    }
}