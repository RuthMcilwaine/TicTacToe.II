
import core.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AcceptanceTest {

    @Test
    public void canPlayGame() {
        Coordinates player1Moves = ( new Coordinates(2, 1) );
        Player player1 = new TestPlayer("X", player1Moves);
        Coordinates player2Moves = ( new Coordinates(1, 1) );
        Player player2 = new TestPlayer("O", player2Moves);

        List<EndGameCondition> endGameConditions = new ArrayList<>();
        endGameConditions.add(new HorizontalWinCondition());
        endGameConditions.add(new VerticalWinCondition());
        endGameConditions.add(new DiagonalWinCondition());
        endGameConditions.add(new DrawWinCondition());

        Game game = new Game(player1, player2, endGameConditions);
        String[][] initialGameState = game.display();
        game.takeTurn();
        String[][] GameStateAfterPlayer1Move = game.display();
        game.takeTurn();
        String[][] GameStateAfterPlayer2Move = game.display();

        assertArrayEquals(new String[][]{new String[]{"0,0", "0,1", "0,2"}, new String[]{"1,0", "1,1", "1,2"}, new String[]{"2,0", "2,1", "2,2"}}, initialGameState);
        assertArrayEquals(new String[][]{new String[]{"0,0", "0,1", "0,2"}, new String[]{"1,0", "1,1", "1,2"}, new String[]{"2,0", "X", "2,2"}}, GameStateAfterPlayer1Move);
        assertArrayEquals(new String[][]{new String[]{"0,0", "0,1", "0,2"}, new String[]{"1,0", "O", "1,2"}, new String[]{"2,0", "X", "2,2"}}, GameStateAfterPlayer2Move);

    }
}
