package org.example.corejava.oops.inheritance.polymorphism;

class Shape{
    void draw(){
        System.out.println("Drawing Shape...");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Circle...");
    }
}

public class MethodOverridingDemo {

    public static void main(String[] args) {

        Shape s1 = new Shape();
        s1.draw();


    }
}
