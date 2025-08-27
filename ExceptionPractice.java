public class ExceptionPractice{
   public static void main(String[] args) throws IllegalArgumentException{
      System.out.println("one");
      try{
         boolean bad = true;
         boolean moreBad = false;
         if(bad){
            throw new IllegalArgumentException();
         }
         System.out.println("two");
         if(moreBad){
            throw new Exception();
         }
         System.out.println("three");
      }
      catch(IllegalArgumentException e){
         System.out.println("four");
      }
      catch(Exception e){
         System.out.println("six");
      }
         System.out.println("five");

   }
}