/**  TODO: Implement the BaccaratHand class in the file
*
*   @author: Ilan Ramirez 
*
**/

public class BaccaratHand {
    
    public BaccaratHand()
    {
        break; //should store the value obtained from the cards from BaccaratCard but starts as empty. 
    }

    public int size()
    {
        return size; // should return the number of cards in the hand. 
    }
    
    public add(Card card)
    {
        return add; // makes it possible to add a BACCARATCARD to a BACCARATHAND by calling -.add()- method. 
    }

    public int value()
    {
        return value; // Return the points value of the hand (K+3=3...)
    }

    public boolean isNatural()
    {
        return isNatural; // Should return TRUE if the hand has two cards and (&&) a points value of 8-9 or else false. 
    }

    public String toString()
    {
        return toString; // Should return a string with two character representations of each card separated by a space from the other (7♠ 4♣).
    }

    // TO answer some of these questions the CardCollection class was created check to help out your code. 
}