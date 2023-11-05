package Homework11;
import java.util.ArrayList;
import java.util.HashSet;
class hashSetToList {
    public static void main(String[] args)
    {

        HashSet<String> flower_set = new HashSet<>();

        flower_set.add("lalea");
        flower_set.add("trandafir");
        flower_set.add("orhidee");
        flower_set.add("galbenele");

        ArrayList<String> flower_array
                = new ArrayList<>(flower_set);

        System.out.println(
                "Elements of flower Arraylist are :");
        System.out.println(flower_array);

        System.out.print("Element at index 0 is : "
                + flower_array.get(0) + " ");
    }
}
