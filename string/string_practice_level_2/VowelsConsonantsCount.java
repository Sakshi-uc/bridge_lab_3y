package string_practice_level_2;
import java.util.Scanner;
public class VowelsConsonantsCount{
    static boolean checkVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    static int[] countLetters(String text){
        int vowelCount=0,consCount=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(Character.isLetter(ch)){
                if(checkVowel(ch)) vowelCount++;
                else consCount++;
            }
        }
        return new int[]{vowelCount,consCount};
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter text: ");
        String str=scanner.nextLine();
        int[] counts=countLetters(str);
        System.out.println("Vowels: "+counts[0]);
        System.out.println("Consonants: "+counts[1]);
        scanner.close();
    }
}
