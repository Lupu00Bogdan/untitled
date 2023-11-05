package Homework11;

import java.util.*;

class greatestOrEqualKeys {

    public static void main(String[] args)
    {

        TreeMap<Integer, String> tree = new TreeMap<Integer, String>();

        tree.put(100, "=> Element1");
        tree.put(120, "=> Element2");
        tree.put(140, "=> Element3");
        tree.put(200, "=> Element4");

        for (Map.Entry<Integer, String> map :
                tree.entrySet())

            System.out.println(map.getKey() + " "
                    + map.getValue());
    }
}

