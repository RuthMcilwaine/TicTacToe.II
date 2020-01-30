package core;

public class Board {

    private int width = 3;
    private int height = 3;
    private String[][] board;

    public void addMove(String piece, Coordinates move) {
        board[move.getRow()][move.getColumn()] = piece;
    }

    public Board() {
        board = new String[width][height];
        for (int r = 0; r < width; r++) {
            for (int c = 0; c < height; c++) {
                board[r][c] = r + "," + c;
            }
        }
    }

    public String[][] getBoard() {
        String[][] boardCopy = new String[board.length][];
        for (int i = 0; i < board.length; i++) {
            String[] columnCopy = board[i];
            int rows = columnCopy.length;
            boardCopy[i] = new String[rows];
            System.arraycopy(columnCopy, 0, boardCopy[i], 0, rows);

        }
        return boardCopy;
    }
}

