package core;

public class DiagonalWinCondition implements EndGameCondition {
    @Override
    public boolean isGameOver(Board board) {
        String[][] boardArray = board.getBoard();
        if (boardArray[0][0] == boardArray[1][1] && boardArray[0][0] == boardArray[2][2]) {
            return true;
        }
        if (boardArray[2][0] == boardArray[1][1] && boardArray[2][0] == boardArray[0][2]) {
            return true;
        }
        return false;
    }
}

