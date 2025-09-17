package string_practice_level_1;

import java.util.Scanner;

public class LowercaseDemo {
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);

      System.out.print("Type some text : ");
      String input=in.nextLine();

      String converted="";
      for(int k=0;k<input.length();k++){
         char c=input.charAt(k);
         if(c>='A' && c<='Z'){
            converted+=(char)(c+32);
         }else{
            converted+=c;
         }
      }

      String libResult=input.toLowerCase();

      System.out.println("Manual way -> "+converted);
      System.out.println("Library way -> "+libResult);
   }
}
