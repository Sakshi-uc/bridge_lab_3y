import java.util.Scanner;

public class MultiTable{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number :");
      int n=sc.nextInt();
      int [] tab=new int[10];
      for(int j=1;j<=10;j++){
         tab[j-1]=n*j;
      }
      for(int k=0;k<tab.length;k++){
         System.out.println(n+" * "+(k+1)+" = "+tab[k]);
      }
      sc.close();
   }
}
