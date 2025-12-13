package org.example.corejava.string;

public class ReverseStringDemo {

    public static void main(String args[]){

        String name  = "Sumit";
        int n = name.length()-1;
        StringBuilder sb = new StringBuilder();

        for(int i=n; i>=0; i--){
            sb.append(name.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
