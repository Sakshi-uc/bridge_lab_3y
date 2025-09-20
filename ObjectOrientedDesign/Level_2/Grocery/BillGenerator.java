public class BillGenerator {
    
    public double calculateBill(Customer customerObj) {
        double totalAmount = 0;
        for (Product productObj : customerObj.getProductList()) {
            totalAmount += productObj.getTotalCost();
        }
        return totalAmount;
    }

    public void displayBill(Customer customerObj) {
        System.out.println("Customer Name: " + customerObj.getCustomerName());
        System.out.println("Purchased Products:");

        for (Product productObj : customerObj.getProductList()) {
            System.out.println(" - " + productObj.getProductName() +
                               " (" + productObj.getProductQuantity() + " units at $" +
                               productObj.getUnitPrice() + " per unit) → $" +
                               productObj.getTotalCost());
        }

        System.out.println("Total Bill: $" + calculateBill(customerObj));
    }
}
