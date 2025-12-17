package org.example.corejava.collections;
import java.util.*;

public class ListDemo {

    public static void main(String args[]){

        ArrayList<Integer> res = new ArrayList<>();
//        Adding Number in List
        res.add(1);
        res.add(2);
        res.add(3);
        res.add(4);
        res.add(1);

        System.out.println(res);

//        Checking empty List

        if(res.isEmpty()){
            System.out.println("List is Empty");
        }

//        getting index wise
        System.out.println(res.get(3));

//        iterating

        for(int data : res){
            System.out.println(data);
        }



    }
}
