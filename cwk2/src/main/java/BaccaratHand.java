/**  TODO: Implement the BaccaratHand class in the file
*
*   @author: Ilan Ramirez 
*
**/

public class BaccaratHand {
    
    public BaccaratHand()
    {
         //should store the value obtained from the cards from BaccaratCard but starts as empty. 
    }

    public int size()
    {
        return 0; // should return the number of cards in the hand. 
    }
    
    public int add(Card card)
    {
        return 0; // makes it possible to add a BACCARATCARD to a BACCARATHAND by calling -.add()- method. 
    }

    public int value()
    {
        return 0; // Return the points value of the hand (K+3=3...)
    }

    public boolean isNatural()
    {
        return false; // Should return TRUE if the hand has two cards and (&&) a points value of 8-9 or else false. 
    }

    public String toString()
    {
        return null; // Should return a string with two character representations of each card separated by a space from the other (7♠ 4♣).
    }

    // TO answer some of these questions the CardCollection class was created check to help out your code. 
}