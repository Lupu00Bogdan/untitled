package Homework11;

import java.util.LinkedList;

public class firstAndLastElement {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(7);
        list.add(10);
        list.add(6);

        System.out.println("Primul element este: " + list.getFirst());
        System.out.println("Ultimul elementeste: " + list.getLast());
    }

}
