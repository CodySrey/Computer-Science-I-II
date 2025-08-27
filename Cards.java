public class Cards{
   private String suit;
   private String name;
   private int value;
   
   public Cards(String suit, String name){
      this.suit = suit;
      this.name = name;
      
      if(name.equalsIgnoreCase("Jack")){
        value = 11;
    }
      else if(name.equalsIgnoreCase("Queen")){
        value = 12;
    }
      else if(name.equalsIgnoreCase("King")){
        value = 13;
    }
      else if(name.equalsIgnoreCase("Ace")){
        value = 1;
    }
      else{
         value = Integer.parseInt(name);
      }
   }
   public void setValue(int value){
      this.value = value;
   }
   public String getSuit(){ return suit; }
   public String getName(){ return name; }
   public int getValue(){ return value; }
}