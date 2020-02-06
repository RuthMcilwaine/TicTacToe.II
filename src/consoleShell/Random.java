package consoleShell;

import core.Coordinates;
import core.Player;

public class Random implements Player {
    private String piece;
    private Coordinates move;

    @Override
    public String getPiece() {
        return piece;
    }


    @Override
    public Coordinates getNextMove() {
        return move;
    }

    @Override
    public void  setNextMove(Coordinates move) {
         ;
    }
}
