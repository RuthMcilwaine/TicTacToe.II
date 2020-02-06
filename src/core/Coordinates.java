package core;

public class Coordinates {
    private int row;
    private int column;

    int getRow() {
        return row;
    }

    int getColumn() {
        return column;
    }

    public Coordinates(int row, int column){
        this.row = row;
        this.column = column;
    }

    public Coordinates (String userInput) {
        String[] userInputSplit = userInput.split(",");
        this.row = Integer.parseInt(userInputSplit[0]);
        this.column = Integer.parseInt(userInputSplit[1]);
    }

    static Coordinates parseCoordinates(String input){
        return new Coordinates(input);
    }
}
