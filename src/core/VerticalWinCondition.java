package core;

public class VerticalWinCondition implements EndGameCondition {
    @Override
    public boolean isGameOver(Board board) {
        String[][] boardArray = board.getBoardCopy();
        if (isVerticalMatch(boardArray)) return true;
        return false;
    }

    private boolean isVerticalMatch(String[][] boardArray) {
        for (int column = 0; column <= 2; column++) {
            if (boardArray[0][column].equals(boardArray[1][column]) && boardArray[0][column].equals(boardArray[2][column])) {
                return true;
            }
        }
        return false;
    }
}
