/**
 * Name: Rusho Binnabi
 * Class: CISS 111-331
 * Assignment: Card Game Java Assignment
 */

import java.util.Random;

public class Rusho_Deck_CardGame extends Rusho_CardPlayer_CardGame {

    /**
     * this class creates the deck class for the card game.
     */

    Random r = new Random(); // creates a random object called r.

    /**
     * this method deals the cards.
     */

    public void deal_card() {
        for (Rusho_Suit_CardGame suit : Rusho_Suit_CardGame.values()) { // this outer enhanced for loop says that for each suit value for the card that's associated with the corresponding face values of the cards.
            for (Rusho_CardValues_CardGame value : Rusho_CardValues_CardGame.values()) { // this inner enhanced for loop says that for each face value of the card for the number of face values for the cards.
                Rusho_Card_CardGame card = new Rusho_Card_CardGame(value, suit); // a card object called card gets created that has the face and suit values of the card.
                this.add_card(card); // adds the card that's in the card object to the deck.
            }
        }
    }

    /**
     * this method shuffles the cards in the deck.
     */

    public void shuffle_cards() {
        for (int i = cards.size() - 1; i > 0; i--) { // an integer variable called i gets created which is equal to the size of cards from the hands - 1, while the value of i is greater than 0, i will decrease by 1.
            int pick_random_card = r.nextInt(i); // an integer variable called pick_random_card gets created and has a random integer from r at the index position of i.
            Rusho_Card_CardGame random_card = cards.get(pick_random_card); // a card object called random_card gets created and it gets the value of the randomly chosen card from the cards variable.
            Rusho_Card_CardGame last_card = cards.get(i); // creates a card object called last_card that gets the value of i from the cards variable.
            cards.set(i, random_card); // it sets cards to the randomly chosen integer number and the random card.
            cards.set(pick_random_card, last_card); // it also sets cards to the randomly chosen card and the last card.
        }
    }

    /**
     * this method deals the cards to the deck also but it takes an array and an integer arguement which says which hands to give the cards to and how many cards to give for each hand.
     *
     * @param hands     the arguement is for how many hands the cards will be given to.
     * @param each_hand the arguement is for how many cards will be given to the hands.
     */

    public void dealcards(Rusho_CardPlayer_CardGame[] hands, int each_hand) {
        for (int r = 0; r < each_hand; r++) { // in this outer for loop, an integer variable called r gets created and initialized to 0, while r is less than the number of cards in each hand (the integer arguement), the value of r will increase by 1 each time.
            for (Rusho_CardPlayer_CardGame hand : hands) { // in this inner enhanced for loop, it says that for each hand in the number of hands.
                this.give_card(cards.get(0), hand); // the cards at index position 0 and the number of cards for the hands will be given to the hands.
            }
        }
    }
}
