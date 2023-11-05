package Homework11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class iterateReverse {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element1");
        linkedList.add("Element2");
        linkedList.add("Element3");
        linkedList.add("Element4");
        linkedList.add("Element5");

        Iterator<String> iterator = linkedList.descendingIterator();
        while (iterator.hasNext());
        {
            System.out.println(iterator.next());
        }
    }
}
