import java.util.Scanner;

public class Item {
    String productCode;
    String productName;
    double productPrice;

    Item(String productName, String productCode, double productPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void showItemDetails() {
        System.out.println("\n--- Item Details ---");
        System.out.println("Item Name: " + productName);
        System.out.println("Item Code: " + productCode);
        System.out.println("Item Price: " + productPrice);
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String enteredName = inputScanner.nextLine();

        System.out.print("Enter Item Code: ");
        String enteredCode = inputScanner.nextLine();

        System.out.print("Enter Item Price: ");
        double enteredPrice = inputScanner.nextDouble();

        Item itemObj = new Item(enteredName, enteredCode, enteredPrice);
        itemObj.showItemDetails();

        inputScanner.close();
    }
}
