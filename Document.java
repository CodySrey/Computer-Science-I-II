public class Document{
   private String test;
   
   public Document(String test){
      this.test = test;
   }
   
   public String toString(){
      return "This Document contains \n" + test;
   }
}