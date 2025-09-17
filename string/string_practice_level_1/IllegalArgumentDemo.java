package string_practice_level_1;

public class IllegalArgumentDemo{
   public static void main(String[] args){
      try{
         String txt="abcdef";
         System.out.println(txt.substring(5,2));
      }catch(IllegalArgumentException ex){
         System.out.println("Caught IllegalArgumentException : "+ex.getMessage());
      }
   }
}
