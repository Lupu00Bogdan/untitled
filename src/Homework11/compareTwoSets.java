package Homework11;

import java.util.*;

public class compareTwoSets {
    public static void main(String[] argv)
    {

        Set<String> arrset1 = new HashSet<String>();

        arrset1.add("A");
        arrset1.add("B");
        arrset1.add("C");
        arrset1.add("D");
        arrset1.add("E");

        System.out.println("Primul set: "
                + arrset1);

        Set<String> arrset2 = new HashSet<String>();

        arrset2.add("A");
        arrset2.add("B");
        arrset2.add("C");
        arrset2.add("D");
        arrset2.add("E");

        System.out.println("Al 2-lea set: "
                + arrset2);

        boolean value = arrset1.equals(arrset2);

        System.out.println("Sunt ambele seturi egale? "
                + value);
    }
}
