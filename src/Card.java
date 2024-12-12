public class Card {
    private int value;  // ranges 0-13 & uses 0 for joker
    private int suit;   // Suit ranges 0-4 for hearts diamonds clubs spades & 0 forjoker
    private String name;  //  name of the card 

    public Card() { // special for jokers
        this.value = 0;
        this.suit = 0;   
        this.name = "Joker";
    }

    public Card(int value, int suit) {//the object is card & its attributes are value and suit. Used for everything that isn't a joker
        this.value = value;
        this.suit = suit;
        this.name = getCardName(value, suit);  
    }

    public int getValue() {
        return this.value;
    }

    public int getSuit() {
        return this.suit;
    }

    public void setVal(int value) {
        this.value = value;
        this.name = getCardName(value, this.suit); 
    }

    public String toString() {
        return this.name;
    }

    private String getCardName(int value, int suit) {
        String[] cardNames = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suitNames = {"Joker", "Hearts", "Diamonds", "Clubs", "Spades"};
        if (value == 0) {
            return cardNames[0];}
        return cardNames[value - 1] + " of " + suitNames[suit];
    }
}