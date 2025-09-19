public class ProjectOneTester {
    /* This program is for a simple card game with players that have hands of cards.
     * The program entails typical card game moves like drawing, discarding and shuffling cards.
     * It will also decide the winner for the game.
     * The card class represents each playing card and the colour and number on it.
     * Each card is worth a particular score that will be counted while the game is in play.
     * The hand class shows the cards in a players hand. The total score of a hand is calculated to determine the winner
     * The Special Card class is for Special Cards worth more points. */

    public static void main(String[] args){
        // Creating regular cards
        Card oneRed = new Card(1,"red");
        Card twoRed = new Card(2,"red");
        Card threeRed = new Card(3,"red");
        Card fourRed = new Card(4,"red");
        Card oneYellow = new Card(1,"yellow");
        Card twoYellow = new Card(2,"yellow");
        Card threeYellow = new Card(3,"yellow");

        // Creating a special card
        SpecialCard bonusCard = new SpecialCard(8, "blue", 30);

        //Creating player hands
        Hand player1 = new Hand(oneYellow, twoRed, threeRed, fourRed, twoYellow);
        Hand player2 = new Hand(twoRed, threeYellow, twoYellow, bonusCard, oneRed, fourRed);

        //Shuffling hands
        player1.shuffleHand();
        player2.shuffleHand();

        //Removing a card
        player1.removeCard(2);
        System.out.println("Player 1 has removes a card!");

        //Adding a new card
        player1.addCard(new Card(4,"blue"));
        System.out.println("Player 1 has drawn a new card!");

        // Counting special card
        System.out.println("Player 2 had " + player2.countSpecialCards() + " special cards.");

        //Calculating scores
        int player1Score = player1.calculateValue();
        int player2Score = player2.calculateValue();

        //Printing hands and scores
        System.out.println("Player 1's hand: " + player1);
        System.out.println("Player 2's hand: " + player2);
        System.out.println("Player 1's score: " + player1Score);
        System.out.println("Player 2's score: " + player2Score);

        //Deciding the winner
        if (player1Score >player2Score){
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score){
            System.out.println("PLayer 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
