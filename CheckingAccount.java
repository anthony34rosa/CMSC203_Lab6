
// CheckingAccount class (extends BankAccount)
public class CheckingAccount extends BankAccount {
    // Static constant for the cost of clearing one check
    private static final double FEE = 0.15; // 15 cents

    // Constructor for the CheckingAccount class
    public CheckingAccount(String name, double initialBalance) {
        super(name, initialBalance); // Call the constructor of the superclass (BankAccount)
        setAccountNumber(getAccountNumber() + "-10"); // Update accountNumber using the mutator method
    }

    // Override the withdraw method from the superclass
    @Override
    public boolean withdraw(double amount) {
        // Add the check clearing fee to the amount to withdraw
        double totalAmount = amount + FEE;

        // Check if there are enough funds in the account to complete the transaction
        if (totalAmount <= getBalance()) {
            // Call the withdraw method from the superclass to perform the transaction
            return super.withdraw(totalAmount);
        }

        // Transaction failed due to insufficient funds
        return false;
    }
}
