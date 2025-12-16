package org.example.corejava.concepts.KeywordsAndVariables;


//This and Super Keyword

class Animal{

    String name;
}


class Dog extends Animal{
    String name ;

    void print(){
        this.name ="Bhuri";
        super.name= "Animal";

        System.out.println("Parent Name " + super.name);
        System.out.println("Dog name " + this.name);
    }
}


final  class sumit{
    public void name(){
        System.out.println("Sumit");
    }

}

//class std extends sumit{
//
//}

//we can'nt extend the final class

public class KeyWordDemo {

    public static void main(String[] args) {

//        Final Keyword
//        When we declare something final we can'nt chnage those

        final int  a  = 20;
        System.out.println(a);
//        a = 30;
        


    }
}
