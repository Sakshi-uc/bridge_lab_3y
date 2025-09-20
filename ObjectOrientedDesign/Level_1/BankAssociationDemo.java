import java.util.*;

class Customer {
    private String customerName;
    private double accountBalance;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public void depositAmount(double depositValue) {
        accountBalance += depositValue;
    }

    public void showBalance() {
        System.out.println(customerName + "'s Balance: " + accountBalance);
    }

    public String getCustomerName() {
        return customerName;
    }
}

class Bank {
    private String bankTitle;
    private List<Customer> customerList = new ArrayList<>();

    public Bank(String bankTitle) {
        this.bankTitle = bankTitle;
    }

    public void createAccount(Customer customerObj, double initialDeposit) {
        customerList.add(customerObj);
        customerObj.depositAmount(initialDeposit);
        System.out.println(customerObj.getCustomerName() + " opened account in " + bankTitle + " with " + initialDeposit);
    }
}

public class BankAssociationDemo {
    public static void main(String[] args) {
        Bank bankObj = new Bank("SBI");

        Customer customerOne = new Customer("Ravi");
        Customer customerTwo = new Customer("Neha");

        bankObj.createAccount(customerOne, 5000);
        bankObj.createAccount(customerTwo, 8000);

        customerOne.showBalance();
        customerTwo.showBalance();
    }
}

