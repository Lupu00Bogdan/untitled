package Homework11;

import java.util.*;

class mappingKey {

    boolean checkForKey(String keyToBeChecked)
    {

        HashMap<String, Integer> hashMap =
                new HashMap<>();


        hashMap.put("first", 1);
        hashMap.put("second", 2);
        hashMap.put("third", 3);
        hashMap.put("fourth", 4);

        boolean result
                = hashMap.containsKey(keyToBeChecked);

        return result;
    }

    public static void main(String[] args)
    {

        mappingKey ob = new mappingKey();

        System.out.println(ob.checkForKey("fourth"));
    }
}

