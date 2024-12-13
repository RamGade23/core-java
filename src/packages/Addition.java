package packages;

public class Addition {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println("sum is : " + result);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
