/**  TODO: Implement the BaccaratHand class in the file
*
*   @author: Ilan Ramirez 
*
**/

public class BaccaratHand {

        private Card[] cards;
        private int count; // To keep track of the number of cards currently in the hand
    
        public BaccaratHand() {
            cards = new Card[10]; // Let's assume a hand can hold up to 10 cards
            count = 0;
        }
    
    public int add(Card card)
    {
        if (count < cards.length) {
            cards[count] = card;
            count++;
            return count; // Returns the new size of the hand after adding the card
        } else {
            // Handle the situation where there's no room to add a new card
            // Returning -1 could indicate the hand is full
            return -1;
        }
    }

    public int size()
    {
        return count; // should return the number of cards in the hand. 
    }

    public int value() {
            int totalValue = 0;
            for (int i = 0; i < count; i++) {
                Card card = cards[i];
                int cardValue = card.value(); // Assuming 'value()' calculates the Baccarat value for a card
                totalValue += cardValue;
            }
            return totalValue % 10; // Baccarat values are often calculated as the rightmost digit of the sum
        }

    public boolean isNatural()
    {
        if (size() == 2) 
        {
            int totalValue = value();
            if(totalValue == 8 || totalValue == 9) //check if values 8 or 9 when 2 cards delt.
            return true;
        }
        return false;
    }

    public String toString()
    {
        String result = "";
        for (int i = 0; i < size(); i++) {
            result += cards[i].toString();
            if(i < size() - 1) {
                result += " ";
            }
        }
        return result; // Should return a string with two character representations of each card separated by a space from the other (7♠ 4♣).
    }

    // TO answer some of these questions the CardCollection class was created check to help out your code. 
}