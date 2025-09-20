import java.util.Scanner;

public class LeapYear {
    public static boolean checkLeapYear(int inputYear) {
        if (inputYear < 1582) return false;
        return (inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int yearEntered = scanner.nextInt();

        if (checkLeapYear(yearEntered)) System.out.println("Leap Year");
        else System.out.println("Not a Leap Year");
    }
}
