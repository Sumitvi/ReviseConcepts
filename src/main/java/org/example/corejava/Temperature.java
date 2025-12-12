package org.example.corejava;

import java.util.*;

public class Temperature {

    public static void main(String args[]){

//        Celsius to Farenheight
//        F = C * 9/5 + 32
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature Value ");
        int cel = sc.nextInt();

        int Far = cel * 9/5 + 32;
        System.out.println("Fahrenheit : " + Far);

    }
}
