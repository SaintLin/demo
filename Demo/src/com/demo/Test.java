package com.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] asg) {
//        Integer i = 156;
//        Integer j = 156;
//        if (i == j)
//            System.out.println(true);
//            System.out.println(true);

//        System.out.println(Math.round(11.5));

        Map<String,String> map = new HashMap<>();
        map.put("1","one");
        map.put("2","tow");
        map.put("3","three");
        map.put("4","four");
        map.put("5","five");

        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }

        Set<String> keys = map.keySet();
        keys.remove("1");
        Collection<String> values = map.values();

        System.out.println(keys);
        System.out.println(values);
    }
}
