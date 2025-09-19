public class Problem6 {
    public static void main(String[] args) {
        FoodItem[] foodOrder = new FoodItem[] {
            new VegItem("Paneer Butter Masala", 250, 2),
            new NonVegItem("Chicken Curry", 300, 1)
        };
        for (FoodItem food : foodOrder) {
            System.out.println(food.getItemDetails() + " Total: " + food.calculateTotalPrice());
            if (food instanceof Discountable) {
                System.out.println("After Discount: " + ((Discountable)food).applyDiscount());
            }
            System.out.println("----");
        }
    }
}

abstract class FoodItem {
    private String foodName;
    private double foodPrice;
    private int foodQty;

    public FoodItem(String foodName, double foodPrice, int foodQty) { 
        this.foodName = foodName; 
        this.foodPrice = foodPrice; 
        this.foodQty = foodQty; 
    }
    public String getFoodName(){ return foodName; }
    public double getFoodPrice(){ return foodPrice; }
    public int getFoodQty(){ return foodQty; }
    public String getItemDetails(){ return foodName+" x"+foodQty+" @"+foodPrice; }
    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name,double price,int qty){ super(name,price,qty); }
    @Override
    public double calculateTotalPrice(){ return getFoodPrice() * getFoodQty(); }
    @Override
    public double applyDiscount(){ return calculateTotalPrice() * 0.1; } // 10% off
    @Override
    public String getDiscountDetails(){ return "Veg discount 10%"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name,double price,int qty){ super(name,price,qty); }
    @Override
    public double calculateTotalPrice(){ return getFoodPrice() * getFoodQty() + 50; } // extra charge
    @Override
    public double applyDiscount(){ return calculateTotalPrice() * 0.05; } // 5%
    @Override
    public String getDiscountDetails(){ return "Non-veg discount 5%"; }
}
