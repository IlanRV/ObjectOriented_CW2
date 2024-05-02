/**  TODO: Implement the BaccaratHand class in the file
*
*   @author: Ilan Ramirez 
*
**/

public class BaccaratHand {

        private Card[] cards;
        private int count; //
    
        public BaccaratHand() {
            cards = new Card[10]; 
            count = 0;
        }
    
    public int add(Card card)
    {
        if (count < cards.length) {
            cards[count] = card;
            count++;
            return count; // Returns the new size of the hand after adding the card
        } else {
            return -1;
        }
    }

    public int size()
    {
        return count;  
    }

    public int value() {
            int totalValue = 0;
            for (int i = 0; i < count; i++) {
                Card card = cards[i];
                int cardValue = card.value(); 
                totalValue += cardValue;
            }
            return totalValue % 10;
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
        return result; 
    }
}

