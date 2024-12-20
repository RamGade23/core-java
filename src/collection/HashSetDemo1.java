package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(20);
        hs.add(50);
        hs.add(10);
        hs.add(30);
        hs.add(40);
        hs.add(null);
        hs.add(null);

        System.out.println("hs : " + hs);
    }
}
