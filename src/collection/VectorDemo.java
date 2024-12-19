package collection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();
        v1.add("Rahul");
        v1.add("Rushi");
        v1.add("Priyanka");
        v1.add("Diksha");

        System.out.println("v1 : " + v1);

        v1.set(2, "Aishwarya");
        System.out.println("v1 after set(Aishwarya) : " + v1);

        v1.remove(2);
        System.out.println("v1 after remove(2) : " + v1);

        System.out.println("v1.contains(\"Rushi\") : " + v1.contains("Rushi"));


        Vector<String> v2 = new Vector<>();
        v2.add("Prasad");
        v2.add("Pankaj");

        System.out.println("v1 : " + v1);
        v1.addAll(v2);
        System.out.println("v1 after v1.addAll(v2) " + v1);

        v1.addAll(1, v2);
        System.out.println("v1 after v1.addAll(2, v2) " + v1);

    }
}
