package collection.map;

import collection.comparator.Employee;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Double> hm = new HashMap<>();

        // Put elements to the map
        hm.put("Zara", 44.44);
        hm.put("Zara", 44.44);

        hm.put("Mahnaz", 44.44);
        hm.put("Ayan", new Double(1378.00));
        hm.put("Daisy", new Double(99.22));
        hm.put("Qadir", new Double(-19.08));

        //clear the map
        hm.clear();

        //Does not allowed multiple null keys
        hm.put(null, 11.11);
        hm.put(null, 22.22);
        hm.put(null, 33.33);

        //allowed multiple null values
        hm.put("Rahul", 31.0);
        hm.put("Rohan", 41.0);
        hm.put("Rekha", 51.0);
        hm.put("Snehal", null);

        System.out.println("hm.isEmpty() : " + hm.isEmpty());

        //System.out.println(hm);
        Set<Map.Entry<String, Double>> entries = hm.entrySet();

        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
            /*String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("key : " + key + ", value : " + value);*/
        }


        System.out.println("Filter map");
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getKey() != null && entry.getKey().startsWith("R")) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }


    }
}
