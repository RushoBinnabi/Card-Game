/**
 * Name: Rusho Binnabi
 * Class: CISS 111-331
 * Assignment: Card Game Java Assignment
 */

import java.util.Scanner;

public class Rusho_CardGame_Demonstration {

    /**
     * this class demos the card game assignment.
     */

    /**
     * the main method runs the code.
     * @param args the arguement is the code being run.
     */

    public static void main(String[] args) {
        String command; 
        do {
            System.out.println("");
            Scanner userinput = new Scanner(System.in); 
            Rusho_Deck_CardGame deck = new Rusho_Deck_CardGame(); 
            deck.deal_card(); // the method call to the deal_card method deals the cards to the deck.
            deck.shuffle_cards(); // using the shuffle method, it shuffles the deck of cards.

            Rusho_CardPlayer_CardGame hand1, hand2; 
            hand1 = new Rusho_CardPlayer_CardGame();
            hand2 = new Rusho_CardPlayer_CardGame();
            Rusho_CardPlayer_CardGame[] hands = {hand1, hand2};

            deck.dealcards(hands, 5); // this deck method call deals 5 cards to the hands.

            for (Rusho_CardPlayer_CardGame hand : hands) {
                System.out.println("");
                System.out.println(hand.showCardPlayerHand());
            }
            System.out.println("");
            System.out.print("Do you want to play again (y/n)? ");
            command = userinput.next();
	    System.out.print("\033\143"); // clears the screen.	
            if (command.equals("n")) {
                userinput.close();
                System.exit(0);
            }
        } while (command.equals("y"));

    }
}
