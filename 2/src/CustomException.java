
class DivideByZeroException extends Exception {
    public DivideByZeroException(String errorMessage) {
        super(errorMessage);
    }
}

public class CustomException {

    static float division(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("invalid denominator");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try {
            division(a, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
