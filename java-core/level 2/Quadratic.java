import java.util.Scanner;

public class Quadratic {
    // Calculate roots of quadratic equation ax^2 + bx + c = 0
    public static double[] calculateRoots(double coeffA, double coeffB, double coeffC) {
        double discriminant = coeffB * coeffB - 4 * coeffA * coeffC;
        if (discriminant < 0) return new double[]{}; // No real roots
        else if (discriminant == 0) return new double[]{ -coeffB / (2 * coeffA) }; // One real root
        else {
            double sqrtDisc = Math.sqrt(discriminant);
            return new double[]{
                (-coeffB + sqrtDisc) / (2 * coeffA),
                (-coeffB - sqrtDisc) / (2 * coeffA)
            };
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double[] roots = calculateRoots(a, b, c);
        if (roots.length == 0) System.out.println("No real roots exist.");
        else {
            for (int i = 0; i < roots.length; i++) {
                System.out.println("Root " + (i + 1) + ": " + roots[i]);
            }
        }
    }
}
