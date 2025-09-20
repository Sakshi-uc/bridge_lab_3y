import java.util.Scanner;

public class FactorsProgram {
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) factors[index++] = i;
        return factors;
    }

    public static int sumOfFactors(int[] factorArr) {
        int sum = 0;
        for (int factor : factorArr) sum += factor;
        return sum;
    }

    public static int productOfFactors(int[] factorArr) {
        int product = 1;
        for (int factor : factorArr) product *= factor;
        return product;
    }

    public static int sumSquaresOfFactors(int[] factorArr) {
        int sum = 0;
        for (int factor : factorArr) sum += factor * factor;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] factors = getFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Sum of factors = " + sumOfFactors(factors));
        System.out.println("Product of factors = " + productOfFactors(factors));
        System.out.println("Sum of squares of factors = " + sumSquaresOfFactors(factors));
    }
}
