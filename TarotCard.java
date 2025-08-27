public class TarotCard extends Cards{

   private String trump;

   public TarotCard(String trump, String suit, String name, int value){
      super(suit, name);
      this.trump = trump;
      
      if(name.equalsIgnoreCase("Fool")){
        value = 0;
    }
      else if(name.equalsIgnoreCase("Pagat")){
        value = 1;
    }
      else if(name.equalsIgnoreCase("Popess")){
        value = 2;
    }
      else if(name.equalsIgnoreCase("Empress")){
         value = 3;  
    }
      else if(name.equalsIgnoreCase("Emperor")){
        value = 4;
    }
       else if(name.equalsIgnoreCase("Pope")){
        value = 5;
    }
      else if(name.equalsIgnoreCase("Lovers")){
        value = 6;
    }
      else if(name.equalsIgnoreCase("Chariot")){
        value = 7;
    }
      else if(name.equalsIgnoreCase("Justice")){
        value = 8;
    }
      else if(name.equalsIgnoreCase("Hermit")){
        value = 9;
    }
      else if(name.equalsIgnoreCase("WoF")){
        value = 10;
    }
      else if(name.equalsIgnoreCase("Strength")){
         value = 11;  
    }
      else if(name.equalsIgnoreCase("HM")){
        value = 12;
    }
       else if(name.equalsIgnoreCase("Death")){
        value = 13;
    }
      else if(name.equalsIgnoreCase("Temperence")){
        value = 14;
    }
      else if(name.equalsIgnoreCase("Devil")){
        value = 15;
    }
      else if(name.equalsIgnoreCase("Tower")){
        value = 16;
    }
      else if(name.equalsIgnoreCase("Star")){
        value = 17;
    }
      else if(name.equalsIgnoreCase("Moon")){
        value = 18;
    }
      else if(name.equalsIgnoreCase("Sun")){
         value = 19;  
    }
      else if(name.equalsIgnoreCase("Angel")){
        value = 20;
    }
       else if(name.equalsIgnoreCase("World")){
        value = 21;
    }
      else{
         value = Integer.parseInt(name);
      }
   }
   
}

