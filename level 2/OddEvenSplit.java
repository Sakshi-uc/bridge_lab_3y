import java.util.Scanner;

public class OddEvenSplit{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a natural number : ");
      int n=sc.nextInt();
      if(n<=0){
         System.out.println("Error: number must be natural");
         return;
      }
      int [] odds=new int[n/2+1];
      int [] evens=new int[n/2+1];
      int oc=0,ec=0;
      for(int i=1;i<=n;i++){
         if(i%2==0) evens[ec++]=i;
         else odds[oc++]=i;
      }
      System.out.println("Odd numbers :");
      for(int j=0;j<oc;j++) System.out.print(odds[j]+" ");
      System.out.println("\nEven numbers :");
      for(int k=0;k<ec;k++) System.out.print(evens[k]+" ");
      sc.close();
   }
}
