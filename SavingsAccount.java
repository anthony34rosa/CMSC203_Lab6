// SavingsAccount class (extends BankAccount)
public class SavingsAccount extends BankAccount {
    // Instance variable for the annual interest rate (2.5%)
    private double rate = 0.025; // 2.5%

    // Instance variable to keep track of the savings number
    private int savingsNumber = 0;

    // Constructor for the SavingsAccount class
    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance); // Call the constructor of the superclass (BankAccount)
        savingsNumber++; // Increment the savingsNumber for each new SavingsAccount
        setAccountNumber(getAccountNumber() + "-" + savingsNumber); // Update accountNumber using the mutator method
    }

    // Method to calculate and deposit one month's worth of interest into the account
    public void postInterest() {
        double interest = getBalance() * rate / 12;
        deposit(interest);
    }

    // Override the getAccountNumber method from the superclass to include the savings number
    @Override
    public String getAccountNumber() {
        return super.getAccountNumber() + "-" + savingsNumber;
    }

    // Copy constructor to create another savings account for the same person
    public SavingsAccount(SavingsAccount oldAccount, double initialBalance) {
        super(oldAccount, initialBalance); // Call the copy constructor of the superclass (BankAccount)
        savingsNumber = oldAccount.savingsNumber + 1; // Increment the savingsNumber for the new SavingsAccount
        setAccountNumber(getAccountNumber() + "-" + savingsNumber); // Update accountNumber using the mutator method
    }
}
