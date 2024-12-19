package collection;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        // ArrayList
        List a1 = new ArrayList();
        //Adding elements
        a1.add(1.3f);
        a1.add("Mahnaz");
        a1.add(10);
        a1.add("Ayan");
        a1.add(666666666);

        System.out.println(" ArrayList Elements");
        System.out.println("\t" + a1);

        System.out.println("element at index 2nd :" + a1.get(2));
        System.out.println("element at index 4nd :" + a1.get(4));

        //generic
        List<String> a2 = new ArrayList<>(); //{"Aishwarya", "Rushi"....}
        a2.add("Aishwarya");
        a2.add("Rushi");
        a2.add("Pratibha");
        a2.add("Shubham");
        a2.add("Rohan");
        System.out.println("a2 : " + a2);
        System.out.println("a2.get(3) : " + a2.get(3));

        a2.remove(3);
        a2.remove("Rohan");
        System.out.println("a2 after remove(3) : " + a2);

        a2.set(1, "Amit");
        System.out.println("a2 after a2.set(1, \"Amit\") : " + a2);

        System.out.println("index of Rohan : " + a2.indexOf("Rohan"));

        List<String> a3 = new ArrayList<>();
        a3.add("Komal");
        a3.add("Onkar");
        a3.add("Jayesh");

        a2.addAll(a3);
        System.out.println("a2 after adding a3 : " + a2);
        a2.clear();
        System.out.println("a2 after clear() : " + a2);

        System.out.println("a3 : " + a3);
        List<String> a4 = new ArrayList<>();
        a4.add("Parimal");
        a4.add("Diksha");
        a3.addAll(a4);
        System.out.println("a3 after adding a4 : " + a3);

        /*for (String name : a2) {
            if (name.contains("Shubham")) {
                System.out.println("name : " + name);
            }
        }*/

    }
}