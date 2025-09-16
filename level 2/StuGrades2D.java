package Array_practice_level_2;

import java.util.Scanner;

public class StuGrades2D{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter number of students : ");
      int n=sc.nextInt();
      double [][] marks=new double[n][3];
      double [] perc=new double[n];
      char [] grd=new char[n];
      for(int i=0;i<n;i++){
         System.out.println("Enter marks for Physics, Chemistry, Maths of student "+(i+1)+":");
         for(int j=0;j<3;j++){
            double m=sc.nextDouble();
            if(m<0){
               System.out.println("Invalid marks, re-enter.");
               j--; continue;
            }
            marks[i][j]=m;
         }
         perc[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3;
         if(perc[i]>=90) grd[i]='A';
         else if(perc[i]>=75) grd[i]='B';
         else if(perc[i]>=50) grd[i]='C';
         else grd[i]='D';
      }
      for(int k=0;k<n;k++){
         System.out.println("Student "+(k+1)+" : % = "+perc[k]+", Grade = "+grd[k]);
      }
      sc.close();
   }
}
