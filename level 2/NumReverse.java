package Array_practice_level_2;

import java.util.Scanner;

public class NumReverse{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number : ");
      int n=sc.nextInt();
      int temp=n;
      int cnt=0;
      while(temp!=0){
         temp/=10;
         cnt++;
      }
      int [] digs=new int[cnt];
      for(int i=cnt-1;i>=0;i--){
         digs[i]=n%10;
         n/=10;
      }
      System.out.println("Reversed number :");
      for(int j=digs.length-1;j>=0;j--) System.out.print(digs[j]);
      sc.close();
   }
}
