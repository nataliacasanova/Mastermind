public class Board {

    private static final int MAX_INTENTS = 10;

    private Row[] row;
    private PatternCodePeg secretCode;
    private int counter;


    public Board() {
        row = new Row[MAX_INTENTS];
        counter = 0;
    }

    public boolean maxIntentsComplete() {
        return counter == (MAX_INTENTS - 1);
    }

    public boolean isCorrectPattern() {
        return row[counter].checkSecretCode(secretCode);
    }

    public void incrementCounter(){
        counter++;
    }

    public void generateSecretCode(){
            this.secretCode.generateRandom();
    }

    public void write(){

    }
}
