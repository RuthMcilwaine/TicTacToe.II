package consoleShell;

import core.Coordinates;
import core.Player;

public class Human implements Player {
    private String piece;
    private Coordinates moves;

    @Override
    public String getPiece() {
        return piece;
    }

    @Override
    public Coordinates getMove() {
        return moves;
    }
}
