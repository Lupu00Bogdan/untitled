package Homework11;

import java.util.Map;
import java.util.HashMap;

class iteratingKeySet
{
    public static void main(String[] arg)
    {
        Map<String,String> gfg = new HashMap<String,String>();

        gfg.put("GFG", "Element1");
        gfg.put("Practice", "Element2");
        gfg.put("Code", "Element3");
        gfg.put("Quiz", "Element4");

        for (String name : gfg.keySet())
            System.out.println("key: " + name);

        for (String url : gfg.values())
            System.out.println("value: " + url);
    }
}

