public final class Card {
 public static void main(String[] args) {
     
 }
    private final int suit;   // Suit ranges 0-4 for hearts diamonds clubs spades & 0 forjoker, I got an error message telling me to put final
    private String name;  //  name of the card 
    private static int numCards=0;
private final int value;
    
    public Card() { // special for jokers
        this.suit = 0;   
        this.value=0;
        this.name = "Joker";
        numCards++;
    }

    public Card(int value, int suit) {//the object is card & its attributes are value and suit. Used for everything that isn't a joker
        this.suit = suit;
        this.name = generateCardName(value, this.suit);
        numCards++;
        this.value=value;
    //System.out.println(numCards);
    }

    public int getValue() {
        return this.value;
    }

    public int getSuit() {
        return this.suit;
    }

    public void setVal(int value) {
        this.name = generateCardName(value, suit);  
    }

    public static int getNumCards(){
        return numCards;
    }
@Override //  I got an error message telling me to put @ overide
    public String toString() {
        return this.name; 
        

    }

    public String generateCardName(int value, int suit) {
        String[] cardNames = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suitNames = {"Joker", "Hearts", "Diamonds", "Clubs", "Spades"};
        if (value == 0) {
            return suitNames[0]; // For joker card
        }
        return cardNames[value - 1] + " of " + suitNames[suit];
    }

}