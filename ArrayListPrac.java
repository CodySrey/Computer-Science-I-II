import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPrac{
   public static void main(String[] args){
      ArrayList<Character> vowels = new ArrayList<>();
      
      vowels.add('a');
      vowels.add('u');
      
      System.out.println(vowels);
      System.out.println("There are " + vowels.size() + " elements in the lists");
      
      vowels.add(0, 'e');
      vowels.add(0, 'i');
      
      System.out.println(vowels);
      
      System.out.print(vowels.get(1));
      
      vowels.remove(1);
      System.out.println(vowels);
      
      vowels.remove(vowels.size() - 1);
      System.out.println(vowels);
   }
}