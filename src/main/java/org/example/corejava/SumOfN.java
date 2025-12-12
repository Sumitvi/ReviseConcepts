package org.example.corejava;
import java.util.*;

public class SumOfN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value of N ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++){
            sum+=i;
        }

        System.out.println("Sum is " + sum);
    }
}
