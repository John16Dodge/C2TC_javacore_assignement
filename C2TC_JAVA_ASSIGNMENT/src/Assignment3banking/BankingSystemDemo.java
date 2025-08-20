package Assignment3banking;

public class BankingSystemDemo {
    public static void main(String[] args) {
        // Create accounts
        SavingsAccount savings = new SavingsAccount("SAV123", 1000);
        CheckingAccount checking = new CheckingAccount("CHK456", 500);

        // Show total accounts
        System.out.println("Total Accounts Created: " + Bank.getTotalAccounts());

        // Create Transaction object
        Transaction transaction = new Transaction();

        // Perform transactions
        transaction.performTransaction(savings, "deposit", 200);
        transaction.performTransaction(savings, "withdraw", 300);

        transaction.performTransaction(checking, "deposit", 500);
        transaction.performTransaction(checking, "withdraw", 1200);

        // Display account info
        System.out.println("\nFinal Account Details:");
        savings.displayAccountInfo();
        checking.displayAccountInfo();

        System.out.println("\nFinal Total Accounts: " + Bank.getTotalAccounts());
    }
}

