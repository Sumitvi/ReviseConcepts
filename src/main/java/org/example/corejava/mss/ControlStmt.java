package org.example.corejava.mss;
import java.util.*;

public class ControlStmt {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("You Can Vote");
        }else{
            System.out.println("You Can'nt Vote");
        }

    }
}
