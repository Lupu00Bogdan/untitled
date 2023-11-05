package Homework11;

import java.util.ArrayList;
import java.util.Collections;

public class sortList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Romania");
        list.add("Japonia");
        list.add("Feroe");
        list.add("Bulgaria");

        System.out.println("Inainte de sortare : " + list);
        Collections.sort(list);
        System.out.println("Dupa sortare : " + list);
    }
}
