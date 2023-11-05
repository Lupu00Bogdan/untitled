package Homework11;

import java.util.Iterator;
import java.util.TreeSet;

class reversingTreeSet {
    public static void main(String[] args)
    {

        TreeSet<Integer> setOfNumbers
                = new TreeSet<Integer>();

        setOfNumbers.add(2);
        setOfNumbers.add(5);
        setOfNumbers.add(1);
        setOfNumbers.add(7);
        setOfNumbers.add(4);

        System.out.println("TreeSet(setOfNumbers) : "
                + setOfNumbers);

        Iterator<Integer> iterator
                = setOfNumbers.descendingIterator();

        System.out.print("TreeSet in reverse order : ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
