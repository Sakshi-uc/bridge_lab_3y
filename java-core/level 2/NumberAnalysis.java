import java.util.Scanner;

public class NumberAnalysis {
    // Check if a number is positive or zero
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Compare two numbers: return 1 if first>second, 0 if equal, -1 if first<second
    public static int compareNumbers(int first, int second) {
        if (first > second) return 1;
        else if (first == second) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input numbers and check positivity and parity
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            if (!isPositive(numbers[i])) {
                System.out.println("Negative");
            } else {
                System.out.print("Positive ");
                System.out.println(isEven(numbers[i]) ? "Even" : "Odd");
            }
        }

        // Compare first and last number
        int comparisonResult = compareNumbers(numbers[0], numbers[4]);
        if (comparisonResult == 0) System.out.println("First and last numbers are equal");
        else if (comparisonResult > 0) System.out.println("First number > Last number");
        else System.out.println("First number < Last number");
    }
}
