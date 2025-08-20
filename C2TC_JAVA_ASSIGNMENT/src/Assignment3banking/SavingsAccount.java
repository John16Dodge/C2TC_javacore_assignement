package Assignment3banking;

public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Savings Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Savings Account.");
        } else {
            System.out.println("Withdrawal denied! Minimum balance must be maintained.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
