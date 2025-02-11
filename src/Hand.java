import java.util.ArrayList;
public class Hand{
    ArrayList<Card> hand  = new ArrayList<>();
public Hand(int cardsInHand, Deck deck){
for(int i=0;i<cardsInHand;i++){
hand.add(deck.drawCard());
//draws card from deck & puts it in hand
}
}
public int cardPresent(int value, int suit){
for(int i=0; i<hand.size(); i++){
Card card = hand.get(i);
if(card.getValue() == value && card.getSuit() == suit){
    return i;
} 
}
//return the index of the card if its in the hand othewise return -1}
return -1;
}

public Card playCard(int value, int suit){
int index = cardPresent(value, suit);
if(index!=-1){
    return hand.remove(index);
}
    return null;
//remove & return the card if its in the deck (use cardPresent) otherwise return null
}
public void addCard(Card card){
hand.add(card);
}
public void printHand(){
    for(Card card: hand){
        System.out.println(card);
    }
    //print all the cards in the hand
}
public void sortHand(){
for(int i=0;i<hand.size()-1;i++){
    for(int j=i+1;j<hand.size();j++){
        if(hand.get(i).getValue()>hand.get(j).getValue()){
            Card temp= hand.get(i);
            hand.set(i,hand.get(j));
            hand.set(j,temp);
        }
    }
}
    //sort by value smallest to largest
}
//     an ArrayList<Card> attribute called hand
// a constructor that initializes hand using the following two parameters: 
// an int representing the number of cards in the hand
// a Deck object from which the Cards will be drawn
// a cardPresent method that takes two parameters, value and suit, and returns a int indicating the index of the card, if it is in the hand, and -1 if the card is not in the hand.
// a playCard method that takes two parameters, value and suit. This method should use cardPresent and remove and return the corresponding Card, only if it is in the hand. Otherwise it should return null. 
// an addCard method that takes a Card parameter and adds it to hand.
// a printHand method that prints the Cards in the hand.
// a sortHand method that sorts the hand by value, from smallest to largest.

}