package staticKeyword;

public class A1 {
    int d = 9;

    public static void main(String[] args) {
        A1 a1 = new A1();

        A2 a2 = new A2();
        a2.msg(a1);
    }

    static class A2 {

        public void msg(A1 a1) {
            System.out.println(a1.d);
        }

    }
}
