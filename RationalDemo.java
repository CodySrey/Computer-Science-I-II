public class RationalDemo{
   public static void main(String[] args){
      Rational r1 = new Rational();
      System.out.println(r1.getNum() + " / " + r1.getDen());
      r1.setNum(12);
      r1.setDen(11);
      System.out.println(r1.getNum() + " / " + r1.getDen());
      
      Rational r2 = new Rational();
      System.out.println(r2.getNum() + " / " + r2.getDen());
      r2.setNum(6);
      r2.setDen(12);
      System.out.println(r2.getNum() + " / " + r2.getDen());
      
      int x = 5;
      int y = 5;
      System.out.println(x == y);
      System.out.println(r1 == r2);
      System.out.println(r1.equals(r2));
      
      Rational r3 = new Rational(2, 3);
      System.out.println(r3.getNum() + " / " + r3.getDen());
      String fbk = "This number = " + r3;
      System.out.println(fbk);

   }
}