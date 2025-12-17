package org.example.corejava.mss;

public class LoopsDemo {

    public static void main(String args[]){

//        For Loop

        for(int i=0; i<10; i++){
            System.out.println(i);
        }

//        While Loop

        int val = 10;

        while(val > 0){
            System.out.println(val);
            val--;

        }


//        Do While Loop
        int n = 10;

        do{
            System.out.println("Do While Loop Runs at Once");
            n--;
        }while( n > 0);
    }
}
