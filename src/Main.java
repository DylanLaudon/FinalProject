import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> Deck = new ArrayList<String>();
        //adds the bamboo tiles
        Deck.add("B1");
        Deck.add("B1");
        Deck.add("B1");
        Deck.add("B1");
        Deck.add("B2");
        Deck.add("B2");
        Deck.add("B2");
        Deck.add("B2");
        Deck.add("B3");
        Deck.add("B3");
        Deck.add("B3");
        Deck.add("B3");
        Deck.add("B4");
        Deck.add("B4");
        Deck.add("B4");
        Deck.add("B4");
        Deck.add("B5");
        Deck.add("B5");
        Deck.add("B5");
        Deck.add("B5");
        Deck.add("B6");
        Deck.add("B6");
        Deck.add("B6");
        Deck.add("B6");
        Deck.add("B7");
        Deck.add("B7");
        Deck.add("B7");
        Deck.add("B7");
        Deck.add("B8");
        Deck.add("B8");
        Deck.add("B8");
        Deck.add("B8");
        Deck.add("B9");
        Deck.add("B9");
        Deck.add("B9");
        Deck.add("B9");
        Deck.add("B10");
        Deck.add("B10");
        Deck.add("B10");
        Deck.add("B10");
        //adds the remaining tiles in a for loop
       for(int j=1; j <= 10; j++) {
           for(int i=1; i <= 4; i++) {
            Deck.add("R" + i);
        }
       }
        for(int j=1; j <= 10; j++) {
            for(int i=1; i <= 4; i++) {
                Deck.add("C" + i);
            }
        }

        //shuffles the deck
        Collections.shuffle(Deck);

        ArrayList<String> Hand = new ArrayList<String>();
        //needs random numbers inside Hand
        //thirteen tiles per hand excluding the tile pulled
        Hand.add(Deck.get(0));
        //need to remove tile from Deck after it has been put in hand
    }
}
