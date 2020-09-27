public abstract class Action {

    protected Board board;

    public abstract void execute();

    public Action(Board board){ this.board = board; }
}
