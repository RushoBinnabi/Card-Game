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
        String command; // a string variable called command gets created which has the value of whether the user wants to "play the game" again or not.
        do { // the code will run as long as command doesn't have "no" or "No" in it.
            System.out.println(""); // creates some line spacing.yes
            Scanner userinput = new Scanner(System.in); // creates a scanner object called userinput to get the user input of whether the user wants to "play the game" again or not.
            Rusho_Deck_CardGame deck = new Rusho_Deck_CardGame(); // creates a deck object called deck that is the deck of cards.
            deck.deal_card(); // the method call to the deal_card method deals the cards to the deck.
            deck.shuffle_cards(); // using the shuffle method, it shuffles the deck of cards.

            Rusho_CardPlayer_CardGame hand1, hand2; // creates 2 hand objects from the card player class object called hand1 and hand2.
            hand1 = new Rusho_CardPlayer_CardGame(); // hand1 gets created as a new card player class object.
            hand2 = new Rusho_CardPlayer_CardGame(); // hand2 gets created as a new card player class object.
            Rusho_CardPlayer_CardGame[] hands = {hand1, hand2}; // an array called hands that is from the card player class has the 2 hand objects, hand1 and hand2, in it.

            deck.dealcards(hands, 5); // this deck method call deals 5 cards to the hands.

            for (Rusho_CardPlayer_CardGame hand : hands) { // this enhanced for loop says that for each hand for the number of hands.
                System.out.println(""); // creates some line spacing.
                System.out.println(hand.showCardPlayerHand()); // shows the cards in each hand.
            }
            System.out.println(""); // creates some line spacing.
            System.out.print("Do you want to play again? Yes or no: "); // asks the user if they want to play again.
            command = userinput.next(); // stores the command inside the command variable.
            if (command.equals("no") || command.equals("No")) { // if the value inside the command variable is equal to "No" or "no".
                userinput.close(); // closes the scanner object.
                System.exit(0); // exits the program.
            }
        } while (command.equals("Yes") || command.equals("yes")); // the code will run as long as the user wants to play again.

    }
}
