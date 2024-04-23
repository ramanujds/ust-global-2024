package threadsynchoronization;

import java.util.SortedMap;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized method to perform a deposit
    public synchronized void deposit(double amount) {
        double newBalance = balance + amount;
        // Simulate some processing time
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance = newBalance;
        System.out.println("Deposited "+amount);
        System.out.println("New Balance : "+newBalance);
        notifyAll();
    }

    public synchronized void withdraw(double amount) throws InterruptedException {
        if (balance < amount) {
            System.out.println("Insufficient Balance");
            System.out.println("Waiting for deposit");
            wait();
        }
        if (balance < amount) {
            System.out.println("Sorry still Insufficient Balance");
            return;
        }

        double newBalance = balance - amount;
        // Simulate some processing time
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Withdrawn "+amount);
        balance = newBalance;
        System.out.println("New Balance : "+newBalance);
    }


    public double getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private double depositAmount;

    public DepositThread(BankAccount account, double depositAmount) {
        this.account = account;
        this.depositAmount = depositAmount;
    }

    public void run() {

        account.deposit(depositAmount);


    }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private double withdrawAmount;

    public WithdrawThread(BankAccount account, double withdrawAmount) {
        this.account = account;
        this.withdrawAmount = withdrawAmount;
    }

    public void run() {

        try {
            account.withdraw(withdrawAmount);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

public class ThreadSynchoronizationExample {

    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount(0);

        // Create two threads that deposit money into the same account
        DepositThread thread1 = new DepositThread(account, 1000);
        DepositThread thread2 = new DepositThread(account, 2000);

        // Start the threads
        thread1.start();
        thread2.start();

        WithdrawThread w1 = new WithdrawThread(account, 4000);
        w1.start();

        // Wait for both threads to finish


        // Display the final balance
 //       System.out.println("Final Balance: $" + account.getBalance());

    }


}
