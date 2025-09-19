public class Problem1 {
    public static void main(String[] args) {
        Employee[] staff = new Employee[] {
            new FullTimeEmployee(1, "Alice", 50000, 5000),
            new PartTimeEmployee(2, "Bob", 300, 120)
        };
        for (Employee emp : staff) {
            emp.displayDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());
            System.out.println("----");
        }
    }
}
abstract class Employee {
    private int empId;
    private String empName;
    private double salaryBase;
    public Employee(int id, String name, double base) {
        this.empId = id;
        this.empName = name;
        this.salaryBase = base;
    }
    public int getEmpId() { return empId; }
    public String getEmpName() { return empName; }
    protected double getSalaryBase() { return salaryBase; }
    public void setSalaryBase(double s) { this.salaryBase = s; }
    public void displayDetails() {
        System.out.println("ID: " + empId + ", Name: " + empName + ", BaseSalary: " + salaryBase);
    }
    public abstract double calculateSalary();
}
class FullTimeEmployee extends Employee {
    private double allowanceMonthly;
    public FullTimeEmployee(int id, String name, double base, double allowance) {
        super(id, name, base);
        this.allowanceMonthly = allowance;
    }
    @Override
    public double calculateSalary() {
        return getSalaryBase() + allowanceMonthly;
    }
}
class PartTimeEmployee extends Employee {
    private double rateHourly;
    private int workedHours;
    public PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, 0);
        this.rateHourly = rate;
        this.workedHours = hours;
    }
    @Override
    public double calculateSalary() {
        return rateHourly * workedHours;
    }
}
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}
