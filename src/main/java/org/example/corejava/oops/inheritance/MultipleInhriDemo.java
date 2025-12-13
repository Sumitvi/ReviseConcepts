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
    public void NewModelName(){
        System.out.println("BMW 2303");
    }
}

public class MultipleInhriDemo {
    public static void main(String[] args) {

//        MultiLeval Inheritance

        newBMWModel b1 = new newBMWModel();
        b1.speed();
        b1.engine();
        b1.ModelName();
        System.out.println(b1.isworking());
        b1.NewModelName();

    }
}
