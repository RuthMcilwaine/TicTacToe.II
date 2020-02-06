package core;

public class DrawWinCondition implements EndGameCondition {
    @Override
    public boolean isGameOver(Board board) {
        String[][] boardArray = board.getBoardCopy();
        return isADrawWin(boardArray);
    }

    private boolean isADrawWin(String[][] boardArray) {
        for (String[] strings : boardArray) {
            for (int column = 0; column < boardArray[0].length; column++) {
                if (strings[column].contains(",")) {
                    return false;
                }
            }
        }
        return true;
    }

}



