package org.example.corejava.oops.inheritance.polymorphism;

class OverLoadingDemo{

    public int add(int a , int b){
        return a+b;
    }

    public float add(int a , int b , int c ){
        return a+b+c;
    }

    public int add(int a , int b , int c , int d ){
        return a+b+c;
    }
}

public class MethodOverLoadingDemo {

    public static void main(String[] args) {

        OverLoadingDemo o1 = new OverLoadingDemo();
        System.out.println(o1.add(10 , 20));
        System.out.println(o1.add(20, 30 , 40));
        System.out.println(o1.add(10 , 20 , 30 , 40));

    }
}
