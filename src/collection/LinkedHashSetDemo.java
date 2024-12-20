package collection;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(20);
        lhs.add(50);
        lhs.add(10);
        lhs.add(30);
        lhs.add(40);
        lhs.add(null);
        lhs.add(null);

        System.out.println("lhs : " + lhs);
    }
}
