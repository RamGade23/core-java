package collection.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringOccurrences {
    public static void main(String[] args) {
        // Input list of strings
        List<String> strings = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "apple");

        // Map to store occurrences of each string
        Map<String, Integer> stringCountMap = new HashMap<>();

        // Iterate through the list and count occurrences
        for (String str : strings) {
            if (stringCountMap.containsKey(str)) {
                // Increment count if the string is already in the map
                stringCountMap.put(str, stringCountMap.get(str) + 1);
            } else {
                // Add the string to the map with a count of 1
                stringCountMap.put(str, 1);
            }
        }

        // Print occurrences of each string
        for (Map.Entry<String, Integer> entry : stringCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //stringCountMap.forEach((k, v) -> System.out.println(k + ":" + v));
        //stringCountMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
    }
}
