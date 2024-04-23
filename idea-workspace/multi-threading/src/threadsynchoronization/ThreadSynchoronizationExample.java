package threadsynchoronization;

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

public class ThreadSynchoronizationExample {

    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount(0);

        // Create two threads that deposit money into the same account
        DepositThread thread1 = new DepositThread(account, 1000);
        DepositThread thread2 = new DepositThread(account, 5000);

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Display the final balance
        System.out.println("Final Balance: $" + account.getBalance());

    }


}
