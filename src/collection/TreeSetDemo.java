package collection;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(20);
        ts.add(50);
        ts.add(10);
        ts.add(30);
        ts.add(40);

        System.out.println("ts : " + ts);

        System.out.println("ts.size() : " + ts.size());

        TreeSet ts1 = new TreeSet<>();
        ts1.addAll(ts);
        System.out.println("ts1 : " + ts1);

        TreeSet ts2 = new TreeSet<>();
        ts2.add("RRR");
        //ts2.add(10);
        System.out.println("ts2 : " + ts2);

    }
}
