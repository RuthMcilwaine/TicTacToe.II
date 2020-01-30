package core;

public class HorizontalWinCondition implements EndGameCondition {

    @Override
    public boolean isGameOver(Board board) {
        String[][] boardArray = board.getBoard();
        for (int row = 0; row <= 2; row++) {
            if (boardArray[row][0] == boardArray[row][1] && boardArray[row][0] == boardArray[row][2]) {
                return true;
            }

        }
        return false;
    }

}
