//Question 13

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}
public class ExceptionWithoutstackTrace
{
    public static void main(String[] args) {
        try {
            throw new CustomException("Something went wrong");
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}