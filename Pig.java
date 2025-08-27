public class Pig extends FarmAnimal{
   public Pig(String name){
      super(name);
   }
   
   @Override
   public void makeNoise(){
      System.out.println("Oink");
   }
}