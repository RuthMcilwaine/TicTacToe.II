
import core.Board;
import core.Coordinates;
import core.HorizontalWinCondition;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HorizontalWinConditionTest {

    @Test
    public void canWinHorizontallyWhen3PiecesAreIn3rdRow() {
        Board board = new Board();
        board.addMove("X", new Coordinates(2,1));
        board.addMove("X", new Coordinates(2,0));
        board.addMove("X", new Coordinates(2,2));
        HorizontalWinCondition horizontalWinCondition = new HorizontalWinCondition();
        assertTrue(horizontalWinCondition.isGameOver(board));

    }


    @Test
    public void cannotWinHorizontallyWhenLessThan3PiecesAreIn3rdRow() {
        Board board = new Board();
        board.addMove("X", new Coordinates(2,1));
        board.addMove("O", new Coordinates(2,0));
        board.addMove("X", new Coordinates(2,2));
        HorizontalWinCondition horizontalWinCondition = new HorizontalWinCondition();
        assertFalse(horizontalWinCondition.isGameOver(board));

    }
}
