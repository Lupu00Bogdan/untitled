package Homework11;

import java.util.ArrayList;

public class emptyArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>(4);

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        System.out.println("Numbers ArrayList: " + numbers);
        int numbers_size = numbers.size();
        System.out.println("Numbers Arraylist consist of: " + numbers_size + " elements ");

        numbers.clear();

        int numbers_size_new = numbers.size();
        System.out.println("Finally Numbers ArrayList consists of: " + numbers_size_new + " elements ");
    }
}
