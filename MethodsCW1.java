//CS1 Class Practice for Methods 10/18/2021

public class MethodsCW1
{
	public static void swap(double x, double y) {
   double temp = x;
   x = y;
   y = temp;
}
 
public static void main(String[] args) {
   double x = 3.0, y = 7.0;
   swap(x, y);
}
}