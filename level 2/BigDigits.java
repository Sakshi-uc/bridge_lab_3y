package Array_practice_level_2;

import java.util.Scanner;

public class BigDigits{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number: ");
      int n=sc.nextInt();
      int [] digs=new int[10];
      int k=0;
      while(n!=0 && k<10){
         digs[k++]=n%10;
         n/=10;
      }
      int big=0,sec=0;
      for(int i=0;i<k;i++){
         if(digs[i]>big){
            sec=big;
            big=digs[i];
         }else if(digs[i]>sec && digs[i]!=big){
            sec=digs[i];
         }
      }
      System.out.println("Largest digit : "+big);
      System.out.println("Second largest : "+sec);
      sc.close();
   }
}
