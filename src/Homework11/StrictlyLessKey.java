package Homework11;

import java.util.TreeMap;

public class StrictlyLessKey {
    public static void main(String[] args) {

        TreeMap<Integer, String> tree_map1 = new TreeMap<Integer, String>();
        tree_map1.put(10, "Red");
        tree_map1.put(20, "Green");
        tree_map1.put(30, "Yellow");
        tree_map1.put(40, "White");
        tree_map1.put(50, "Black");

        System.out.println("Original TreeMap content: " + tree_map1);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s) : " + tree_map1.headMap(10, true));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s) : " + tree_map1.headMap(20, true));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s) : " + tree_map1.headMap(70, true));

    }
}
