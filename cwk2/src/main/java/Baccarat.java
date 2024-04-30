import java.util.Arrays;
import java.util.Scanner;

public class Baccarat {
    private static Scanner scanner = new Scanner(System.in);
    private static int playerWins = 0;
    private static int bankerWins = 0;
    private static int ties = 0;
    private static int gameRounds = 1;

    public static void main(String[] args) {
        boolean gameContinue = true;
        Shoe shoe = new Shoe(6);
        shoe.shuffle();

        while (gameContinue) {
            System.out.println("Round: " + gameRounds);
            BaccaratHand playerHand = new BaccaratHand();
            BaccaratHand bankerHand = new BaccaratHand();

            // Deal initial two cards each
            playerHand.add(shoe.deal());
            bankerHand.add(shoe.deal());
            playerHand.add(shoe.deal());
            bankerHand.add(shoe.deal());

            System.out.println("Player: " + playerHand + " = " + playerHand.value());
            System.out.println("Banker: " + bankerHand + " = " + bankerHand.value());

            // Check for natural wins
            if (playerHand.isNatural() && bankerHand.isNatural()) {
                System.out.println("Tie");
                ties++;
            } else if (playerHand.isNatural()) {
                System.out.println("Player has a natural");
                System.out.println("Player wins");
                playerWins++;
            } else if (bankerHand.isNatural()) {
                System.out.println("Banker has a natural");
                System.out.println("Banker wins");
                bankerWins++;

                // Player draws a card
            } else if (playerHand.value() <= 5) {  
                System.out.println("Dealing third card to player...");
                playerHand.add(shoe.deal());
                System.out.println("Player's hand: " + playerHand + " = " + playerHand.value());
                System.out.println("Banker's hand: " + bankerHand + " = " + bankerHand.value());

                if (bankerHand.value() <= 2){
                    bankerHand.add(shoe.deal());
                    System.out.println("Dealing third card to banker...");
                    System.out.println("Player's hand: " + playerHand + " = " + playerHand.value());
                    System.out.println("Banker's hand: " + bankerHand + " = " + bankerHand.value());
                } else if (bankerHand.value() == 3 && playerHand.value() != 8) {
                    bankerHand.add(shoe.deal());
                    System.out.println("Dealing third card to banker...");
                    System.out.println("Player's hand: " + playerHand + " = " + playerHand.value());
                    System.out.println("Banker's hand: " + bankerHand + " = " + bankerHand.value());
                } else if (bankerHand.value() == 4 && !Arrays.asList(0, 1, 8, 9).contains(playerHand.value())) {
                    bankerHand.add(shoe.deal());
                    System.out.println("Dealing third card to banker...");
                    System.out.println("Player's hand: " + playerHand + " = " + playerHand.value());
                    System.out.println("Banker's hand: " + bankerHand + " = " + bankerHand.value()); 
                } else if (bankerHand.value() == 5 && Arrays.asList(4, 5, 6, 7).contains(playerHand.value())) {
                    bankerHand.add(shoe.deal());
                    System.out.println("Dealing third card to banker...");
                    System.out.println("Player's hand: " + playerHand + " = " + playerHand.value());
                    System.out.println("Banker's hand: " + bankerHand + " = " + bankerHand.value());
                } else if (bankerHand.value() == 6 && Arrays.asList(6, 7).contains(playerHand.value())) {
                    bankerHand.add(shoe.deal());
                    System.out.println("Dealing third card to banker...");
                    System.out.println("Player's hand: " + playerHand + " = " + playerHand.value());
                    System.out.println("Banker's hand: " + bankerHand + " = " + bankerHand.value());
                } 

                if (bankerHand.value() > playerHand.value()){
                    System.out.println("Banker win!");
                    bankerWins++;
                    } else if (bankerHand.value() < playerHand.value()) {
                    System.out.println("Player win!");
                    playerWins++;
                    } else if (bankerHand.value() == playerHand.value()) {
                    System.out.println("Tie");
                    ties++;
                    }
                
                // Player stands
                } else if (playerHand.value() >= 6) {
                    if (bankerHand.value() <= 5){
                    bankerHand.add(shoe.deal());
                    System.out.println("Dealing third card to banker...");
                    System.out.println("Player's hand: " + playerHand + " = " + playerHand.value());
                    System.out.println("Banker's hand: " + bankerHand + " = " + bankerHand.value());
                    }
                    else {
                        System.out.println("Player's hand: " + playerHand + " = " + playerHand.value());
                        System.out.println("Banker's hand: " + bankerHand + " = " + bankerHand.value()); 
                    }

                    if (bankerHand.value() > playerHand.value()){
                            System.out.println("Banker win!");
                            bankerWins++;
                        } else if (bankerHand.value() < playerHand.value()) {
                            System.out.println("Player win!");
                            playerWins++;
                        } else if (bankerHand.value() == playerHand.value()) {
                            System.out.println("Tie");
                            ties++;
                        }
                }

            gameRounds++;
            gameContinue = getPlayerChoice();
        }

        displayFinalResults();
        scanner.close(); }

    private static boolean getPlayerChoice() {
        System.out.print("Another round? (y/n): ");

        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("y")) {
                return true;
            } else if (input.equalsIgnoreCase("n")) {
                System.out.println("You selected: " + input);
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'y' for yes or 'n' for no.");
            }
        }
    }

    private static void displayFinalResults() {
        System.out.printf("%d rounds played. Player Wins: %d, Banker Wins: %d, Ties: %d%n", gameRounds - 1, playerWins, bankerWins, ties);
    }
}