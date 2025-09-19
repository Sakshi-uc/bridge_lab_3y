import java.util.Scanner;

public class Employee {
    String empName;
    int empId;
    double empSalary;

    Employee(String empName, int empId, double empSalary) {
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
    }

    public void showEmployeeDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Salary: " + empSalary);
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String enteredName = inputScanner.nextLine();

        System.out.print("Enter Employee ID: ");
        int enteredId = inputScanner.nextInt();

        System.out.print("Enter Employee Salary: ");
        double enteredSalary = inputScanner.nextDouble();

        Employee empObj = new Employee(enteredName, enteredId, enteredSalary);
        empObj.showEmployeeDetails();

        inputScanner.close();
    }
}
