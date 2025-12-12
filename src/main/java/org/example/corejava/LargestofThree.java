package org.example.corejava;
import java.util.*;

public class LargestofThree {

    public static void main(String args[]){

//        Largest of 3 numbers using if–else
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println("A is Greater " + a);
        }else if(b > a && b > c){
            System.out.println("B is Greater " + b);
        }else{
            System.out.println("C is Greater " + c);
        }
    }
}
