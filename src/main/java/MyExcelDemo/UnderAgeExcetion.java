package MyExcelDemo;

public class UnderAgeExcetion extends Exception {
    public UnderAgeExcetion() {

        super("You are under 18");
    }

    public UnderAgeExcetion(String message) {

        super(message);
    }
}
