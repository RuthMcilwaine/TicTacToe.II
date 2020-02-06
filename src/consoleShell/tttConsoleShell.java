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

        System.out.println("Welcome to Tic Tac Toe! \n" + displayGameBoard(game.display()));
        System.out.println("New Game! Player X makes the first move: ");

        while (true) {
            currentPlayer = game.getCurrentPlayer();
            String userInput = scanner.nextLine();
            Coordinates userCoordinate = parseCoordinates(userInput);
            currentPlayer.setNextMove(userCoordinate);

          switch(  game.takeTurn()) {
              case InvalidMove:
                  System.out.println("Incorrect move player " + currentPlayer.getPiece() + ". Try again!");
                  break;
              case GameOver:
                  System.out.println("Player " + currentPlayer.getPiece() + " is the winner!");
                  return;
              case Success:
                  currentPlayer = game.getCurrentPlayer();
                  System.out.println(displayGameBoard(game.display()));
                  System.out.println("Your move player " + currentPlayer.getPiece());

                  break;
          };

        }

    }

    public String displayGameBoard(String[][] board) {
        String boardString = "\n";

        for (int r = 0; r < board.length; r++) {
            boardString += "| ";
            for (int c = 0; c < board[0].length; c++) {
                String s = board[r][c];
                boardString += s + " | ";
            }
            boardString += "\n";
        }
        return boardString;
    }

    public List<EndGameCondition> endGameConditions() {
        List<EndGameCondition> endGameConditions = new ArrayList<>();
        endGameConditions.add(new HorizontalWinCondition());
        endGameConditions.add(new VerticalWinCondition());
        endGameConditions.add(new DiagonalWinCondition());
        endGameConditions.add(new DrawWinCondition());
        return endGameConditions;
    }

    public Coordinates parseCoordinates(String userInput) {
        String[] userInputSplit = userInput.split(",");
        int row = Integer.parseInt(userInputSplit[0]);
        int column = Integer.parseInt(userInputSplit[1]);
        return new Coordinates(row,column);
    }

}
