
package chiperbyte2;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        String accountNumber;
        double amount;

        while (true) {
            System.out.println("\nBankY Main Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    bank.createAccount(accountNumber);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextDouble();
                    Account accountDeposit = bank.getAccount(accountNumber);
                    if (accountDeposit != null) {
                        accountDeposit.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    Account accountWithdraw = bank.getAccount(accountNumber);
                    if (accountWithdraw != null) {
                        accountWithdraw.withdraw(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter source account number: ");
                    String fromAccount = scanner.next();
                    System.out.print("Enter destination account number: ");
                    String toAccount = scanner.next();
                    System.out.print("Enter amount to transfer: ");
                    amount = scanner.nextDouble();
                    bank.transfer(fromAccount, toAccount, amount);
                    break;
                case 5:
                    System.out.println("Exiting BankY. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
