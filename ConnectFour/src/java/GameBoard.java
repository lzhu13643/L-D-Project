package java;

public class GameBoard {
    private final int rows;
    private final int columns;
    private final char[][] board;

    public GameBoard(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.board = new char[rows][columns];
    }

    public boolean applyMove(int column, AbstractPlayer player) {
        // Logic to apply move to the board
        return true;
    }

    public int getColumns() {
        return columns;
    }
    public int getRows(){
        return rows;

    }
}
