import core.Board;
import core.Coordinates;
import core.DiagonalWinCondition;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DiagonalWinConditionTest {

    @Test
    void canWinWhen3PiecesAreDiagonalRightToLeft() {
        Board board = new Board();
        board.addMove("X", new Coordinates(0, 0));
        board.addMove("X", new Coordinates(1, 1));
        board.addMove("X", new Coordinates(2, 2));
        DiagonalWinCondition diagonalWinCondition = new DiagonalWinCondition();
        assertTrue(diagonalWinCondition.isGameOver(board));
    }

    @Test
    void canWinWhen3PiecesAreDiagonalLeftToRight() {
        Board board = new Board();
        board.addMove("X", new Coordinates(2, 0));
        board.addMove("X", new Coordinates(1, 1));
        board.addMove("X", new Coordinates(0, 2));
        DiagonalWinCondition diagonalWinCondition = new DiagonalWinCondition();
        assertTrue(diagonalWinCondition.isGameOver(board));
    }

    @Test
    void noWinIfDiagonalPiecesAreNotTheSame() {
        Board board = new Board();
        board.addMove("X", new Coordinates(2, 1));
        board.addMove("O", new Coordinates(2, 0));
        board.addMove("X", new Coordinates(2, 2));
        DiagonalWinCondition diagonalWinCondition = new DiagonalWinCondition();
        assertFalse(diagonalWinCondition.isGameOver(board));

    }
}
