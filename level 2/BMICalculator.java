import java.util.Scanner;

public class NumDivider{
   public static void main(String[] args){
      Scanner s=new Scanner(System.in);
      System.out.print("Enter a natural number: ");
      int num=s.nextInt();
      if(num<=0){
         System.out.println("Error: give a natural number");
         return;
      }
      int [] oddList=new int[num/2+1];
      int [] evenList=new int[num/2+1];
      int o=0,e=0;
      for(int i=1;i<=num;i++){
         if(i%2==0){
            evenList[e++]=i;
         }else{
            oddList[o++]=i;
         }
      }
      System.out.println("Odd numbers:");
      for(int j=0;j<o;j++){
         System.out.print(oddList[j]+" ");
      }
      System.out.println("\nEven numbers:");
      for(int k=0;k<e;k++){
         System.out.print(evenList[k]+" ");
      }
      s.close();
   }
}
