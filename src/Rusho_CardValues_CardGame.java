/**
 * Name: Rusho Binnabi
 * Class: CISS 111-331
 * Assignment: Card Game Java Assignment
 */

public enum Rusho_CardValues_CardGame {

    /**
     * this class creates the face values for the cards using enums.
     */

    // creates the enums for the different face values that the cards might have.

    ACE(1, "Ace"), DEUCE(2, "Deuce"), THREE(3, "3"),
    FOUR(4, "4"), FIVE(5, "5"), SIX(6, "6"),
    SEVEN(7, "7"), EIGHT(8, "8"), NINE(9, "9"),
    TEN(10, "10"), JACK(10, "Jack"), QUEEN(10, "Queen"),
    KING(10, "King");

    // creates the enums for the different face value that the cards might have.

    int card_value; // an integer variable called card_value gets created.
    String card_value_string; // a string variable called card_value_string gets created.

    /**
     * the constructor sets the face values for the cards an an integer and as an string.
     * @param card_value the arguement is the face value for the cards.
     * @param card_value_string // the arguement is the face value of the cards as a string.
     */

    private Rusho_CardValues_CardGame(int card_value, String card_value_string) {
        this.card_value = card_value; // the face value of the cards from the arguement gets set to the card_value variable.
        this.card_value_string = card_value_string; // the face value of the cards as a string from the arguement gets set equal to the card_value_string variable.
    }

    /**
     * this method just returns the face value of the cards.
     * @return the face values of the cards.
     */

    public int getCard_Value() {
        return card_value; // returns the face values of the cards.
    }

    /**
     * this method returns the face value of the cards as a string.
     * @return the face values of the cards as a string.
     */

    public String displayCard_Value() {
        return card_value_string; // returns the face values of the cards as a string.
    }


}
