import java.util.Scanner;

public class SimpleInterest {
    public static double calculate(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();

        double si = calculate(principal, rate, time);
        System.out.println("Simple Interest: " + si);
    }
}
