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

    Random r = new Random();

    /**
     * this method deals the cards.
     */

    public void deal_card() {
        for (Rusho_Suit_CardGame suit : Rusho_Suit_CardGame.values()) {
            for (Rusho_CardValues_CardGame value : Rusho_CardValues_CardGame.values()) {
                Rusho_Card_CardGame card = new Rusho_Card_CardGame(value, suit);
                this.add_card(card);
            }
        }
    }

    /**
     * this method shuffles the cards in the deck.
     */

    public void shuffle_cards() {
        for (int i = cards.size() - 1; i > 0; i--) {
            int pick_random_card = r.nextInt(i);
            Rusho_Card_CardGame random_card = cards.get(pick_random_card);
            Rusho_Card_CardGame last_card = cards.get(i);
            cards.set(i, random_card);
            cards.set(pick_random_card, last_card);
        }
    }

    /**
     * this method deals the cards to the deck also but it takes an array and an integer arguement which says which hands to give the cards to and how many cards to give for each hand.
     *
     * @param hands     the arguement is for how many hands the cards will be given to.
     * @param each_hand the arguement is for how many cards will be given to the hands.
     */

    public void dealcards(Rusho_CardPlayer_CardGame[] hands, int each_hand) {
        for (int r = 0; r < each_hand; r++) { 
            for (Rusho_CardPlayer_CardGame hand : hands) { 
                this.give_card(cards.get(0), hand); 
            }
        }
    }
}
