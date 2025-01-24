public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for(Card card : deck.getDeck()){
         //   System.out.println(card);
        }
        deck.drawCard();
        deck.drawCard();
        System.out.println(deck);
    }
}
// For this exercise, you will continue to work in the Playing Cards exercise. You will create a Deck class that will define objects representing a deck of playing cards. Keep your Card class and add a new file called Deck.java. Your Deck class must include: 
// an array of Card objects called deck (3 points)
// a default constructor that creates and shuffles (see below) a 52 card deck (you should repurpose your nested loops form the main method here) (5 points)
// a shuffle method that shuffles the deck array (2 points)
// a drawCard method that returns the first card in the array and sets deck to a new, smaller array (3 points)
// a toString method that prints "Deck of {deck.length} cards" (2 points)
// In the main method, create a deck object, draw and print two cards, then print out the deck object. (5 points)