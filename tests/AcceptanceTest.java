import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AcceptanceTest {

    @Test
    public void canPlayGame() {
        List<Coordinates> player1Moves = Arrays.asList(new Coordinates(2,1));
        Player player1 =  new TestPlayer("X", player1Moves );
        List<Coordinates> player2Moves = Arrays.asList(new Coordinates(1,1));
        Player player2 = new TestPlayer("O", player2Moves);


        List<EndGameCondition> endGameConditions = new ArrayList<>();
            endGameConditions.add(new HorizontalWinCondition());
            endGameConditions.add(new VerticalWinCondition());
            endGameConditions.add(new DiagonalWinCondition());
            endGameConditions.add(new DrawWinCondition());

        Game game = new Game(player1, player2, endGameConditions);
        String initialGameState = game.display();
        game.takeTurn();
        String GameStateAfterFirstMove = game.display();
        game.takeTurn();
        String GameStateAfterSecondMove = game.display();
        game.takeTurn();

        Assertions.assertEquals("Game over! winning player: X",);
        Assert.assertEquals(, initialGameState)
    }
}
