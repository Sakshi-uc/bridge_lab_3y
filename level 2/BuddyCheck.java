package Array_practice_level_2;

import java.util.Scanner;

public class BuddyCheck{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String [] nms={"Amar","Akbar","Anthony"};
      int [] age=new int[3];
      double [] ht=new double[3];
      for(int i=0;i<3;i++){
         System.out.println("Give age & height of "+nms[i]+":");
         age[i]=sc.nextInt();
         ht[i]=sc.nextDouble();
      }
      int y=0,t=0;
      for(int i=1;i<3;i++){
         if(age[i]<age[y]) y=i;
         if(ht[i]>ht[t]) t=i;
      }
      System.out.println("Youngest = "+nms[y]);
      System.out.println("Tallest = "+nms[t]);
      sc.close();
   }
}
