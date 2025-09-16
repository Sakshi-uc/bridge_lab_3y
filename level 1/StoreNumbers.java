import java.util.Scanner;

public class NumSplit{
   public static void main(String[] args){
      Scanner inp=new Scanner(System.in);
      System.out.print("Enter a natural number : ");
      int val=inp.nextInt();
      if(val<=0){
         System.out.println("Error : must be natural number");
         return;
      }
      int [] oddArr=new int[val/2+1];
      int [] evenArr=new int[val/2+1];
      int oc=0,ec=0;
      for(int x=1;x<=val;x++){
         if(x%2==0){
            evenArr[ec++]=x;
         }else{
            oddArr[oc++]=x;
         }
      }
      System.out.println("Odd nums :");
      for(int a=0;a<oc;a++){
         System.out.print(oddArr[a]+" ");
      }
      System.out.println("\nEven nums :");
      for(int b=0;b<ec;b++){
         System.out.print(evenArr[b]+" ");
      }
      inp.close();
   }
}
