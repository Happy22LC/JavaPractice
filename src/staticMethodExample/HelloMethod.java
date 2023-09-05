package staticMethodExample;

// called the Message class
public class HelloMethod {
    public static void main(String[] args) {
        String message = Message.getMessage("Japanese");
        System.out.println(message);
    }
}
