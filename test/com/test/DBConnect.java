package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    
    public Connection connect() throws ClassNotFoundException {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://mtss-qa.clrhc3wuuvb2.us-east-1.rds.amazonaws.com:5432"  , "lak_lpf", "lakanaplat");
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }
    
    public static void main(String[] args) throws ClassNotFoundException {
        DBConnect dbConnect = new DBConnect();
        dbConnect.connect();
    }
}
