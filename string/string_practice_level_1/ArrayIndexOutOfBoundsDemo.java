package string_practice_level_1;

public class ArrayIndexOutOfBoundsDemo{
   public static void main(String[] args){
      try{
         String [] arr={"A","B","C"};
         System.out.println(arr[5]); 
      }catch(ArrayIndexOutOfBoundsException ex){
         System.out.println("Caught ArrayIndexOutOfBoundsException : "+ex.getMessage());
      }
   }
}
