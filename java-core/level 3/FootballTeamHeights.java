import java.util.Arrays;

public class FootballTeamHeights {
    static int[] generateRandomHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); // Heights between 150 and 250 cm
        }
        return heights;
    }

    static int sumHeights(int[] arr) {
        int total = 0;
        for (int h : arr) total += h;
        return total;
    }

    static double meanHeight(int[] arr) {
        return arr.length == 0 ? 0.0 : (sumHeights(arr) * 1.0) / arr.length;
    }

    static int minHeight(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    static int maxHeight(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] playerHeights = generateRandomHeights();
        System.out.println("Player Heights (cm): " + Arrays.toString(playerHeights));
        System.out.println("Shortest: " + minHeight(playerHeights) + " cm");
        System.out.println("Tallest : " + maxHeight(playerHeights) + " cm");
        System.out.printf("Mean    : %.2f cm%n", meanHeight(playerHeights));
    }
}
