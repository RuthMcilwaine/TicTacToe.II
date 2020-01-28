import java.util.List;

public class Game {
    Board board = new Board();
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private List<EndGameCondition> endGameConditions;

    public Game(Player player1, Player player2, List<EndGameCondition> endGameConditions) {
        this.player1 = player1;
        this.currentPlayer = this.player1;
        this.player2 = player2;
        this.endGameConditions = endGameConditions;
    }

    public String display(){
        return board.toString();
    }


    public void takeTurn() {
        //getcurrent Players move
        Coordinates currentPlayerMove = this.currentPlayer.getMove();
        //check if the move is valid
        if(!isMoveValid(currentPlayerMove)){return; }

        //add the move to the board
        this.board.addMove(currentPlayer.getPiece(), currentPlayerMove);
        //check if the game is over
        if (isGameOver()){return;};
        //change player if move accepted and no winner
        this.changePlayer();
        //return current state

    }

    private boolean isGameOver() {
        for(EndGameCondition endGameCondition :endGameConditions ){
            if(endGameCondition.isGameOver(board,currentPlayer)){return true;};
        }
        return false;
    }

    private Player getCurrentPlayer() {
        return currentPlayer;
    }

    private void changePlayer() {
    }

    private boolean isMoveValid(Coordinates move) {
        return true;
    }
}
