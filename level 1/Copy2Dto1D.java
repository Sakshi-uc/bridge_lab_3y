import java.util.Scanner;

public class CopyMatrixToArray{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter rows :");
      int r = sc.nextInt();
      System.out.print("Enter cols :" );
      int c=sc.nextInt();
      int [][] twoD = new int[r][c];
      int [] oneD=new int[r * c];
      int k=0;
      System.out.println("Enter matrix values :");
      for(int i=0;i<r ; i++ ){
         for(int j =0; j<c;j++ ){
            twoD[i][j]=sc.nextInt();
            oneD[k]= twoD[i][j];
            k++ ;
         }
      }
      System.out.println("Flattened array :" );
      for(int x : oneD ){
         System.out.print(x +" ");
      }
      sc.close();
   }
}
