package Homework11;
import java.util.HashSet;

public class hashSetEmpty {
    public static void main(String args[])
    {
        HashSet<String> set = new HashSet<String>();

        set.add("Element1");
        set.add("Element2");
        set.add("Element3");
        set.add("Element4");
        set.add("Element5");

        System.out.println("HashSet: " + set);

        System.out.println("Is the set empty: " + set.isEmpty());

        set.clear();
        System.out.println("Is the set empty: " + set.isEmpty());
    }
}
