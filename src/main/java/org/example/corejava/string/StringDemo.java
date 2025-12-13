package org.example.corejava.string;

import sun.security.ec.point.ProjectivePoint;

public class StringDemo {

    public static void main(String[] args) {

        String s1 = "Sumit";
        String s2 = "Sumit";

        System.out.println(s1==s2); // returns True Bcz both created in scp and pointing same

        String s3 = "Sumit";
        String s4 = "sumit";

        System.out.println(s3==s4);
        // false because one is "Sumit" and other is "sumit"

        String s5 = new String("Sumit");

        System.out.println(s5==s1);


        String s = new String("Sumit");
        String t = new String("Sumit");

        System.out.println(s == t);
//        return false bcz new keyword used to create the new object

//            Java String immutable hota hai taaki SCP safe rahe,
//            security & thread safety mile, aur performance better ho.

//        String Immutable hota hai kyuki agar ye mutable hota to agar same content
//        ka String ek hi point karta hai scp me agar ek ko change karte to dusare me bhi
//        impact padhta

//        1. String - Immutable
//        2. StringBuilder - Mutable
//        3. StringBuilder - Mutable

//        StringBuilder aur StringBuffer isliye Mutable hai kyuki agar ye immutable hota to
//        har change me ek banaya object banata jo dikkat ka kaam hai 


    }
}
