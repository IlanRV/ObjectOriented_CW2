// TODO: Implement the BaccaratCard class in this file


public class BaccaratCard extends Card {
 
    private Card.Rank rank; 
    private Card.Suit suit;

    public BaccaratCard(Rank r, Suit s) {
        super(r, s);
        suit = s;
        rank = r;
    }

    public Rank getRank() {
        
        return rank; // gets the number or JQKA of the cards return Rank
    }

    public Suit getSuit() {

        return suit; // gets its symbol Hearts, Spades, etc. return Suit
    }

    public String toString() 
    {
        return String.format("%c%c", rank.getSymbol(), suit.getSymbol());
    }

    public boolean equals(Object other) {

        if (this == other) return true; 
        if (other == null || getClass() != other.getClass()) return false; 
        
        BaccaratCard that = (BaccaratCard) other; 
        return rank == that.rank && suit == that.suit; 
    } 
   

    public int compareTo(Card other) {
        // compare suits
        int suitDifference = this.getSuit().compareTo(other.getSuit());
        if (suitDifference != 0) {
            return suitDifference;
        }

        // If suits are the same, compare ranks
        return this.getRank().compareTo(other.getRank());
    }

    public int value() {
        Card.Rank rank = getRank();

        if (rank == Card.Rank.JACK || rank == Card.Rank.QUEEN || rank == Card.Rank.KING || rank == Card.Rank.TEN)
        {
            return 0; 
        }
        if (rank == Card.Rank.ACE)
        {
            return 1;
        }

        return rank.ordinal() + 1;

    }

    // TO answer some of these questions the Card class was created check to help
    // out your code.
}