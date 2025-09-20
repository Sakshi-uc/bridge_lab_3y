import java.util.Scanner;

public class MobilePhone {
    String phoneBrand;
    String phoneModel;
    double phonePrice;
    
    MobilePhone(String phoneBrand, String phoneModel, double phonePrice){
        this.phoneBrand = phoneBrand;
        this.phoneModel = phoneModel;
        this.phonePrice = phonePrice;
    }
    
    public void showMobileDetails() {
        System.out.println("\n--- Mobile Phone Details ---");
        System.out.println("Brand: " + phoneBrand);
        System.out.println("Model: " + phoneModel);
        System.out.println("Price: " + phonePrice);
    }
    
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Enter mobile brand: ");
        String enteredBrand = inputScanner.nextLine();
        
        System.out.print("Enter mobile model: ");
        String enteredModel = inputScanner.nextLine();
        
        System.out.print("Enter mobile price: ");
        double enteredPrice = inputScanner.nextDouble();
        
        MobilePhone mobileObj = new MobilePhone(enteredBrand, enteredModel, enteredPrice);
        mobileObj.showMobileDetails();
        
        inputScanner.close();
    }
}
