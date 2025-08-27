public class Example{
 private int a;
 private static int b = 0;

 public Example(int a){
 this.a = a;
 b += 10;
 }

 public int doStuff(){
 int result = a;

 if(b > 10){
 result = a * (b / 2);
 }

return result;
}
}
