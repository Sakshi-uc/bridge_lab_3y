import java.util.*;

class Product {
    private String productName;
    private double productPrice;

    public Product(String productName, double productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName(){ return productName; }
    public double getProductPrice(){ return productPrice; }
}

class Order {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product p){ productList.add(p); }

    public void showOrder(){
        System.out.println("Order contains:");
        for(Product p: productList) {
            System.out.println(" - " + p.getProductName() + " $" + p.getProductPrice());
        }
    }
}

class Customer {
    private String customerName;

    public Customer(String name){ this.customerName = name; }

    public void placeOrder(Order o){
        System.out.println(customerName + " placed an order:");
        o.showOrder();
    }
}

public class EcommerceAggregationDemo {
    public static void main(String[] args) {
        Customer customer = new Customer("Ravi");
        Order order = new Order();
        order.addProduct(new Product("Laptop", 50000));
        order.addProduct(new Product("Mouse", 800));

        customer.placeOrder(order);
    }
}
