package Assignment3banking;

public class Bank {
    private static int totalAccounts = 0; // Shared among all Bank objects

    public static void incrementAccounts() {
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
