import java.util.Scanner;

public class HandBook {
    String handBookTitle;
    String handBookAuthor;
    double handBookPrice;
    
    HandBook(String handBookTitle, String handBookAuthor, double handBookPrice) {
        this.handBookTitle = handBookTitle;
        this.handBookAuthor = handBookAuthor;
        this.handBookPrice = handBookPrice;
    }
    
    public void showHandBookDetails() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title of the book: " + handBookTitle);
        System.out.println("Author of the book: " + handBookAuthor);
        System.out.println("Price of the book: " + handBookPrice);
    }
    
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Enter Book Title: ");
        String enteredBookTitle = inputScanner.nextLine();
        
        System.out.print("Enter Book Author: ");
        String enteredBookAuthor = inputScanner.nextLine();
        
        System.out.print("Enter Book Price: ");
        double enteredBookPrice = inputScanner.nextDouble();
        
        HandBook handBookObj = new HandBook(enteredBookTitle, enteredBookAuthor, enteredBookPrice);
        handBookObj.showHandBookDetails();
        
        inputScanner.close();
    }
}
