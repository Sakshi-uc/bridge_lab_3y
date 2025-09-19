import java.util.Scanner;

public class CartItem {
    private String cartItemName;
    private double cartItemPrice;
    private int cartItemQuantity;

    public CartItem(String cartItemName, double cartItemPrice, int cartItemQuantity) {
        this.cartItemName = cartItemName;
        this.cartItemPrice = cartItemPrice;
        this.cartItemQuantity = cartItemQuantity;
    }

    public void addToCart(int quantityToAdd) {
        if (quantityToAdd > 0) {
            this.cartItemQuantity += quantityToAdd;
            System.out.println("Added " + quantityToAdd + " of " + this.cartItemName + " to the cart.");
        } else {
            System.out.println("Quantity to add must be positive.");
        }
    }

    public void removeFromCart(int quantityToRemove) {
        if (quantityToRemove <= 0) {
            System.out.println("Quantity to remove must be positive.");
        } else if (quantityToRemove > this.cartItemQuantity) {
            System.out.println("Cannot remove " + quantityToRemove + " of " + this.cartItemName +
                    ". Only " + this.cartItemQuantity + " in cart.");
        } else {
            this.cartItemQuantity -= quantityToRemove;
            System.out.println("Removed " + quantityToRemove + " of " + this.cartItemName + " from the cart.");
        }
    }

    public double calculateTotalCost() {
        return this.cartItemPrice * this.cartItemQuantity;
    }

    public void showCartDetails() {
        System.out.println("\n--- Current Cart ---");
        System.out.println("Item: " + this.cartItemName);
        System.out.println("Price per item: $" + this.cartItemPrice);
        System.out.println("Quantity: " + this.cartItemQuantity);
        System.out.printf("Total Cost: $%.2f\n", this.calculateTotalCost());
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("--- Setup Your Shopping Cart Item ---");
        System.out.print("Enter item name: ");
        String enteredItemName = inputScanner.nextLine();
        System.out.print("Enter price per item: ");
        double enteredItemPrice = inputScanner.nextDouble();
        System.out.print("Enter initial quantity: ");
        int enteredItemQuantity = inputScanner.nextInt();

        CartItem cartObj = new CartItem(enteredItemName, enteredItemPrice, enteredItemQuantity);
        int menuChoice;

        do {
            cartObj.showCartDetails();
            System.out.println("\n--- Cart Menu ---");
            System.out.println("1. Add items");
            System.out.println("2. Remove items");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            menuChoice = inputScanner.nextInt();

            switch (menuChoice) {
                case 1:
                    System.out.print("Enter quantity to add: ");
                    int qtyToAdd = inputScanner.nextInt();
                    cartObj.addToCart(qtyToAdd);
                    break;
                case 2:
                    System.out.print("Enter quantity to remove: ");
                    int qtyToRemove = inputScanner.nextInt();
                    cartObj.removeFromCart(qtyToRemove);
                    break;
                case 3:
                    System.out.println("Finalizing your cart. Thank you!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (menuChoice != 3);

        cartObj.showCartDetails();
        inputScanner.close();
    }
}
