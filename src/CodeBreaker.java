public class CodeBreaker  extends Player{

    private Action makePattern;
    private Action feedback;

    public CodeBreaker(Board board) {
        super(board);
        makePattern = new MakePatternCodePegAction(board);
        feedback = new FeedBackAction(board);
    }

    public void MakePatternCodePeg (){

    }
}
