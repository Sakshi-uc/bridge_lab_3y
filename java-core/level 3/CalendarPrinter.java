import java.util.*;

public class CalendarPrinter {
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static String getMonthName(int month) {
        String[] months = {"", "January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        return (month >= 1 && month <= 12) ? months[month] : "Invalid";
    }

    static int getDaysInMonth(int month, int year) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month];
    }

    // Sakamoto's algorithm (0=Sunday..6=Saturday)
    static int getFirstDayOfMonth(int year, int month) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) year -= 1;
        return (year + year/4 - year/100 + year/400 + t[month-1] + 1) % 7;
    }

    static void printCalendar(int month, int year) {
        System.out.printf("%s %d%n", getMonthName(month), year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(year, month);
        int daysInMonth = getDaysInMonth(month, year);

        for (int i = 0; i < firstDay; i++) System.out.print("    ");

        int day = 1, weekDay = firstDay;
        while (day <= daysInMonth) {
            System.out.printf("%3d ", day);
            weekDay = (weekDay + 1) % 7;
            if (weekDay == 0) System.out.println();
            day++;
        }
        if (weekDay != 0) System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        printCalendar(month, year);
    }
}
