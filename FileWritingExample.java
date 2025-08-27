import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileWritingExample{
   public static void main(String[] args){
   //PrintWriter writer = null;
   try(FileWriter outFile = new FileWriter("phones.txt", true);
      PrintWriter writer = new PrintWriter(outFile)){
      //FileWriter outFile = new FileWriter("phones.txt", true);
      //writer = new PrintWriter(outFile);
      
      writer.println("Jenny\t867-5309");
      writer.println("B-52s\t606-0842");
      writer.println("Time\t777-9311");

   }
   catch(IOException e){
         System.out.println(e.getMessage());
      }
   /*finally{
         if(writer != null){
            writer.close();
         }   
      }*/
   }
}