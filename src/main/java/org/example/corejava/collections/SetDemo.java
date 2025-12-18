package org.example.corejava.collections;

import java.util.*;

public class SetDemo {
    public static void main(String args[]){

//        pro - not an index based and duplicate ele not allowed
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(0);

        System.out.println(set);

        for(int data : set){
            System.out.println(data);
        }

        HashSet<String> names = new HashSet<>();
        names.add("Sumit");
        names.add("sUmit");
        names.add("suMit");
        names.add("sumIt");

        System.out.println(names);




    }
}
