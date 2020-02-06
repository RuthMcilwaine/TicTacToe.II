package consoleShell;

import core.Coordinates;
import core.Player;

public class Human implements Player {
    private String piece;
    private Coordinates move;

    public Human(String piece) {
        this.piece = piece;
    }

    @Override
    public String getPiece() {
        return piece;
    }

    public void setNextMove(Coordinates move) {
        this.move = move;
    }

    @Override
    public Coordinates getNextMove() {
        return move;
    }
}
