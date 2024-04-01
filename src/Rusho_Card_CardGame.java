/**
 * Name: Rusho Binnabi
 * Class: CISS 111-331
 * Assignment: Card Game Java Assignment
 */

public class Rusho_Card_CardGame {

    /**
     * this class acts as a card in a deck of cards for the card game.
     */

    public Rusho_Suit_CardGame suit;
    public Rusho_CardValues_CardGame value;

    /**
     * the constructor gets a face value and a suit value for the card and puts it inside the value and suit variables.
     * @param val the face value of the card.
     * @param suit the suit value of the card.
     */

    public Rusho_Card_CardGame(Rusho_CardValues_CardGame val, Rusho_Suit_CardGame suit) {
        this.value = val;
        this.suit = suit;
    }

    /**
     * this get method returns the suit value of the card as a string.
     * @return the suit value of the card.
     */

    public String getSuitValue() {
        return suit.getSuit_Text();
    }

    /**
     * this get method returns the face value of the card as an integer.
     * @return the face value of the card as an integer.
     */

    public int getCardValue() {
        return value.getCard_Value();
    }

    /**
     * this method shows the current face value of the card.
     * @return returns the current face value of the card.
     */

    public String displayCardValue() {
        return value.displayCard_Value();
    }

    /**
     * this toString method returns the values of the face and suit of the card.
     * @return returns the values of the face and suit of that card.
     */

    public String toString() {
        String str = "";
        str += value.displayCard_Value() + " of " + suit.getSuit_Text();
        return str;
    }
}
