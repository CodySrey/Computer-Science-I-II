public class Rational{

   private int num;
   private int den;

   public int getNum(){
   return num;
   }
   public int getDen(){
   return den;
   }
   
   public void setNum(int n){
      num = n;
   }
   public void setDen(int d){
      den = d;    
   }
   
   public Rational(){
      num = 0;
      den = 1;
   }
   
   public Rational(int num, int den) throws DenominatorException{
      this.num = num;
      
      if(den == 0){
         throw new DenominatorException();
      }
      else if(den < 0){
         throw new DenominatorException("Denominator cannot be negative.");
      }
      this.den = den;
   }
   
   public void negate(){
      num = -num;
   }
   
   public void invert(){
      int helper = num;
      num = den;
      den = helper;
   }
   public String toString(){
      String mio = num + " / " + den;
      
      return mio;    
   }
   public boolean equals(Rational that){
         if(this.num == that.num && this.den == that.den)
            return true;
         else
            return false;
         /* Can either use the if statement or the one under; Both have the same function     
         return this.num == that.num && this.den == that.den; */
   }
   public Rational(Rational that){
      this.num = that.num;
      this.den = that.den;
      /* Can do either top method or bottom method
      this(that.num, that.den); */
   }
}