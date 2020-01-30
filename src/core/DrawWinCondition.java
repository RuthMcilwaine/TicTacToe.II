package core;

public class DrawWinCondition implements EndGameCondition {
    @Override
    public boolean isGameOver(Board board) {
        String[][] boardArray = board.getBoard();

        for (int row = 0; row <= 2; row++) {
            for (int column = 0; column <= 2; column++) {
                if (boardArray[row][column].contains(",")) {
                    return false;
                }
            }
        }
        return true;
    }
}

