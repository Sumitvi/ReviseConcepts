package org.example.corejava.exceptionhanding;

public class InterViewDemoQue {

    public static void main(String[] args) {

//        if we put Exception Class Before the ArithmeticException , and ArrayIndexOut of bound tab
//        kya hoga

        try{
            throw new ArithmeticException("Req Fails Due to Arithmetic Exception");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

//        if i put exception class before then it wo'nt work bcz Exception is Parent class
//        of AE and ArrayIndexOfBounds
    
    }
}
