package org.example.corejava;

import java.sql.*;

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

//        Create Statement

        Statement statement = conn.createStatement();

//        create query
        String query = "select * from student";


//        Excute Query
        ResultSet resultSet = statement.executeQuery(query);


        while(resultSet.next()){

            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String course = resultSet.getString("course");

            System.out.println("Id " + " " + id);
            System.out.println("Name " + " " + name);
            System.out.println("Course " + " " + course);
        }


//        close connection

        conn.close();




    }
}
