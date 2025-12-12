package org.example.corejava;
import java.util.*;

public class EvenOrOdd {

    public static void main(String[] args) {

//        Check if a number is even or odd
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        if(val % 2 == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }

    }
}
