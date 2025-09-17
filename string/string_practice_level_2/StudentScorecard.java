package string_practice_level_2;

import java.util.Scanner;

public class StudentScorecard {

    static int[][] genScores(int studentCount) {
        int[][] marks = new int[studentCount][3];
        for (int i = 0; i < studentCount; i++) {
            marks[i][0] = 40 + (int)(Math.random() * 61);
            marks[i][1] = 40 + (int)(Math.random() * 61);
            marks[i][2] = 40 + (int)(Math.random() * 61);
        }
        return marks;
    }

    static double[][] calcStats(int[][] marks) {
        double[][] details = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = Math.round(total / 3.0 * 100.0) / 100.0;
            double perc = Math.round(total * 100.0 / 300 * 100.0) / 100.0;
            details[i][0] = total;
            details[i][1] = avg;
            details[i][2] = perc;
        }
        return details;
    }

    static String[] calcGrades(double[][] details) {
        String[] gradeList = new String[details.length];
        for (int i = 0; i < details.length; i++) {
            double perc = details[i][2];
            if (perc >= 80) gradeList[i] = "A";
            else if (perc >= 70) gradeList[i] = "B";
            else if (perc >= 60) gradeList[i] = "C";
            else if (perc >= 50) gradeList[i] = "D";
            else if (perc >= 40) gradeList[i] = "E";
            else gradeList[i] = "R";
        }
        return gradeList;
    }

    static void showScorecard(int[][] marks, double[][] details, String[] gradeList) {
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-8s %-6s%n",
                "Physics","Chem","Maths","Total","Average","Percent","Grade");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-8d %-8d %-8d %-8.0f %-8.2f %-8.2f %-6s%n",
                    marks[i][0], marks[i][1], marks[i][2],
                    details[i][0], details[i][1], details[i][2], gradeList[i]);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int count = reader.nextInt();

        int[][] marks = genScores(count);
        double[][] details = calcStats(marks);
        String[] grades = calcGrades(details);

        showScorecard(marks, details, grades);
        reader.close();
    }
}
