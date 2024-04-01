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

    ArrayList<Rusho_Card_CardGame> cards;

    /**
     * the constructor initializes the arraylist as a new arraylist.
     */

    public Rusho_CardPlayer_CardGame() {
        cards = new ArrayList<>();
    }

    /**
     * this method clears the cards from the "hands".
     */

    public void clear_cards() {
        cards.clear();
    }

    /**
     * this method adds a cards to the hands.
     * @param card the card that gets added to the hand.
     */

    public void add_card(Rusho_Card_CardGame card) {
        cards.add(card);
    }

    /**
     * this method shows the hands.
     * @return returns the cards in the hands.
     */

    public String showCardPlayerHand() {
        String str = "";
        for (Rusho_Card_CardGame c: cards) { 
            str += c.toString() + "\n";
        }
        return str;
    }

    /**
     * this method gives some cards to the hands.
     * @param card this arguement says which hand to give the cards to.
     * @param secondhand this arguement says how many cards to give to the hands.
     * @return returns the boolean value of either true or false depending on whether if the number of cards that were given has the card that was given or not.
     */

    public boolean give_card(Rusho_Card_CardGame card, Rusho_CardPlayer_CardGame secondhand) {
        if (!cards.contains(card)) {
            return false;
        }
        else {
            cards.remove(card);
            secondhand.add_card(card);
            return true;
        }
    }
}
