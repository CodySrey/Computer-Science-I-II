public class DiceRollException extends Exception{
   public DiceRollException(){
      super("Dice has rolled an invalid number. Please roll again.");
   }
   
   public DiceRollException(int die1){
      super(die1 + "is not a valid dice roll.");
   }
   
   public DiceRollException(int die2){
      super(die2 + "is not a valid dice roll.");
   }
   
      
   public DiceRollException(String message){
      super(message);
   }
}