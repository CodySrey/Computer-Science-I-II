import java.util.ArrayList;
import java.util.Collections;

public class Decks{
   ArrayList<Cards> cardsInDeck = new ArrayList<>();
   
   public Decks(){
      String suit[] = {"Spades", "Clubs", "Hearts", "Diamonds"};
      String name[] = {"A", "Q", "K", "J", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
      
      for(int suit = 0; suit < suits.length; suit++){
         for(int name = 0; name < names.length; name++){
            String currentSuit = suits[suit];
            char currentName = names[name];
            cardsInDeck.add(new Card(currentSuit, currentName));
         }
      }
   }
   public void Shuffle(){
      Collections.shuffle(CardsInDeck);
   }
}

