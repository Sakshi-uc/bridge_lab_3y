package Array_practice_level_2;

import java.util.Scanner;

public class BMIcalc{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter number of persons : ");
      int n=sc.nextInt();
      double [][] data=new double[n][3]; 
      String [] stat=new String[n];
      for(int i=0;i<n;i++){
         System.out.println("Enter height (m) and weight (kg) for person "+(i+1)+":");
         double ht=sc.nextDouble();
         double wt=sc.nextDouble();
         if(ht<=0 || wt<=0){
            System.out.println("Invalid input, try again.");
            i--;
            continue;
         }
         data[i][0]=wt;
         data[i][1]=ht;
         data[i][2]=wt/(ht*ht);
         if(data[i][2]<18.5) stat[i]="Underweight";
         else if(data[i][2]<25) stat[i]="Normal";
         else if(data[i][2]<30) stat[i]="Overweight";
         else stat[i]="Obese";
      }
      for(int j=0;j<n;j++){
         System.out.println("Person "+(j+1)+": Height="+data[j][1]+"m, Weight="+data[j][0]+"kg, BMI="+data[j][2]+", Status="+stat[j]);
      }
      sc.close();
   }
}
