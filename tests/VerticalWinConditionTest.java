import core.Board;
import core.Coordinates;
import core.VerticalWinCondition;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VerticalWinConditionTest {

    @Test
    public void player1CanWinVerticallyWhen3PiecesAreIn3rdRow() {
        Board board = new Board();
        board.addMove("X", new Coordinates(1,1));
        board.addMove("X", new Coordinates(2,1));
        board.addMove("X", new Coordinates(0,1));
        VerticalWinCondition verticalWinCondition = new VerticalWinCondition();
        assertTrue(verticalWinCondition.isGameOver(board));
    }

    @Test
    public void cannotWinVerticallyWhenLessThan3PiecesAreIn3rdRow() {
        Board board = new Board();
        board.addMove("X", new Coordinates(1,1));
        board.addMove("X", new Coordinates(2,1));
        board.addMove("O", new Coordinates(0,1));
        VerticalWinCondition verticalWinCondition = new VerticalWinCondition();
        assertFalse(verticalWinCondition.isGameOver(board));

    }
}
