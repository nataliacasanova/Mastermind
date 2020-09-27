public class Mastermind {

    private Board board;
    private CodeBreaker codeBreaker;
    private CodeMaker codeMaker;

    private void play() {
        do {
            this.board = new Board();
            this.codeMaker = new CodeMaker(board);
            this.codeBreaker = new CodeBreaker(board);
            this.board.write();
            do {
                this.turn.play();
                this.board.write();
            } while (!this.board.isTicTacToe(this.turn.getToken()));
            this.turn.writeWinner();
        } while (this.isResumedGame());
    }

    private boolean isResumedGame(){
        return new YesNoDialog().read(Message.RESUME.toString());
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

}
