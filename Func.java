public class Func{
   public static int func(int x){
      if(x == 0){
         return 2;
      }
      else if (x == 1){
         return 3;
      }
      else{
         return (func(x - 1) + func(x - 2));
      }
   }
}