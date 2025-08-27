import java.util.Random;

public class RandomDice{
   public static void main(String[] args){
      try{
      Random rand = new Random();
         int die1 = rand.nextInt(6)+1;
         int die2 = rand.nextInt(6)+1;
      
         System.out.print("You rolled " + die1 + " and " + die2 + ".");
      
      }
      catch(DiceRollException e){
         throw new DiceRollException();
      }
   }
}