package exceptions;

public class SexException extends Exception{
    private String sex;

    public SexException(String message, String sex) {
        super(message);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}
