package project;

import java.util.Scanner;

/**
 *
 * @author _sowill
 */
public class Uno {

    public static void main(String[] args) {
        Game uno = new Game("Uno") {
            @Override
            public void play() {
                Scanner input = new Scanner(System.in);
                GroupOfCards card = new GroupOfCards(7);
                System.out.println("Player 1, here is your hand:\n" + card);
                System.out.println("What card would you like to discard? Please give the associated number.");
                int chosenCard = input.nextInt();
                int turn = 2;
                while (card.getSize()> 0 ) {
   
                 
  
   // Flip the player's turn.
   if (turn == 1)
    turn = 2;
   else
    turn = 1; 
  }

            }

            @Override
            public void declareWinner() {
            }
        };
       

    }
    public void playTurn(int player) {

        Scanner stdin = new Scanner(System.in);
        Card card = new Card() {} ;
            
            
            
            
        

        System.out.println("The card at the top of the discard pile is " + card.toString());

        if (player == 1) {

            // We have a card to play!
            if (card.equals(card)) {
                System.out.println("\nPlayer 1, here is your hand:\n" + card);
                System.out.println("What card would you like to discard? Please give the associated number.");
                int card2 = stdin.nextInt();

                // Only play this card if it's really valid!
                if (card.equals(card)) {
                    card.toString();
                } else {
                    System.out.println("Sorry that is not a valid card. You lost your opportunity to drop a card.");
                }
            
                    
                

                
 
        


