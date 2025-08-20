package Assignment3banking;

public class Transaction {
    private final double transactionFee = 10.0; // Fixed fee for all transactions

    public final void performTransaction(Account account, String type, double amount) {
        System.out.println("\nProcessing Transaction: " + type);
        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
            account.withdraw(transactionFee); // Deduct transaction fee
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount + transactionFee);
        } else {
            System.out.println("Invalid Transaction Type!");
        }
        System.out.println("Transaction completed. Current Balance: " + account.getBalance());
    }
}
