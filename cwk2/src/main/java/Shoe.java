// TODO: Implement the Shoe class in this file
import java.util.Collections;

public class Shoe {
    private BaccaratCard[] cards; //stores cards in shoe.
    private int size;  

    public Shoe(int decks) {
        if (decks != 6 && decks != 8) {
            throw new CardException("Number of decks must be 6 or 8.");
        } 

        int totalCards = decks * 52; 
        
        cards = new BaccaratCard[totalCards]; 

        // Ensuring the right order of card ranks and suits
        int index = 0;
        for (int i = 0; i < decks; i++) {
            for (Card.Suit suit : Card.Suit.values()) { // Loop suits outside
                for (Card.Rank rank : Card.Rank.values()) { // Loop ranks inside
                    cards[index++] = new BaccaratCard(rank, suit);
                }
            }
        }
        size = index; 
    }

    public Card deal() {
        if (size == 0) {
            throw new CardException("Error dealing from an empty shoe.");
        }

        Card dealtCard = cards[0];
        System.arraycopy(cards, 1, cards, 0, size - 1); // Shift all other cards one position forward
        cards[size - 1] = null; 
        size--;
        return dealtCard;
    }

    public int size()
    {
        return size; 
    }

    public int shuffle() {
        for (int i = cards.length - 1; i > 0; i--) {
            // Generate a random index 
            int j = (int) (Math.random() * (i + 1));
    
            // Swap the cards in i and j
            BaccaratCard temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    
        return 0; 
    }
}