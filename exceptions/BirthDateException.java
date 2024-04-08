package exceptions;

public class BirthDateException extends Exception {

    String date;
    public BirthDateException(String message, String date) {
        super(message);
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}
