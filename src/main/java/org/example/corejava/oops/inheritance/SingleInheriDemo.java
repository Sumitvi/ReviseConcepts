package org.example.corejava.oops.inheritance;


class Info{

    String name = "Sumit";
    String std = "B TECH";

    public void name(){
        System.out.println(this.name);
    }

}


class SingleExe extends Info{



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

        SingleExe e1 = new SingleExe();
        e1.name();
        e1.standard();
        System.out.println(e1.getAge(22));

    }
}
