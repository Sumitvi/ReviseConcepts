package org.example.corejava.multithreading;

interface Animal{
    void sound();
}

class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("Dog Bark");
    }
}

public class InterFaceDemo {

    public static void main(String[] args) {

        Animal a1 = new Dog();
        a1.sound();



    }
}
