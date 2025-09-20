import java.util.*;

public class EmployeeBonus {
    // Generate random salaries and years of service for n employees
    static double[][] generateEmployeeData(int numEmployees) {
        double[][] data = new double[numEmployees][2]; // [salary, yearsOfService]
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + (int) (Math.random() * 90000); // Salary 10,000–99,999
            data[i][1] = (int) (Math.random() * 16); // Years 0–15
        }
        return data;
    }

    // Calculate new salaries and bonuses based on years of service
    static double[][] computeNewSalariesAndBonuses(double[][] employeeData) {
        int n = employeeData.length;
        double[][] result = new double[n][2]; // [newSalary, bonus]
        for (int i = 0; i < n; i++) {
            double salary = employeeData[i][0];
            int serviceYears = (int) employeeData[i][1];
            double bonusRate = serviceYears > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void main(String[] args) {
        int employeeCount = 10;
        double[][] originalData = generateEmployeeData(employeeCount);
        double[][] updatedData = computeNewSalariesAndBonuses(originalData);

        double sumOldSalary = 0, sumNewSalary = 0, sumBonus = 0;

        System.out.printf("%-4s %-10s %-6s %-12s %-12s%n", "ID", "OldSalary", "Years", "NewSalary", "Bonus");
        for (int i = 0; i < employeeCount; i++) {
            double oldSalary = originalData[i][0];
            double years = originalData[i][1];
            double newSalary = updatedData[i][0];
            double bonus = updatedData[i][1];

            sumOldSalary += oldSalary;
            sumNewSalary += newSalary;
            sumBonus += bonus;

            System.out.printf("%-4d %-10.0f %-6.0f %-12.0f %-12.0f%n", i + 1, oldSalary, years, newSalary, bonus);
        }

        System.out.println("-----------------------------------------------------");
        System.out.printf("Total Old Salary: %.0f | Total New Salary: %.0f | Total Bonus: %.0f%n",
                sumOldSalary, sumNewSalary, sumBonus);
    }
}
