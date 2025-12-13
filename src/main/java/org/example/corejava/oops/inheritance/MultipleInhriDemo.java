package org.example.corejava.oops.inheritance;


class Vehicle{

    public void speed(){
        System.out.println("90 KM");
    }

    public void engine(){
        System.out.println("500 CC");
    }
}

class BMW extends Vehicle{
    public void ModelName(){
        System.out.println("BMW 2037");
    }

    public boolean isworking(){
        return true;
    }
}


class newBMWModel extends BMW{
    public void ModelName(){
        System.out.println("BMW 2303");
    }
}

public class MultipleInhriDemo {
    public static void main(String[] args) {

//        Multiple Inheritance


    }
}
