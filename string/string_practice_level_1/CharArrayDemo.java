package string_practice_level_1;

import java.util.Scanner;

public class CharArrayDemo{

   public static char[] makeCharArr(String s){
      char [] arr=new char[s.length()];
      for(int i=0;i<s.length();i++){
         arr[i]=s.charAt(i);
      }
      return arr;
   }

   public static boolean sameArr(char[] x,char[] y){
      if(x.length!=y.length) return false;
      for(int j=0;j<x.length;j++){
         if(x[j]!=y[j]) return false;
      }
      return true;
   }

   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a string : ");
      String str=sc.next();
      char [] arr1=makeCharArr(str);
      char [] arr2=str.toCharArray();
      System.out.println("Are both arrays equal ? "+sameArr(arr1,arr2));
      sc.close();
   }
}
