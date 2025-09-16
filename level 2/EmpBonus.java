package Array_practice_level_2;

import java.util.Scanner;

public class EmpBonus{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      double [] sal=new double[10];
      double [] yrs=new double[10];
      double [] bn=new double[10];
      double [] upd=new double[10];
      double sumBn=0,oldSum=0,newSum=0;
      for(int i=0;i<10;i++){
         System.out.println("Enter salary & years for emp "+(i+1)+":");
         double s=sc.nextDouble();
         double y=sc.nextDouble();
         if(s<=0||y<0){
            System.out.println("Invalid..reenter");
            i--;
            continue;
         }
         sal[i]=s;
         yrs[i]=y;
      }
      for(int i=0;i<10;i++){
         if(yrs[i]>5) bn[i]=sal[i]*0.05;
         else bn[i]=sal[i]*0.02;
         upd[i]=sal[i]+bn[i];
         sumBn+=bn[i];
         oldSum+=sal[i];
         newSum+=upd[i];
      }
      System.out.println("\nTotal Bonus = "+sumBn);
      System.out.println("Total Old Salary = "+oldSum);
      System.out.println("Total New Salary = "+newSum);
      sc.close();
   }
}
