package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertSetToList {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Rushi");
        set.add("Komal");
        set.add("Aishwarya");
        set.add("Praful");

        System.out.println("set : " + set);

        //Convert set into List
        List<String> list = new ArrayList<>(set);
        System.out.println("list : " + list);
    }
}
