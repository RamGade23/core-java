package exceptions;

public class SystemExitDemo {
    public static void main(String[] args) {

        try {
            System.out.println("inside try block");
            System.exit(0);
            throw new Exception("explicitly throwing an exception");
        } catch (Exception e) {
            System.out.println("inside catch block : " + e.getMessage());
        } finally {
            System.out.println("inside finally block");
        }
    }
}
