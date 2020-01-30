# Tic Tac Toe Kata
Tic Tac Toe is one of the few games that transcends cultures and continents, it is easily understood and cost nothing to play.

The client who has requested us to develop this game happens to be an alien race that can interact tele-programatically with jar files (compiled java libraries). This means they are able to execute and interpret the result of any public java methods!

They are also an experimental bunch (so make sure they can only access methods you want them to)!


# Requirements
* 3x3 playing grid
* The players should be able to see the board before each move
* The current player should alternate between moves, except when an incorrect move is made, or the game is over
    * Out of bounds of the grid is an invalid move
    * Placing a move in a square that is occupied is an invalid move.
* There can be different types of players
    * consoleShell.Human player
    * Computer player (makes moves at random)
* The requirements for the game end conditions are customizable. Initially these conditions will be:
    * A player occupies 3 squares in a row horizontally 
    * A player occupies 3 squares in a row vertically
    * A player occupies 3 squares in a row diagonally 
    * The game is a draw when all squares are occupied and there has been no winner yet
* When the game starts:
    * "Welcome to Tic Tac Toe!"
* When a new game begins (where X is the first player):
    * "New core.Game! First move: X"
* When a player makes an invalid move the following message is shown:
    * "Incorrect move: X"
* When a player has made a successful move the following message is displayed (with the next player to make a move) :
    * "Your move player: O" 
* When a player has won the following message is displayed:
    * "core.Game over! winning player: X" 
* When the game is a draw:
    * "core.Game over! No Winner!"

The requirements above are for the first release, you know the following is being considered for the future, but may not happen depending on the success of the game:
    * Localization (output messages will be translated for different languages)
    * New game over conditions will be added
    * The players can choose the character that represents their piece
    * The game will be distributed to different platforms: Web, Nintendo switch, Xbox as well as an LED aerial drone display controlled via a smart phone

# Your goal
    * To complete the above requirements taking into consideration the planned future work
    * Apply a test first approach (outside-in). So start with an acceptance test
    * Your client will be checking in regularly. They are always time poor but would like to see progress in the form of working software even if all requirements aren't yet fully met
    * Use of source control to capture and iterative work practice and changes over time
