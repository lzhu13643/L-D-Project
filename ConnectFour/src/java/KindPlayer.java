package java;

public class KindPlayer extends AbstractPlayer{
    public KindPlayer(String name) {
        super(name);
    }

    @Override
    public int makeMove(GameBoard board) {
        return 0;
    }
}
