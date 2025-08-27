public class ExceptionalRational{
   public static void main(String[] args){
      try{
         Rational r1 = new Rational(2, 3);
         System.out.println(r1);
         
         //Rational r2 = new Rational(2, 0);
         //System.out.println(r2);
         
         Rational r3 = new Rational();
         System.out.println(r3);
      }
      catch(DenominatorException e){
         System.out.println("Error: " + e.getMessage());
      }
   }
}