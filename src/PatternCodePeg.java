import java.util.Arrays;
import java.util.Random;

public class PatternCodePeg {

    private CodePeg[] codePeg;

    public PatternCodePeg() {
        codePeg = new CodePeg[Row.MAX_PATTERN];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatternCodePeg that = (PatternCodePeg) o;
        return Arrays.equals(codePeg, that.codePeg);
    }

    public void generateRandom() {

        for (int i = 0; i < codePeg.length; i++) {
            CodePeg aux;
            do {
                int position = new Random().nextInt(CodePeg.values().length);
                aux = CodePeg.values()[position];
            } while (containCodePeg(aux));
            codePeg[i] = aux;

        }

    }

    public boolean containCodePeg(CodePeg codePeg) {
        for (int i = 0; i < this.codePeg.length; i++) {
            if (this.codePeg[i] != null && this.codePeg[i].equals(codePeg))
                return true;
        }
        return false;
    }

}
