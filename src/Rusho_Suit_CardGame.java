/**
 * Name: Rusho Binnabi
 * Class: CISS 111-331
 * Assignment: Card Game Java Assignment
 */

public enum Rusho_Suit_CardGame {

    /**
     * this class creates the suit values for the cards using enums.
     */

    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades");

    String suit_text;

    /**
     * the constructor sets the value of the suit_text variable.
     * @param suit_text the arguement is the suit value for the cards as a string.
     */

    private Rusho_Suit_CardGame(String suit_text) {
        this.suit_text = suit_text;
    }

    /**
     * this method gets the suit value of the cards as a string and returns it.
     * @return the suit value of the cards.
     */

    public String getSuit_Text() {
        return suit_text;
    }

}
