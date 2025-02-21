package com.atos.deproj.sprint2145.design.sprint3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMpIterator {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        //lets iterate hashmap by using iterator
        Iterator<Map.Entry<String, Integer>> iteartor = map.entrySet().iterator();
        while (iteartor.hasNext()) {
            Map.Entry<String, Integer> entry = iteartor.next();
            System.out.println(entry.getKey() + " ->" + entry.getValue());
        }
           //by using advanced for loop
        for (Map.Entry<String, Integer> entry2 : map.entrySet()) {
                System.out.println(entry2.getKey() + " -> " + entry2.getValue());
            }


    }
}
