import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerName;
    private List<Product> productList = new ArrayList<>();

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product productObj) {
        productList.add(productObj);
    }
}
