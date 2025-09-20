import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weightKg, double heightCm) {
        double heightMeters = heightCm / 100.0;
        return weightKg / (heightMeters * heightMeters);
    }

    public static String bmiStatus(double bmiValue) {
        if (bmiValue < 18.5) return "Underweight";
        else if (bmiValue < 25) return "Normal";
        else if (bmiValue < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][3];
        String[] bmiStatuses = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            double height = sc.nextDouble();

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = calculateBMI(weight, height);
            bmiStatuses[i] = bmiStatus(personData[i][2]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + " - Weight: " + personData[i][0] +
                               "kg, Height: " + personData[i][1] +
                               "cm, BMI: " + personData[i][2] +
                               ", Status: " + bmiStatuses[i]);
        }
    }
}
