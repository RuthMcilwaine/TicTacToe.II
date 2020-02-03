import core.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AcceptanceTest {

    @Test
    void canPlayGame() {

        List<Coordinates> player1Moves = new ArrayList<>();
        player1Moves.add(new Coordinates(2, 1));
        player1Moves.add(new Coordinates(2, 2));
        player1Moves.add(new Coordinates(2, 0));
        Player player1 = new TestPlayer("X", player1Moves);

        List<Coordinates> player2Moves = new ArrayList<>();
        player2Moves.add(new Coordinates(1, 1));
        player2Moves.add(new Coordinates(0, 0));
        Player player2 = new TestPlayer("O", player2Moves);

        List<EndGameCondition> endGameConditions = new ArrayList<>();
        endGameConditions.add(new HorizontalWinCondition());
        endGameConditions.add(new VerticalWinCondition());
        endGameConditions.add(new DiagonalWinCondition());
        endGameConditions.add(new DrawWinCondition());

        Game game = new Game(player1, player2, endGameConditions);
        String[][] initialGameState = game.display();

        game.takeTurn();
        String[][] GameStateAfterPlayer1Move1 = game.display();

        game.takeTurn();
        String[][] GameStateAfterPlayer2Move1 = game.display();

        game.takeTurn();
        String[][] GameStateAfterPlayer1Move2 = game.display();

        game.takeTurn();
        String[][] GameStateAfterPlayer2Move2 = game.display();

        game.takeTurn();
        String[][] WinningMove = game.display();

        assertArrayEquals(new String[][]{new String[]{"0,0", "0,1", "0,2"}, new String[]{"1,0", "1,1", "1,2"}, new String[]{"2,0", "2,1", "2,2"}}, initialGameState);
        assertArrayEquals(new String[][]{new String[]{"0,0", "0,1", "0,2"}, new String[]{"1,0", "1,1", "1,2"}, new String[]{"2,0", "X", "2,2"}}, GameStateAfterPlayer1Move1);
        assertArrayEquals(new String[][]{new String[]{"0,0", "0,1", "0,2"}, new String[]{"1,0", "O", "1,2"}, new String[]{"2,0", "X", "2,2"}}, GameStateAfterPlayer2Move1);
        assertArrayEquals(new String[][]{new String[]{"0,0", "0,1", "0,2"}, new String[]{"1,0", "O", "1,2"}, new String[]{"2,0", "X", "X"}}, GameStateAfterPlayer1Move2);
        assertArrayEquals(new String[][]{new String[]{"O", "0,1", "0,2"}, new String[]{"1,0", "O", "1,2"}, new String[]{"2,0", "X", "X"}}, GameStateAfterPlayer2Move2);
        assertArrayEquals(new String[][]{new String[]{"O", "0,1", "0,2"}, new String[]{"1,0", "O", "1,2"}, new String[]{"X", "X", "X"}}, WinningMove);
    }
}
