package org.example.corejava.oops.inheritance;

class VehicleDemo{

    public void run(){
        System.out.println("Vehicle is Running");
    }

}


class Car extends VehicleDemo{
    public static void type(){
        System.out.println("Car");
    }
}

class Truck extends VehicleDemo{
    public static void type(){
        System.out.println("Truck");
    }
}



public class HierichalDemo {

    public static void main(String[] args) {

//        Hierarchical Inheritance - Ek parent class se multiple
//        child classes inherit karti hain

        Car c1 = new Car();
        c1.run();
        c1.type();

        Truck t1 = new Truck();
        t1.run();
        t1.type();


    }
}
