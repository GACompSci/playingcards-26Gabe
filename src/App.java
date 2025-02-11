public class App {
    public static void main(String[] args) {
      //54 cards in the deck
        Card[] deck = new Card[54];
        int i = 0;
        deck[i++] = new Card();  // first joker
        deck[i++] = new Card();  // 2nd joker

        // using a nested loop to create 4 suits per card value & with 13 card values --> 52 total combinations
        for (int value = 1; value <= 13; value++) {
            for (int suit = 1; suit <= 4; suit++) {
                deck[i++] = new Card(value, suit); //add it to the deck
            }
        }

        for (Card card : deck) {// for each card in the deck
            System.out.println(card); //print the card
            System.out.println(Card.getNumCards());
        }
    }
}
//static is call it on the class