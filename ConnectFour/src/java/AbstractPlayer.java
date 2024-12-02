package java;

public abstract class AbstractPlayer {
    protected String name;

    public AbstractPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int makeMove(GameBoard board);
}
