// TODO: Implement the Shoe class in this file
import java.util.Collections;

public class Shoe {
    private BaccaratCard[] cards; //stores cards in shoe.
    private int size;  // Keeps track of number of cards.

    public Shoe(int decks) {
        if (decks != 6 && decks != 8) {
            throw new CardException("Number of decks must be 6 or 8.");
        } 

        int totalCards = decks * 52; //calculates the total number of cards needed.
        
        cards = new BaccaratCard[totalCards]; //starts storing cards.

        // Ensuring the right order of card ranks and suits for your specific test setup
        int index = 0;
        for (int i = 0; i < decks; i++) {
            for (Card.Suit suit : Card.Suit.values()) { // Loop suits outside
                for (Card.Rank rank : Card.Rank.values()) { // Loop ranks inside
                    cards[index++] = new BaccaratCard(rank, suit);
                }
            }
        }
        size = index; // Set size to the last index incremented
    }

    public Card deal() {
        if (size == 0) {
            throw new CardException("Error dealing from an empty shoe.");
        }

        Card dealtCard = cards[0]; // Deal the first card
        System.arraycopy(cards, 1, cards, 0, size - 1); // Shift all other cards one position forward
        cards[size - 1] = null; // Nullify the last position
        size--; // Decrease the size of the shoe
        return dealtCard;
    }

    public int size()
    {
        return size; // return the number of cards in the shoe.
    }

    public int shuffle() {
        for (int i = cards.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = (int) (Math.random() * (i + 1));
    
            // Swap the cards at indices i and j
            BaccaratCard temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    
        return 0; // Placeholder return value
    }
    // TO answer some of these questions the CardCollection class was created check to help out your code. 
}