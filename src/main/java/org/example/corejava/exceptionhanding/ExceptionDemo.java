package org.example.corejava.exceptionhanding;



//Exception - An unwanted event that disturb the normal excution of program
//1.checked exception -  IOException , SQLException - handled by compiler
//2. unchecked exception - Arthemetic , NullPointer , IndexOutOfBound - occurs at runtime


public class ExceptionDemo {

    public static void main(String[] args) {

//        try{
//            throw new ArithmeticException("Request fail due to Arthematic Exception");
////            System.out.println(10/0);
//        }catch (Exception e){
//            e.printStackTrace();
//        }


        try{
            throw new ArrayIndexOutOfBoundsException("Req fail due to Array Index out of bound");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
