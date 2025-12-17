package org.example.corejava.mss;
import java.util.*;

public class MultiplicationTable {

    public static void main(String args[]){

//      Print multiplication table of a given number
        System.out.println("Enter value of n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n + "*" + i + "=" + n * i);
        }

    }
}
