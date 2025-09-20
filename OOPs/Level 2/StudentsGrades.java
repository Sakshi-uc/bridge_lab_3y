import java.util.Scanner;

public class StudentsGrades {
    String studentName;
    String studentRoll;
    double[] subjectMarks;

    StudentsGrades(String studentName, String studentRoll, double[] subjectMarks) {
        this.studentName = studentName;
        this.studentRoll = studentRoll;
        this.subjectMarks = subjectMarks;
    }

    public String findGrade(double[] subjectMarks) {
        double avgMarks = calculateAverage(subjectMarks);

        if (avgMarks >= 80) {
            return "Grade A";
        } else if (avgMarks >= 60) {
            return "Grade B";
        } else if (avgMarks >= 50) {
            return "Grade C";
        } else if (avgMarks >= 40) {
            return "Grade D";
        } else {
            return "Grade F";
        }
    }

    public void showStudentReport() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + studentRoll);
        System.out.println("Marks:");
        for (int i = 0; i < subjectMarks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + subjectMarks[i]);
        }
        System.out.println("Final Grade: " + findGrade(subjectMarks));
    }

    public double calculateAverage(double[] subjectMarks) {
        double total = 0;
        for (int i = 0; i < subjectMarks.length; i++) {
            total += subjectMarks[i];
        }
        return total / subjectMarks.length;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String enteredName = inputScanner.nextLine();

        System.out.print("Enter Roll Number: ");
        String enteredRoll = inputScanner.nextLine();

        double[] enteredMarks = new double[3];
        System.out.println("Enter marks for 3 subjects:");
        for (int i = 0; i < enteredMarks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            enteredMarks[i] = inputScanner.nextDouble();
        }

        StudentsGrades studentObj = new StudentsGrades(enteredName, enteredRoll, enteredMarks);
        studentObj.showStudentReport();

        inputScanner.close();
    }
}
