public class Trapezoid extends Shape{
   private double a;
   private double b;
   private double h;
   private double Area;
   
   public Trapezoid(String name){
      super(name);
   }

   @Override
   public void getArea(){
      Area = 0.5 * (a + b) * h;
      System.out.println("Area of a Trapezoid = " + Area);
   }
   
}