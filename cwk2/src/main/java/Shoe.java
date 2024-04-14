// TODO: Implement the Shoe class in this file

public class Shoe {
    public Shoe(int decks)
    {
        // Must have a -constructor- in which the number of decks of cards is specified as a parameter (number of decks from 6 or 8) any other value = CardExeption.
        // the constructor of shoe should ensure that a shoe stores the specified number of complete decks of BaccaratCard objects. (a full deck = 52 ordered first by suit and then rank !! NO OTHER ORDERS ALLOWED !!).
    
    }

    public int size()
    {
        return 0; // return the number of cards in the shoe.
    }

    public int shuffle()
    {
        return 0; // re orders the cards of the shoe randomly use "COLLECTIONS utility class" from "JAVA.UTIL" package. 
    }

    public Card deal()
    {
        return null; // removes the first stored card and returns it to the caller. if deals from empty shoe = CardExeption.  
    }
    
    
    // TO answer some of these questions the CardCollection class was created check to help out your code. 

}