package Homework11;

import java.util.ArrayList;

public class trimCapacity {
    public static void main(String[] args) {

        ArrayList<Integer> Arr = new ArrayList<Integer>(9);

        Arr.add(5);
        Arr.add(3);
        Arr.add(1);
        Arr.add(7);
        Arr.add(9);

        Arr.trimToSize();
        System.out.println("Lista elementelor este : ");

        for (Integer number : Arr) {
            System.out.println("Number = " + number);
        }

    }
}
