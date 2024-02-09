class BankAccount {
    private static int totalAccounts = 0; // Static variable to keep track of the total number of bank accounts
    private double balance;

    public BankAccount(double initialDeposit) {
        this.balance = initialDeposit;
        totalAccounts++; // Increment the total number of accounts when a new account is created
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts; // Static method to access the total number of accounts
    }
}

public class StaticBank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000.0);
        BankAccount account2 = new BankAccount(2000.0);
        BankAccount account3 = new BankAccount(500.0);

        // Deposit and withdraw operations on accounts
        account1.deposit(500.0);
        account2.withdraw(1000.0);
        account3.deposit(200.0);

        // Get the balances of accounts
        System.out.println("Account 1 Balance: $" + account1.getBalance());
        System.out.println("Account 2 Balance: $" + account2.getBalance());
        System.out.println("Account 3 Balance: $" + account3.getBalance());

        // Get the total number of accounts using the static method
        int totalAccounts = BankAccount.getTotalAccounts();
        System.out.println("Total Accounts: " + totalAccounts);
    }
}
