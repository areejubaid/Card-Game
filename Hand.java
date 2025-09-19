import java.util.ArrayList;
import java.util.Collections;

// This class shows the cards in a players hand.
// It has different methods like adding, removing, shuffling, counting and calculating. 
public class Hand{
    private ArrayList<Card> cards;
    private static final int max_cards = 10;

    // Constructor for hand that takes a variable number of cards to create the initial player hand.
    public Hand(Card... initialCards){
        this.cards = new ArrayList<>();
        for (Card card: initialCards){
            if (cards.size()<max_cards){
                cards.add(card);
            }
        }
    }

    // Getter for a card at a certain position.
    public Card getCard(int pos){
        return cards.get(pos);
    }

    // Method to add a card to the hand if the hand isn't full.
    public void addCard(Card card){
        if (cards.size()<max_cards){
            cards.add(card);
        } else {
            System.out.println("Hand is full!");
        }
    }

    // Method to remove a card from a certain position, given in the parameters, if that position is valid.
    public void removeCard(int pos){
        if (pos >=0 && pos <cards.size()){
            cards.remove(pos);
        } else {
            System.out.println("Card position is incorrect.");
        }
    }
    
    // Method to shuffle a player's hand using the shuffle method in Collections.
    public void shuffleHand() {
        Collections.shuffle(cards);
        System.out.println("Hand has been shuffled.");
    }

    // Method to count the number of special cards.
    public int countSpecialCards(){
        int count = 0;
        for (Card card : cards){
            if (card instanceof SpecialCard){
                count++;
            }
        }
        return count;
    }

    // Method to calculate the total score for each player. This score is then used to determine the winner.
    public int calculateValue(){
        int score = 0;
        for (Card card : cards){
            score+= card.getNumber();
            if (card.getColour().equals("red")){
                score += 5;
            } else if (card.getColour().equals("blue")){
                score += 10;
            } else {
                score += 15;
            }
            if (card instanceof SpecialCard){
                score += ((SpecialCard) card).getBonusPoints();
            }
        }
        return score;
    }

    // Method that used a collections method to sort each hand.
    public void sortHand(){
        Collections.sort(cards);
    }

    // Method to return the String represntation of the hand.
    @Override
    public String toString(){
        return cards.toString();
    }
}