package org.example.corejava;
import java.util.*;

public class CountDigit {

    public static void main(String[] args) {

        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while(num > 0){
            num = num / 10;
            count++;
        }

        System.out.println(count);


    }
}
