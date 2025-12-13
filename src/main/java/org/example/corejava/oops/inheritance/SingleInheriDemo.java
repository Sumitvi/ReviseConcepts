package org.example.corejava.oops.inheritance;


class Info{

    String name = "Sumit";
    String std = "B TECH";

    public void name(){
        System.out.println(this.name);
    }

}


class SingleExe extends Info{

    int age = 21;

    public void standard(){
        System.out.println(super.std);
    }

    public int getAge(int age){
        return age;
    }

}

public class SingleInheriDemo {

    public static void main(String args[]){

//        Single Level Inheritance

        SingleExe 

    }
}
