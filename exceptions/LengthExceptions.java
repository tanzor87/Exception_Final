package exceptions;

public class LengthExceptions extends Exception {
    private int len;
    public LengthExceptions(String message, int len){
        super(message);
        this.len = len;
    }

    public int getLen() {
        return len;
    }
}
