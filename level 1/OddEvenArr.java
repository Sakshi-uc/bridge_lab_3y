import java.util.Scanner;

public class OddEvenArr{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a natural number :");
      int n=sc.nextInt();
      if(n<=0){
         System.out.println("Error : enter a natural number.");
         return;
      }
      int [] odd=new int[n/2+1];
      int [] even=new int[n/2+1];
      int oi=0,ei=0;
      for(int j=1;j<=n;j++){
         if(j%2==0){
            even[ei++]=j;
         }else{
            odd[oi++]=j;
         }
      }
      System.out.println("Odd numbers :");
      for(int k=0;k<oi;k++){
         System.out.print(odd[k]+" ");
      }
      System.out.println("\nEven numbers :");
      for(int m=0;m<ei;m++){
         System.out.print(even[m]+" ");
      }
      sc.close();
   }
}
