package Homework11;

import java.util.TreeSet;

class removeLastElementOfTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(0);
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        ts.add(6);

        System.out.println("Before removing " +
                "element from TreeSet: " + ts);

        System.out.println("First lowest element " +
                "removed is : " + ts.pollLast());
        System.out.println("After removing element" +
                " from TreeSet: " + ts);
        {
        }
    }
}
