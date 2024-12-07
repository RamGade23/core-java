package staticKeyword;

public class Calculate {
    int a;

    static int cube(int x) {
        return x * x * x;
    }

    public void msg() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        int result = Calculate.cube(2);
        System.out.println(result);

        //can not refer non static data member
        //System.out.println(a);

        Calculate calculate = new Calculate();
        System.out.println(calculate.a);
        //msg();
    }
}
