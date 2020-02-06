package consoleShell;

import core.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class tttConsoleShell {
    Player player1 = new Human("X");
    Player player2 = new Human("O");
    Player currentPlayer;


    public void play() {
        Game game = new Game(player1, player2, endGameConditions());
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic Tac Toe! \n" + game.displayGameBoard());

        System.out.println("New Game! Player X makes the first move: ");
        while (!game.isGameOver()) {
            currentPlayer = game.getCurrentPlayer();
            String userInput = scanner.nextLine();
            Coordinates userCoordinate = new Coordinates(userInput);
            currentPlayer.setNextMove(userCoordinate);

            game.takeTurn();
            currentPlayer = game.getCurrentPlayer();
            System.out.println("Your move player: " + currentPlayer.getPiece());
            System.out.println(game.displayGameBoard());
        }
        System.out.println("Player " + currentPlayer.getPiece() + " is the winner!");

    }

    public List<EndGameCondition> endGameConditions() {
        List<EndGameCondition> endGameConditions = new ArrayList<>();
        endGameConditions.add(new HorizontalWinCondition());
        endGameConditions.add(new VerticalWinCondition());
        endGameConditions.add(new DiagonalWinCondition());
        endGameConditions.add(new DrawWinCondition());
        return endGameConditions;
    }
}