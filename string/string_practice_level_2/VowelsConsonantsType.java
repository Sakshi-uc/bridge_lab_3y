package string_practice_level_2;
import java.util.Scanner;
public class VowelsConsonantsType{
    static String getCharType(char ch){
        if(!Character.isLetter(ch)) return "Not a Letter";
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return "Vowel";
        return "Consonant";
    }
    static String[][] analyze(String text){
        String[][] table=new String[text.length()][2];
        for(int i=0;i<text.length();i++){
            table[i][0]=String.valueOf(text.charAt(i));
            table[i][1]=getCharType(text.charAt(i));
        }
        return table;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter text: ");
        String input=scanner.nextLine();
        String[][] result=analyze(input);
        System.out.printf("%-5s %-12s%n","Char","Type");
        for(String[] row:result) System.out.printf("%-5s %-12s%n",row[0],row[1]);
        scanner.close();
    }
}
