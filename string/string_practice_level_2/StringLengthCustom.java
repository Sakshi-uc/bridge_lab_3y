package string_practice_level_2;

import java.util.Scanner;

public class StringLengthCustom {
    static int findLen(String txt) {
        int counter = 0;
        try {
            while (true) {
                txt.charAt(counter);
                counter++;
            }
        } catch (Exception ex) {
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String data = reader.next();
        int calcLen = findLen(data);
        int libLen = data.length();
        System.out.println("Custom Length: " + calcLen);
        System.out.println("Built-in Length: " + libLen);
        reader.close();
    }
}
