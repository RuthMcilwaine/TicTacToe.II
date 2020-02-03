import core.Board;
import core.Coordinates;
import core.DrawWinCondition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DrawWinConditionTest {

    @Test
    void canDrawGameWhenTheBoardIsFull() {
        Board board = new Board();
        board.addMove("X", new Coordinates(0, 0));
        board.addMove("O", new Coordinates(0, 1));
        board.addMove("X", new Coordinates(0, 2));
        board.addMove("O", new Coordinates(1, 0));
        board.addMove("X", new Coordinates(1, 1));
        board.addMove("O", new Coordinates(1, 2));
        board.addMove("X", new Coordinates(2, 0));
        board.addMove("O", new Coordinates(2, 2));
        board.addMove("X", new Coordinates(2, 1));
        DrawWinCondition drawWinCondition = new DrawWinCondition();
        assertTrue(drawWinCondition.isGameOver(board));
    }

    @Test
    void cannotDrawWhenBoardIsNotFull() {
        Board board = new Board();
        board.addMove("X", new Coordinates(0, 0));
        board.addMove("O", new Coordinates(0, 1));
        board.addMove("X", new Coordinates(0, 2));
        board.addMove("O", new Coordinates(1, 0));
        board.addMove("X", new Coordinates(1, 1));
        board.addMove("O", new Coordinates(1, 2));
        board.addMove("X", new Coordinates(2, 0));
        board.addMove("O", new Coordinates(2, 2));
        DrawWinCondition drawWinCondition = new DrawWinCondition();
        assertFalse(drawWinCondition.isGameOver(board));

    }
}
