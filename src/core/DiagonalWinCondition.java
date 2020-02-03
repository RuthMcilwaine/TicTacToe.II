package core;

public class DiagonalWinCondition implements EndGameCondition {
    @Override
    public boolean isGameOver(Board board) {
        String[][] boardArray = board.getBoardCopy();
        return isSamePieceLeftToRightDiagonally(boardArray) || boardArray[2][0].equals(boardArray[1][1]) && boardArray[2][0].equals(boardArray[0][2]);
    }

    private boolean isSamePieceLeftToRightDiagonally(String[][] boardArray) {
        return boardArray[0][0].equals(boardArray[1][1]) && boardArray[0][0].equals(boardArray[2][2]);
    }
}

