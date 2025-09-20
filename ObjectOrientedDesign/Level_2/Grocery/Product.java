public class Product {
    private String productName;
    private double productQuantity;
    private double unitPrice;

    public Product(String productName, double productQuantity, double unitPrice) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductQuantity() {
        return productQuantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalPrice() {
        return productQuantity * unitPrice;
    }
}
