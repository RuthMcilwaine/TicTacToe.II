package core;

import core.Coordinates;

public interface Player {

    public String getPiece();
    public Coordinates getNextMove();
    public void setNextMove( Coordinates userCoordinates);

}
