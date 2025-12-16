package org.example.corejava.exceptionhanding;

import java.io.IOException;

public class DemoException {

    public static void main(String[] args) {

        try{
            throw new IOException("Req Fails Due to IO Exception");
        }catch (Exception e){
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
