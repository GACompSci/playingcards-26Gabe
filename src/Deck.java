public final class Deck {
    private Card[] deck;
    public Deck(){
        //52 cards in the deck
        deck = new Card[52];
        int i = 0;
        for (int value = 1; value <= 13; value++) {
            for (int suit = 1; suit <= 4; suit++) {
                deck[i++] = new Card(value, suit); 
            }
        }
    shuffle(); 
    }


public void shuffle() {
    for (int i = 0; i < deck.length; i++) { 


        //swapping the cards
        int replacementCard = (int) (Math.random() * 52); 
        Card temporary = deck[i];
        deck[i] = deck[replacementCard];
        deck[replacementCard] = temporary; 
    }
}


public Card drawCard() {
    Card topcard = deck[0];
    // create new deck w one less card
    Card[] tempDeck = new Card[deck.length - 1];
    // copy everything except first card from deck to tempceck
    for(int i=1;i<tempDeck.length;i++){
        tempDeck[i-1]=deck[i];
    }
    // make deck equal to temp deck
    deck = tempDeck;
    return topcard;
}



@Override
public String toString() {
    return "Deck of " + deck.length + " cards";
}

    public Card[] getDeck(){
        return deck;
    }
}
