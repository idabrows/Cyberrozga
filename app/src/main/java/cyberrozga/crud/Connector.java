package com.example.cyberrozga.crud;

import com.example.cyberrozga.settings.DBConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Connector {
    public static Connection getConnection(){
        Connection c=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql:"+ DBConfig.myURL,DBConfig.myLogin,DBConfig.myPassword);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }



}
