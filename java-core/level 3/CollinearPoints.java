import java.util.Scanner;

public class CollinearPoints {
    // Check collinearity using area of triangle method
    static boolean arePointsCollinearByArea(double px1, double py1,
                                            double px2, double py2,
                                            double px3, double py3) {
        double triangleArea = 0.5 * (px1 * (py2 - py3) + px2 * (py3 - py1) + px3 * (py1 - py2));
        return Math.abs(triangleArea) < 1e-9;
    }

    // Check collinearity using slope method
    static boolean arePointsCollinearBySlope(double px1, double py1,
                                             double px2, double py2,
                                             double px3, double py3) {
        double lhs = (py2 - py1) * (px3 - px1);
        double rhs = (py3 - py1) * (px2 - px1);
        return Math.abs(lhs - rhs) < 1e-9;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter coordinates of point 1 (x y): ");
        double point1X = inputScanner.nextDouble();
        double point1Y = inputScanner.nextDouble();

        System.out.print("Enter coordinates of point 2 (x y): ");
        double point2X = inputScanner.nextDouble();
        double point2Y = inputScanner.nextDouble();

        System.out.print("Enter coordinates of point 3 (x y): ");
        double point3X = inputScanner.nextDouble();
        double point3Y = inputScanner.nextDouble();

        boolean slopeCollinear = arePointsCollinearBySlope(point1X, point1Y, point2X, point2Y, point3X, point3Y);
        boolean areaCollinear = arePointsCollinearByArea(point1X, point1Y, point2X, point2Y, point3X, point3Y);

        System.out.println("Collinear (slope method)? " + (slopeCollinear ? "Yes" : "No"));
        System.out.println("Collinear (area method)?  " + (areaCollinear ? "Yes" : "No"));
    }
}
