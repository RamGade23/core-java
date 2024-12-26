package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Double> hm = new TreeMap<>();

        hm.put("Zara", 44.44);
        hm.put("Zara", 44.44);
        hm.put("Mahnaz", 44.44);
        hm.put("Ayan", new Double(1378.00));
        hm.put("Daisy", new Double(99.22));
        hm.put("Qadir", new Double(-19.08));
        hm.put("Qadir", null);

        for (Map.Entry<String, Double> enrty : hm.entrySet()) {
            System.out.println(enrty.getKey() + ":" + enrty.getValue());
        }
    }
}
