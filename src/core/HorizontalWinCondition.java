package core;

public class HorizontalWinCondition implements EndGameCondition {

    @Override
    public boolean isGameOver(Board board) {
        String[][] boardArray = board.getBoardCopy();
        if (horizontalMatch(boardArray)) return true;
        return false;
    }

    private boolean horizontalMatch(String[][] boardArray) {
        for (int row = 0; row <= 2; row++) {
            if (boardArray[row][0].equals(boardArray[row][1]) && boardArray[row][0].equals(boardArray[row][2])) {
                return true;
            }
        }
        return false;
    }

}
