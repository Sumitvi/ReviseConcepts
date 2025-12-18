package org.example.corejava.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0 , 1);
        map.put(1 , 1);
        map.put(2 , 1);
        map.put(3 , 1);
        map.put(4 , 1);

        System.out.println(map);

        for(Map.Entry<Integer, Integer> entry : map.entrySet() ){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
