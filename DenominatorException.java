public class DenominatorException extends Exception{
   public DenominatorException(){
      super("Denominators cannot be zero.");
   }
   
   public DenominatorException(int den){
      super(den + "is not a valid denominator value.");
   }
   
   public DenominatorException(String message){
      super(message);
   }
}