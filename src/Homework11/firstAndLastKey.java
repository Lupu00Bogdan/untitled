package Homework11;

import java.util.TreeMap;

public class firstAndLastKey {
    public static void main(String[] args) {

        TreeMap treeMap = new TreeMap<>();
        treeMap.put("1","One");
        treeMap.put("2","Two");
        treeMap.put("3","Three");
        treeMap.put("4","Four");
        treeMap.put("5","Five");

        System.out.println("Lowest key stored in Java TreeMap is :" + treeMap.firstKey());
        System.out.println("Highest key stored in Java TreeMap is :" + treeMap.lastKey());


    }
}
