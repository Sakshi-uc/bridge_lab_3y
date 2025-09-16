import java.util.Scanner;

public class MeanHeight{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      double [] h=new double[11];
      double total=0;
      System.out.println("Enter the heights of 11 players :");
      for(int i=0;i<h.length;i++){
         h[i]=sc.nextDouble();
         total+=h[i];
      }
      double avg= total / h.length;
      System.out.println("Mean height of the football team : "+avg);
      sc.close();
   }
}
