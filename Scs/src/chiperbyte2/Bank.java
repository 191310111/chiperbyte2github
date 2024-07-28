package chiperbyte2;
	import java.util.HashMap;
	import java.util.Map;

	public class Bank {
	    private Map<String, Account> accounts;

	    public Bank() {
	        accounts = new HashMap<>();
	    }
	    public void createAccount(String accountNumber) {
	        if (!accounts.containsKey(accountNumber)) {
	            Account newAccount = new Account(accountNumber);
	            accounts.put(accountNumber, newAccount);
	            System.out.println("Account created: " + accountNumber);
	        } else {
	            System.out.println("Account already exists.");
	        }
	    }

	    public Account getAccount(String accountNumber) {
	        return accounts.get(accountNumber);
	    }

	    public void transfer(String fromAccount, String toAccount, double amount) {
	        Account src = accounts.get(fromAccount);
	        Account dest = accounts.get(toAccount);
	        if (src != null && dest != null && amount > 0 && src.getBalance() >= amount) {
	            src.withdraw(amount);
	            dest.deposit(amount);
	            System.out.println("Transferred: $" + amount + " from " + fromAccount + " to " + toAccount);
	        } else {
	            System.out.println("Invalid transfer. Please check account details and balance.");
	        }
	    }
	}

