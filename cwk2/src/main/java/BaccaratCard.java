// TODO: Implement the BaccaratCard class in this file

public class BaccaratCard {
    

    public BaccaratCard(Card.Suit s, Card.Rank r)
    {
        Card.rank = r;
        Card.suit = s;
    }
    
    public Card.Rank getRank()
    {
        return Card.rank; // gets the number or JQKA of the cards return Rank 
    }
    
    public Card.Suit getSuit()
    {
        return Card.suit; // gets its symbol Hearts, Spades, etc. return Suit 
    }

    public String toString()
    {
        return null; // turns rank and suit into a two character string (first shows rank then suit).
    }

    public boolean equals(Object other)
    {
        return false; // Shows the value of both the cards that were taken out ???  It should be possible to compare BaccaratCard objects in two ways, using the equals() and compareTo() methods.
    }

    public int compareTo(Card other)
    {
        return 0; // ???
    }
    
    public int value()
    {
        return 0; // return the value of both the card (ex: K+3 = 3, 2+5 = 7, K+Q = 0, etc)
    }

// TO answer some of these questions the Card class was created check to help out your code. 
}