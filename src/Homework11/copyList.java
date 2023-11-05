package Homework11;

import java.util.ArrayList;

public class copyList {
    public static void main(String[] args) {

        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Element1");
        lista1.add("Element2");
        lista1.add("Element3");
        lista1.add("Element4");

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.addAll(lista1);
        System.out.println("Lista initiala :" + lista1);
        System.out.println("Lista dupa copiere : " + lista2);
    }
}
