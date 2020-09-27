public class Mastermind {

    private Board board;
    private Action makeSecretCode ;
    private Action putPattern ;
    private Action feedback ;


    private void play() {


        do {
            this.board = new Board();
            this.makeSecretCode =  new MakePatternCodePegAction(board);
            this.putPattern = new PutPatternCodePegAction(board);
            this.feedback  = new FeedBackAction(board);

            boolean correctPattern;
            boolean maxIntents;

            makeSecretCode.execute();
            do {
                putPattern.execute();
                feedback.execute();
                board.incrementCounter();
                correctPattern = board.isCorrectPattern();
                maxIntents  = board.maxIntentsComplete();

                if(correctPattern)
                    Message.PLAYER_WIN.writeln();
                if(maxIntents)
                    Message.MAX_INTENTS_APPROACHED.writeln();

                board.write();
            } while (!(correctPattern && maxIntents));


        } while (this.isResumedGame());
    }

    private boolean isResumedGame(){
        return new YesNoDialog().read(Message.RESUME.toString());
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

}
