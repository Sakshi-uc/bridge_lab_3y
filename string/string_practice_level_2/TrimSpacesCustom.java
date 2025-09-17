package string_practice_level_2;
import java.util.Scanner;
public class TrimSpacesCustom{
    static String removeSpaces(String text){
        int left=0,right=text.length()-1;
        while(left<=right && text.charAt(left)==' ') left++;
        while(right>=left && text.charAt(right)==' ') right--;
        return text.substring(left,right+1);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String input=scanner.nextLine();
        String customTrim=removeSpaces(input);
        String builtinTrim=input.trim();
        System.out.println("Custom Trim: '"+customTrim+"'");
        System.out.println("Built-in Trim: '"+builtinTrim+"'");
        scanner.close();
    }
}
