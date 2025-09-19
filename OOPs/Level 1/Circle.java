import java.util.Scanner;

public class Circle {
    double circleRadius;

    Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public void calculateArea() {
        System.out.printf("Area of circle: %.4f", (Math.PI * circleRadius * circleRadius));
    }

    public void calculateCircumference() {
        System.out.printf("\nCircumference of circle: %.4f ", (2 * Math.PI * circleRadius));
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double enteredRadius = inputScanner.nextDouble();

        Circle circleObj = new Circle(enteredRadius);

        System.out.println("\n--- Circle Calculations ---");
        circleObj.calculateArea();
        circleObj.calculateCircumference();

        inputScanner.close();
    }
}
