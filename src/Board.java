public class Board {

    private int width = 3;
    private int height = 3;
    private String[][] board;

    public void addMove(String piece, Coordinates move) {
    }

    public Board() {
        board = new String[width][height];
        for (int r = 0; r < width; r++) {
            for (int c = 0; c < height; c++) {
                board[r][c] = r + "," + c;
            }
        }
    }
}
