package org.example.corejava;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String args[]){
//        int arr[] = new int[5];
//        arr[0] = 0;
//        arr[1] = 1;
//        arr[2] = 2;
//        arr[3] = 3;
//        arr[4] = 4;
//
//        System.out.println(Arrays.toString(arr));

        int arr[] = new int[5];

        for(int i=0; i<5; i++){
            arr[i] = i;
        }

        for(int num : arr){
            System.out.println(num);
        }


    }
}
