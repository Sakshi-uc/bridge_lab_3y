package Array_practice_level_2;

import java.util.Scanner;

public class StuGrades{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter number of students : ");
      int n=sc.nextInt();
      double [] phy=new double[n];
      double [] chem=new double[n];
      double [] math=new double[n];
      double [] perc=new double[n];
      char [] grd=new char[n];
      for(int i=0;i<n;i++){
         System.out.println("Enter marks for Physics, Chemistry, Maths of student "+(i+1)+":");
         double p=sc.nextDouble();
         double c=sc.nextDouble();
         double m=sc.nextDouble();
         if(p<0||c<0||m<0){
            System.out.println("Invalid marks, re-enter.");
            i--;
            continue;
         }
         phy[i]=p; chem[i]=c; math[i]=m;
         perc[i]=(p+c+m)/3;
         if(perc[i]>=90) grd[i]='A';
         else if(perc[i]>=75) grd[i]='B';
         else if(perc[i]>=50) grd[i]='C';
         else grd[i]='D';
      }
      for(int j=0;j<n;j++){
         System.out.println("Student "+(j+1)+" : % = "+perc[j]+", Grade = "+grd[j]);
      }
      sc.close();
   }
}
