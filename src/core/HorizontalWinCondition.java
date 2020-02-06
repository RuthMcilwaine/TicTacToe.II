package core;

public class HorizontalWinCondition implements EndGameCondition {

    @Override
    public boolean isGameOver(Board board) {
        String[][] boardArray = board.getBoardCopy();
        return isHorizontalMatch(boardArray);
    }

    private boolean isHorizontalMatch(String[][] boardArray) {
        for (int row = 0; row < boardArray.length; row++) {
            if (boardArray[row][0].equals(boardArray[row][1]) && boardArray[row][0].equals(boardArray[row][2])) {
                return true;
            }
        }
        return false;
    }

}
