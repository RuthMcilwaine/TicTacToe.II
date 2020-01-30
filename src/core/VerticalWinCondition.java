package core;

public class VerticalWinCondition implements EndGameCondition {
    @Override
    public boolean isGameOver(Board board) {
        String[][] boardArray = board.getBoard();
        for (int column = 0; column <= 2; column++) {
            if (boardArray[0][column] == boardArray[1][column] && boardArray[0][column] == boardArray[2][column]) {
                return true;
            }
        }
        return false;
    }
}
