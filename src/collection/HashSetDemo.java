package collection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(40);
        hs.add(20);
        hs.add(30);
        hs.add(50);
        hs.add(10);
        hs.add(10);
        hs.add(null);
        hs.add(null);

        System.out.println("hs : " + hs);


        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Rohan");
        hs1.add("Salman");
        hs1.add("Aditya");
        hs1.add("");
        hs1.add("");
        hs1.add(null);
        hs1.add(null);

        System.out.println("hs1 : " + hs1);
        System.out.println("hs after addAll: " + hs);

        HashSet set = new HashSet<>();
        set.add("Rahul");
        set.add(10);
        System.out.println("set : " + set);
        set.addAll(hs);
        System.out.println("set : " + set);

        hs.addAll(set);
        System.out.println("hs : " + hs);

        HashSet<Object> obSet = new HashSet<>();
        obSet.add("Akash");
        obSet.add(10);
        obSet.add(20);
        System.out.println("obSet : " + obSet);

    }

}
