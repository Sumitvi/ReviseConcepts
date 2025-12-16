package org.example.corejava.concepts;


abstract class Vehicle  {

    public void speed(){
        System.out.println("555 KM/HR");
    }

    abstract void vehicleName();

}

class BMW extends Vehicle{

    @Override
    void vehicleName(){
        System.out.println("BMW");
    }

}

public class AbstructClassDemo {

    public static void main(String args[]){

        Vehicle v1 = new BMW();
        v1.speed();
        v1.vehicleName();

    }
}
