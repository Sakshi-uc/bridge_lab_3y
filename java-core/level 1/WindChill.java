import java.util.Scanner;

public class WindChill {
    public static double calculateWindChill(double tempValue, double windSpeedValue) {
        return 35.74 + 0.6215 * tempValue + (0.4275 * tempValue - 35.75) * Math.pow(windSpeedValue, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();
        System.out.print("Enter wind speed: ");
        double windSpeed = sc.nextDouble();

        System.out.println("Wind chill temperature: " + calculateWindChill(temperature, windSpeed));
    }
}
