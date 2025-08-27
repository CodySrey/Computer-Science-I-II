import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SerializationExample{
   public static void main(String[] args){
      try{
         Course myCourse = new Course("CS2", "Java Class");
      
         FileOutputStream fileStream = new FileOutputStream("Objects.dat");
         ObjectsOutputStream objOutFile = new ObjectOutputStream(fileStream);
      
         objOutFile.writtenObject(myCourse);
      }
      catch(FileNotFoundException e){
         System.out.println(e.getMessage());
      }
      catch(IOException e){
         System.out.println(e.getMessage());
      }
   }
}