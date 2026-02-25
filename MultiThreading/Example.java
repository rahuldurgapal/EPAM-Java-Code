import java.util.Scanner;
class Account {

    private int bal;

    public Account(int bal) {
        this.bal = bal;
    }

    public boolean isSufficientBalance(int amt) {
        if(bal>amt) {
            return true;
        }

        return false;
    }

    public void withdraw(int amt) {
        bal = bal-amt;
        System.out.println("Withdraw Money is: " +amt);
        System.out.println("Your Current balance is: " +bal);
    }
}


class Customer implements Runnable {

    private Account account;
    private String name;

    public Customer (Account account, String name) {
       this.account = account;
       this.name = name;
    }


    public void run() {

        Scanner sc = new Scanner(System.in);

        synchronized(account) {
        System.out.println(name + " enter ammount to withdraw");
        int amt = sc.nextInt();
        if(account.isSufficientBalance(amt)) {
            System.out.println(name);
            account.withdraw(amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    }
}

public class Example {

    public static void main(String[] args) {

        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1,"Raj");
        Customer c2 = new Customer(a1,"Simran");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}