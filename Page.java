public class Page extends Document implements Turnable, Comparable<Page>{
   private int pageNum;
   
   public Page(int pageNum, String txt){
      super(txt);
      this.pageNum = pageNum;
   }
   
   public String toString(){
    return "Page: " + pageNum + " " + super.toString();  
   }
   
   @Override
   public void turn(){
      System.out.println("turning to different page");
   }
   
   @Override
   public int compareTo(Page that){
      return this.pageNum - that.pageNum;   
   }
}