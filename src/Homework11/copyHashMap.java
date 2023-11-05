package Homework11;

import java.util.HashMap;
import java.util.Map;

class copyHashMap {
    public static <K, V> Map<K, V>
    copyMap(Map<K, V> original)
    {

        Map<K, V> second_Map = new HashMap<>();

        for (Map.Entry<K, V> entry : original.entrySet()) {

            second_Map.put(entry.getKey(),
                    entry.getValue());
        }

        return second_Map;
    }

    public static void main(String[] args)
    {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);

        Map<String, Integer> second_Map = copyMap(hashMap);

        System.out.println(second_Map);
    }
}
