package Homework11;

import java.util.Map;
import java.util.HashMap;

class iteratingForEach
{
    public static void main(String[] arg)
    {
        Map<String,String> gfg = new HashMap<String,String>();

        gfg.put("GFG", "Element1");
        gfg.put("Practice", "Element2");
        gfg.put("Code", "Element3");
        gfg.put("Quiz", "Element4");

        gfg.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));

    }
}
