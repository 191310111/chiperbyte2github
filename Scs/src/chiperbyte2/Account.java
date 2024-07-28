package chiperbyte2;

public class Account  {
	    private String accountNumber;
	    private double balance;

	    public Account(String accountNumber) {
	        this.accountNumber = accountNumber;
	        this.balance = 0.0;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } else {
	            System.out.println("Invalid amount. Deposit failed.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: $" + amount);
	        } else {
	            System.out.println("Invalid amount or insufficient funds. Withdrawal failed.");
	        }
	    }
	}

