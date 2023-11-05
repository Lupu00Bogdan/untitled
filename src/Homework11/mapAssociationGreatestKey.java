package Homework11;

import com.sun.source.tree.Tree;

import java.util.TreeMap;

public class mapAssociationGreatestKey {
    public static void main(String[] args) {

        TreeMap<Integer, String> tree_map1 = new TreeMap<Integer, String>();
        tree_map1.put(10, "Red");
        tree_map1.put(20, "Green");
        tree_map1.put(30, "Yellow");
        tree_map1.put(40, "Pink");

        System.out.println("Original TreeMap content: " + tree_map1);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s) : " + tree_map1.lowerKey(10));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s) : " + tree_map1.lowerKey(20));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Key(s) : " + tree_map1.lowerKey(70));
    }
}
