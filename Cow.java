public class Cow extends FarmAnimal{
   public Cow(String name){
      super(name);
   }
   
   @Override
   public void makeNoise(){
      System.out.println("Moo");
   }
}