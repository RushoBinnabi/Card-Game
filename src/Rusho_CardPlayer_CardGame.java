/**
 * Name: Rusho Binnabi
 * Class: CISS 111-331
 * Assignment: Card Game Java Assignment
 */

import java.util.ArrayList;

public class Rusho_CardPlayer_CardGame {

    /**
     * this class acts as the hands for the card game.
     */

    ArrayList<Rusho_Card_CardGame> cards; // creates an arraylist of the card type from the class that acts as the cards for the card game called cards.

    /**
     * the constructor initializes the arraylist as a new arraylist.
     */

    public Rusho_CardPlayer_CardGame() {
        cards = new ArrayList<>(); // initializes the arraylist as a new arraylist.
    }

    /**
     * this method clears the cards from the "hands".
     */

    public void clear_cards() {
        cards.clear(); // clears the cards.
    }

    /**
     * this method adds a cards to the hands.
     * @param card the card that gets added to the hand.
     */

    public void add_card(Rusho_Card_CardGame card) {
        cards.add(card); // adds the card to cards.
    }

    /**
     * this method shows the hands.
     * @return returns the cards in the hands.
     */

    public String showCardPlayerHand() {
        String str = ""; // creates a string variable called str that gets initialized to an empty string.
        for (Rusho_Card_CardGame c: cards) { // this enhanced for loop says that for each card in the number of cards that is tied with the variable c.
            str += c.toString() + "\n"; // the value of the toString method from the card gets added to str along with a new line.
        }
        return str; // returns str.
    }

    /**
     * this method gives some cards to the hands.
     * @param card this arguement says which hand to give the cards to.
     * @param secondhand // this arguement says how many cards to give to the hands.
     * @return returns the boolean value of either true or false depending on whether if the number of cards that were given has the card that was given or not.
     */

    public boolean give_card(Rusho_Card_CardGame card, Rusho_CardPlayer_CardGame secondhand) {
        if (!cards.contains(card)) { // if the number of cards doesn't have the card that was given from the arguement.
            return false; // then it returns a false.
        }
        else { // if the number of cards does have the card that was given from the arguement.
            cards.remove(card); // the given card is removed from the number of cards.
            secondhand.add_card(card); // the card that was removed gets added to the "second hand".
            return true; // then it returns a true.
        }
    }
}
