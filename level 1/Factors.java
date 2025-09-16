import java.util.Scanner;

public class Factors{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number :");
      int num=sc.nextInt();
      int max=10;
      int [] fact=new int[max];
      int k=0;
      for(int i=1;i<=num;i++){
         if(num % i==0){
            if(k==max){
               max*=2;
               int [] tmp=new int[max];
               System.arraycopy(fact,0,tmp,0,fact.length);
               fact=tmp;
            }
            fact[k]=i;
            k++;
         }
      }
      System.out.println("Factors of "+num+" :");
      for(int i=0;i<k;i++){
         System.out.print(fact[i]+" ");
      }
      sc.close();
   }
}
