import java.util.Scanner;

public class StudentVoteChecker {
    public static boolean canStudentVote(int studentAge) {
        if (studentAge < 0) return false;
        return studentAge >= 18;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentAges = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
            System.out.println(canStudentVote(studentAges[i]) ? "Can Vote" : "Cannot Vote");
        }
    }
}
