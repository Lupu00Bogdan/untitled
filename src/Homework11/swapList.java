package Homework11;

import java.util.ArrayList;
import java.util.Collections;

public class swapList {
    public static void main(String[] args) {

        ArrayList<String> List = new ArrayList<String>();
        List.add("Elementul 1");
        List.add("Elementul 2");
        List.add("Elementul 3");
        List.add("Elementul 4");
        List.add("Elementul 5");

        System.out.println("Inainte de schimbul elementelor in lista");
        System.out.println(List);
        Collections.swap(List, 1, 2);
        System.out.println("Dupa schimbul elementelor in lista");
        System.out.println(List);
    }
}
