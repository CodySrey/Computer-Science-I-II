public class StaticVar{
   public static void main(String[] args){
      Foo f1 = new Foo(4);
      System.out.println(f1);
      
      Foo f2 = new Foo(16);
      System.out.println(f2);
      System.out.println(f1);
   }
}