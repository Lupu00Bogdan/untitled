package Homework11;

// Java code to illustrate the containsKey() method
import java.util.*;

public class hashMapKey {
    public static void main(String[] args)
    {

        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        hash_map.put(10, "Element1");
        hash_map.put(15, "Element2");
        hash_map.put(20, "Element3");
        hash_map.put(25, "Element4");
        hash_map.put(30, "Element5");

        System.out.println("Initial Mappings are: " + hash_map);

        System.out.println("Is the key '20' present? " +
                hash_map.containsKey(20));

        System.out.println("Is the key '5' present? " +
                hash_map.containsKey(5));
    }
}

