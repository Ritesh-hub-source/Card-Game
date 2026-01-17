import java.util.*; // For ArrayList

public class Hand {
     // Attributes

     private ArrayList<Card> hand; // ArrayList to store cards in the hand

     // Default constructor

     public Hand() {
          hand = new ArrayList<Card>();
     }

     // Methods

     public void addCard(Card card) { // Add a card to the hand
          hand.add(card);
     }

     public Card playCard() { // Remove and return the first card from the hand
          if (hand.size() > 0) {
               return hand.remove(0);
          }
          return null; // Return null if hand is empty
     }

     public int getSize() { // Return the number of cards in the hand
          return hand.size();
     }

     public void display() { // Display all cards in the hand
          for (Card card : hand) {
               System.out.print(card + " ");
          }
          System.out.println();
     }

     public Card getCard(int index) { // Get a card at a specific index without removing it
          if (index >= 0 && index < hand.size()) {
               return hand.get(index);
          }
          return null;
     }

     public void clear() { // Remove all cards from the hand
          hand.clear();
     }
}
