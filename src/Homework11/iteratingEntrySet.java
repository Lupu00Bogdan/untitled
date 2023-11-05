package Homework11;


import java.util.Map;
import java.util.HashMap;

class iteratingEntrySet
{
    public static void main(String[] arg)
    {
        Map<String,String> gfg = new HashMap<String,String>();

        gfg.put("GFG", "Element1");
        gfg.put("Practice", "Element2");
        gfg.put("Code", "Element3");
        gfg.put("Quiz", "Element4");

        for (Map.Entry<String,String> entry : gfg.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
}
