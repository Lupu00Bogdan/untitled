package Homework11;

import java.util.TreeSet;

public class treeSet {
    public static void main(String args[])
    {
        TreeSet<String> tree = new TreeSet<String>();

        tree.add("Element1");
        tree.add("Element2");
        tree.add("Element3");
        tree.add("Element4");
        tree.add("Element5");
        tree.add("Element6");

        System.out.println("TreeSet: " + tree);

        TreeSet<String> tree_two = new TreeSet<String>();

        tree_two.add("Hello");
        tree_two.add("World");

        tree.addAll(tree_two);

        System.out.println("TreeSet: " + tree);
    }
}
