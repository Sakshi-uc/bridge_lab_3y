import java.util.Scanner;

public class TriangularParkRun {
    public static double rounds(double x, double y, double z) {
        double p = x + y + z;
        return 5000 / p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side x: ");
        double x = sc.nextDouble();
        System.out.print("Enter side y: ");
        double y = sc.nextDouble();
        System.out.print("Enter side z: ");
        double z = sc.nextDouble();

        System.out.println("Number of rounds: " + rounds(x, y, z));
    }
}
