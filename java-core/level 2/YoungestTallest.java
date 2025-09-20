import java.util.Scanner;

public class YoungestTallest {
    public static int getYoungestIndex(int[] ages) {
        int youngestIdx = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIdx]) youngestIdx = i;
        }
        return youngestIdx;
    }

    public static int getTallestIndex(int[] heights) {
        int tallestIdx = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIdx]) tallestIdx = i;
        }
        return tallestIdx;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] personNames = {"Amar", "Akbar", "Anthony"};
        int[] personAges = new int[3];
        int[] personHeights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + personNames[i] + ": ");
            personAges[i] = scanner.nextInt();
            System.out.print("Enter height of " + personNames[i] + ": ");
            personHeights[i] = scanner.nextInt();
        }

        System.out.println("Youngest: " + personNames[getYoungestIndex(personAges)]);
        System.out.println("Tallest: " + personNames[getTallestIndex(personHeights)]);
    }
}
