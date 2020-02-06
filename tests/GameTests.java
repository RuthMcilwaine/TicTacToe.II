import core.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GameTests {


    @Test
    void displaysInvalidMoveMsgWhenMoveIsNotAccepted() {

        List<Coordinates> player1Moves = new ArrayList<>();
        player1Moves.add(new Coordinates(2, 1));
        Player player1 = new TestPlayer("X", player1Moves);
        Player player2 = new TestPlayer("O", player1Moves);
        Game game = new Game(player1, player2, new ArrayList<>());
        game.takeTurn();
        TurnStatus result = game.takeTurn();

        Assertions.assertEquals(result, TurnStatus.InvalidMove);
    }

    @Test
    void displaysSuccessMsgWhenMoveIsAccepted() {

        List<Coordinates> player1Moves = new ArrayList<>();
        player1Moves.add(new Coordinates(2, 1));
        Player player1 = new TestPlayer("X", player1Moves);
        List<Coordinates> player2Moves = new ArrayList<>();
        player2Moves.add(new Coordinates(1, 1));
        Player player2 = new TestPlayer("O", player2Moves);
        Game game = new Game(player1, player2, new ArrayList<>());
        game.takeTurn();
        TurnStatus result = game.takeTurn();

        Assertions.assertEquals(result, TurnStatus.Success);
    }

    @Test
    void displaysGameOverMsgWhen3PiecesAreInARow() {

        List<Coordinates> player1Moves = new ArrayList<>();
        player1Moves.add(new Coordinates(2, 1));
        player1Moves.add(new Coordinates(2, 0));
        player1Moves.add(new Coordinates(2, 2));
        Player player1 = new TestPlayer("X", player1Moves);

        List<Coordinates> player2Moves = new ArrayList<>();
        player2Moves.add(new Coordinates(1, 1));
        player2Moves.add(new Coordinates(1, 0));
        Player player2 = new TestPlayer("O", player2Moves);

        List<EndGameCondition> endGameConditions = new ArrayList<>();
        endGameConditions.add(new HorizontalWinCondition());
        endGameConditions.add(new VerticalWinCondition());
        endGameConditions.add(new DiagonalWinCondition());
        endGameConditions.add(new DrawWinCondition());

        Game game = new Game(player1, player2, endGameConditions);
        game.takeTurn();
        game.takeTurn();
        game.takeTurn();
        game.takeTurn();
        TurnStatus result = game.takeTurn();

        Assertions.assertEquals(result, TurnStatus.GameOver);
    }

    @Test
    void gameStartsWithCurrentPlayerAsPlayer1() {

        List<Coordinates> player1Moves = new ArrayList<>();
        Player player1 = new TestPlayer("X", player1Moves);
        Player player2 = new TestPlayer("O", player1Moves);
        Game game = new Game(player1, player2, new ArrayList<>());

        Assertions.assertEquals(player1, game.getCurrentPlayer());
    }

    @Test
    void gameStartsWithCurrentPlayerAsPlayer2() {

        List<Coordinates> player1Moves = new ArrayList<>();
        player1Moves.add(new Coordinates(0, 1));
        Player player1 = new TestPlayer("X", player1Moves);

        List<Coordinates> player2Moves = new ArrayList<>();
        player2Moves.add(new Coordinates(1, 1));
        Player player2 = new TestPlayer("O", player2Moves);
        Game game = new Game(player1, player2, new ArrayList<>());
        game.takeTurn();

        Assertions.assertEquals(player2, game.getCurrentPlayer());
    }
}
