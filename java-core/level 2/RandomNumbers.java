public class RandomNumbers {
    // Generate an array of 4-digit random numbers
    public static int[] generateRandom4DigitArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int)(Math.random() * 9000);
        }
        return numbers;
    }

    // Calculate average, minimum, and maximum of the array
    public static double[] calculateAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generateRandom4DigitArray(5);
        System.out.print("Generated Numbers: ");
        for (int n : randomNumbers) System.out.print(n + " ");
        System.out.println();

        double[] stats = calculateAverageMinMax(randomNumbers);
        System.out.println("Average = " + stats[0]);
        System.out.println("Minimum = " + stats[1]);
        System.out.println("Maximum = " + stats[2]);
    }
}
