package org.example.corejava.concepts.KeywordsAndVariables;


class Demo{

    int a = 20;  // instance variable
    static int c = 20; // static variable


    public void Age(){
        int b = 30; // local variable
//        static int c = 20; // static variable not allowed

        System.out.println(b);
    }

//    public void count(){
//        static int d = 40; static variable not allowed
//    }


//    Java me static sirf class ke liye hota hai, method ke andar nahi.
}




public class VariableDemo {
    public static void main(String[] args) {

//        type of variables
//        1. instance - aise variables jo class ke andar aur method ke bahar ho
//        2. local - aise variable jo method ke anadar ho
//        3. static - aise variable jo static keyword se bane ho



//    Accessing Static Variable
//        className.variableName
        System.out.println(Demo.c);

    }
}
