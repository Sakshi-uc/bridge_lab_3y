package Array_practice_level_2;

import java.util.Scanner;

public class DigFreq{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number : ");
      int n=sc.nextInt();
      int [] count=new int[10];
      while(n!=0){
         int d=n%10;
         count[d]++ ;
         n/=10;
      }
      System.out.println("Digit frequencies :");
      for(int i=0;i<10;i++){
         if(count[i]>0){
            System.out.println("Digit "+i+" -> "+count[i]);
         }
      }
      sc.close();
   }
}
