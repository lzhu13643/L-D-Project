package java;

public class GameDisplay {
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to Connect Four!");
    }

    public static void displayBoard(GameBoard board) {
        // Display the current game board
    }

    public static void displayWinner(AbstractPlayer player) {
        System.out.println(player.getName() + " wins!");
    }
}