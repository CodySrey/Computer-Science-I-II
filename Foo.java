public class Foo{
   private int bar;
   private static double baz = 2.5;
   public void method(double num){
      double result = num/2;
   }
   
   public Foo(int bar){
      this.bar = bar;
      baz += 0.5;
   }
   public String toString(){
      return "bar = " + bar + ", baz = " + " " + baz;
   }
}