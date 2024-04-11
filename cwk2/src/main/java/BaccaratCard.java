// TODO: Implement the BaccaratCard class in this file
public class BaccaratCard {
    
    public BaccaratCard(Rank r, Suit s) {
        break;
    }
    
    public Rank getRank()
    {
        return rank; // gets the number or JQKA of the cards return Rank 
    }
    
    public Suit getSuit()
    {
        return suit; // gets its symbol Hearts, Spades, etc. return Suit 
    }

    public String toString()
    {
        return string; // turns rank and suit into a two character string (first shows rank then suit).
    }

    public boolean equals(Object other)
    {
        return equals; // Shows the value of both the cards that were taken out ???  It should be possible to compare BaccaratCard objects in two ways, using the equals() and compareTo() methods.
    }

    public int compareTo(Card other)
    {
        return compareTo; // ???
    }
    
    public int value()
    {
        return value; // return the value of both the card (ex: K+3 = 3, 2+5 = 7, K+Q = 0, etc)
    }

// TO answer some of these questions the Card class was created check to help out your code. 
}