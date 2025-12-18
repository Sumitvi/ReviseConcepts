package org.example.corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class JDBCExample {

    public static String LOAD_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static String URL = "jdbc:mysql://localhost:3306/testdb";
    public static String PASSWORD = "Sumit@2004";
    public static String USERNAME = "root";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        Load Driver
        Class.forName(LOAD_DRIVER);


//        Make Connection
        Connection conn = DriverManager.getConnection(URL , USERNAME , PASSWORD);

//        


    }
}
