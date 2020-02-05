package core;

public class DrawWinCondition implements EndGameCondition {
    @Override
    public boolean isGameOver(Board board) {
        String[][] boardArray = board.getBoardCopy();

        for (int row = 0; row < boardArray.length; row++) {
            for (int column = 0; column < boardArray[0].length; column++) {
                if (boardArray[row][column].contains(",")) {
                    return false;
                }
            }
        }
        return true;
    }
}

