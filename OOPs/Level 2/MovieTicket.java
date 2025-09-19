import java.util.Scanner;

public class MovieTicket {
    private String ticketMovieName;
    private String ticketSeatNumber;
    private double ticketPrice;
    private boolean ticketBooked;

    MovieTicket(String ticketMovieName) {
        this.ticketMovieName = ticketMovieName;
        this.ticketSeatNumber = "Not Assigned";
        this.ticketPrice = 0.0;
        this.ticketBooked = false;
    }

    public void bookTicket(String chosenSeatNumber, double chosenPrice) {
        if (ticketBooked) {
            System.err.println("Sorry, this ticket has already been booked!");
        } else {
            this.ticketSeatNumber = chosenSeatNumber;
            this.ticketPrice = chosenPrice;
            this.ticketBooked = true;
            System.out.println("\n✅ Ticket booked successfully!");
        }
    }

    public void showTicketDetails() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie: " + this.ticketMovieName);
        if (this.ticketBooked) {
            System.out.println("Seat Number: " + this.ticketSeatNumber);
            System.out.println("Price: $" + this.ticketPrice);
            System.out.println("Status: Booked");
        } else {
            System.out.println("Status: Not Booked Yet");
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Enter the movie name: ");
        String enteredMovieName = inputScanner.nextLine();
        
        MovieTicket ticketObj = new MovieTicket(enteredMovieName);
        ticketObj.showTicketDetails(); 
        
        System.out.print("\nEnter seat number to book (e.g., F5): ");
        String enteredSeatNumber = inputScanner.nextLine();
        
        System.out.print("Enter the price: ");
        double enteredPrice = inputScanner.nextDouble();
        
        ticketObj.bookTicket(enteredSeatNumber, enteredPrice);
        ticketObj.showTicketDetails();
        
        inputScanner.close();
    }
}
