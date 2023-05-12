package chess;

import boardergame.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new ChessException2("Error na instanciação ChessPosition: Valor valido é entre a1 e h8.");
        }
        this.column = column;
        this.row = row;
    }


    public char getColumn() {
        return column;
    }
    public void setColumn(char column) {
        this.column = column;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }


    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }
    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char) ('a'- position.getCollumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}
