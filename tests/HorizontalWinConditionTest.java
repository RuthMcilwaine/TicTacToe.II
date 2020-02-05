
import core.Board;
import core.Coordinates;
import core.HorizontalWinCondition;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class HorizontalWinConditionTest {

    @Test
    void canWinHorizontallyWhen3PiecesAreIn3rdRow() {
        Board board = new Board();
        board.addMove("X", new Coordinates(2,1));
        board.addMove("X", new Coordinates(2,0));
        board.addMove("X", new Coordinates(2,2));
        HorizontalWinCondition horizontalWinCondition = new HorizontalWinCondition();
        assertTrue(horizontalWinCondition.isGameOver(board));
    }

    @Test
    void canWinHorizontallyWhen3PiecesAreIn2ndRow() {
        Board board = new Board();
        board.addMove("X", new Coordinates(1,1));
        board.addMove("X", new Coordinates(1,0));
        board.addMove("X", new Coordinates(1,2));
        HorizontalWinCondition horizontalWinCondition = new HorizontalWinCondition();
        assertTrue(horizontalWinCondition.isGameOver(board));
    }

    @Test
    void canWinHorizontallyWhen3PiecesAreIn1stRow() {
        Board board = new Board();
        board.addMove("X", new Coordinates(0,1));
        board.addMove("X", new Coordinates(0,0));
        board.addMove("X", new Coordinates(0,2));
        HorizontalWinCondition horizontalWinCondition = new HorizontalWinCondition();
        assertTrue(horizontalWinCondition.isGameOver(board));
    }

    @Test
    void cannotWinHorizontallyWhenLessThan3PiecesAreIn3rdRow() {
        Board board = new Board();
        board.addMove("X", new Coordinates(2,1));
        board.addMove("O", new Coordinates(2,0));
        board.addMove("X", new Coordinates(2,2));
        HorizontalWinCondition horizontalWinCondition = new HorizontalWinCondition();
        assertFalse(horizontalWinCondition.isGameOver(board));

    }
}
