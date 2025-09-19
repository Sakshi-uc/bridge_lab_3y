import java.util.Scanner;

public class BankAccount {
    private String holderName;
    private String accountId;
    private double accountBalance;

    public BankAccount(String holderName, String accountId, double accountBalance) {
        this.holderName = holderName;
        this.accountId = accountId;
        this.accountBalance = accountBalance;
    }

    public void depositAmount(double depositValue) {
        if (depositValue > 0) {
            accountBalance += depositValue;
            System.out.println("Successfully deposited: $" + depositValue);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdrawAmount(double withdrawValue) {
        if (withdrawValue <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (withdrawValue > accountBalance) {
            System.out.println("Insufficient balance for this withdrawal.");
        } else {
            accountBalance -= withdrawValue;
            System.out.println("Successfully withdrew: $" + withdrawValue);
        }
    }

    public void showBalance() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountId);
        System.out.println("Current Balance: $" + accountBalance);
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("--- Welcome to the Bank ---");
        System.out.print("Enter account holder's name: ");
        String enteredName = inputScanner.nextLine();
        System.out.print("Enter account number: ");
        String enteredAccountId = inputScanner.nextLine();
        System.out.print("Enter initial balance: ");
        double enteredBalance = inputScanner.nextDouble();

        BankAccount userAccount = new BankAccount(enteredName, enteredAccountId, enteredBalance);
        int menuChoice;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            menuChoice = inputScanner.nextInt();

            switch (menuChoice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositValue = inputScanner.nextDouble();
                    userAccount.depositAmount(depositValue);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawValue = inputScanner.nextDouble();
                    userAccount.withdrawAmount(withdrawValue);
                    break;
                case 3:
                    userAccount.showBalance();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (menuChoice != 4);

        inputScanner.close();
    }
}
