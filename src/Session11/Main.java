package Session11;

import java.util.*;

public class Main {
    private static int number;

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(22);
        arrayList.add(23);
        arrayList.add(24);
        arrayList.add(27);
        arrayList.add(28);
        for (Integer array: arrayList) {
            System.out.println(array);
        }
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Mihai");
        myMap.put(2, "Geo");
        myMap.put(3, "Bogdan");
        myMap.put(4, "Andra");
        Set<Integer> integers = myMap.keySet();
        for (Integer integer : integers) {
            System.out.println(myMap.get(integer));
        }
        for (Integer numar : integers) {
            if (number % 2 == 0) {
                myMap.remove(number);

            }
        }
        System.out.println(myMap);
    }
}



//
//        ArrayList<Integer> vectori = new ArrayList<>();
//        vectori.addAll(integers);
//        System.out.println(vectori);
//
//        ArrayList<Integer> numerePare = new ArrayList<>();
//
//        for (int i = 0; i < vectori.size(); i++) {
//            if(vectori.get(i) % 2 == 0) {
//               numerePare.add(vectori.get(i));
//            }
//        }
//        vectori.removeAll(numerePare);
//
//        System.out.println(vectori);





