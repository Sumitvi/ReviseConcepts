package org.example.corejava.oops.inheritance.abstrction;


abstract class Vehicle{
    abstract void start();

    public void stop(){
        System.out.println("Vehicle Stop");
    }
}

class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car Start by Key");
    }
}

class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike Start by Kick");
    }
}

public class AbstructionDemo {

    public static void main(String[] args) {

    Vehicle  c1 = new Car();
    c1.start();
    c1.stop();

    Vehicle b1 = new Bike();
    b1.start();
    b1.stop();

//    Abstruct class ka object nahi ban skta
//    Abstruct class me non abstruct method allow hoti hai


    }
}
