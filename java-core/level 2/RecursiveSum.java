import java.util.Scanner;

public class RecursiveSum {
    // Calculate sum of first n natural numbers recursively
    public static int sumRecursive(int number) {
        if (number == 0) return 0;
        return number + sumRecursive(number - 1);
    }

    // Calculate sum using formula
    public static int sumFormula(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        int recursiveResult = sumRecursive(n);
        int formulaResult = sumFormula(n);

        System.out.println("Sum using recursion: " + recursiveResult);
        System.out.println("Sum using formula: " + formulaResult);
        System.out.println("Both results are " + (recursiveResult == formulaResult ? "equal" : "not equal"));
    }
}
