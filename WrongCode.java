import java.util.Scanner;
import java.util.InputMismatchException;

public class WrongCode{
   public static void main(String[] args){
      System.out.print("Enter an numeric value: ");
      Scanner input = new Scanner(System.in);
      try{
         int num = input.nextInt();
         System.out.println("You entered: " + num);
         int[] values = {16, 2, 0, 8};
         System.out.println("The value at index: " + num + "is " + values[num]);
      }
      catch(InputMismatchException Mio){
         System.out.println("Please enter only numeric values.");   
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Error! " + e.getMessage);
      }
      System.out.println("Have a good day");
   }
}
