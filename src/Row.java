public class Row {

    public static final int MAX_PATTERN = 4;

    private PatternCodePeg patternCodePeg;
    private PatternKeyPeg patternKeyPeg;

    public Row(PatternCodePeg patternCodePeg,PatternKeyPeg patternKeyPeg ){
        this.patternCodePeg = patternCodePeg;
        this.patternKeyPeg = patternKeyPeg;
    }

    public boolean checkSecretCode (PatternCodePeg secretCode){
        return this.patternCodePeg.equals(secretCode);
    }


}
