package Homework11;

import java.util.*;

public class treeSetSmallerElement {
    public static void main(String[] args)
    {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(40);
        set.add(50);
        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println("TreeSet: " + set);

        System.out.println("Floor value of 33: "
                + set.floor(33));
    }
}

