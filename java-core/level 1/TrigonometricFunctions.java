import java.util.Scanner;

public class TrigFunctions {
    public static double[] trigValues(double deg) {
        double rad = Math.toRadians(deg);
        return new double[]{Math.sin(rad), Math.cos(rad), Math.tan(rad)};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double deg = sc.nextDouble();

        double[] vals = trigValues(deg);
        System.out.println("Sine: " + vals[0]);
        System.out.println("Cosine: " + vals[1]);
        System.out.println("Tangent: " + vals[2]);
    }
}
