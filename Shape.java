public abstract class Shape{
   private String name;
   
   public Shape(String name){
   this.name = name;
   } 
   
   public abstract int getArea(int n1,int n2);
}