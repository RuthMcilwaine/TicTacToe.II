package core;

import java.util.List;

public class Game {
    private Board board = new Board();
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private List<EndGameCondition> endGameConditions;

    public Game(Player player1, Player player2, List<EndGameCondition> endGameConditions) {
        this.player1 = player1;
        this.currentPlayer = this.player1;
        this.player2 = player2;
        this.endGameConditions = endGameConditions;
    }

    public String[][] display() {
        return board.getBoardCopy();
    }

    public TurnStatus takeTurn() {
        Coordinates currentPlayerMove = this.currentPlayer.getNextMove();
        if (!board.isMoveValid(currentPlayerMove)) {
            return TurnStatus.InvalidMove;
        }
        this.board.addMove(currentPlayer.getPiece(), currentPlayerMove);
        if (isGameOver()) {
            return TurnStatus.GameOver;
        }
        this.changePlayer();
        return TurnStatus.Success;
    }

    public boolean isGameOver() {
//        endGameConditions.listIterator().next();
//        endGameConditions[0];
        for (EndGameCondition endGameCondition : endGameConditions) {
            if (endGameCondition.isGameOver(board)) {
                return true;
            }
        }
        return false;
    }


    private void changePlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
}

