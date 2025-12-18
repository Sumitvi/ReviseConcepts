package org.example.corejava;

import static java.lang.Class.forName;

public class JDBCExample {

    public static String LOAD_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static String URL = "jdbc:mysql://localhost:3306/testdb";
    public static String PASSWORD = "Sumit@2004";
    public static String USERNAME = "root";


    public static void main(String[] args) throws ClassNotFoundException {

//        Load Driver
        Class.forName(LOAD_DRIVER);

        


    }
}
