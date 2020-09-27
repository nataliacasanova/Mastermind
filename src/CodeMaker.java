public class CodeMaker extends Player {

    private Action putPattern;

    public CodeMaker(Board board) {
        super(board);
        putPattern = new PutPatternCodePegAction(board);
    }

   }
