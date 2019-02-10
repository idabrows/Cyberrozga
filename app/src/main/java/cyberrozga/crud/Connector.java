package com.example.cyberrozga.crud;

import com.example.cyberrozga.settings.DBConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Connector {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection c=null;
        Class.forName("com.mysql.jdbc.Driver");
        c= DriverManager.getConnection("jdbc:mysql:"+ DBConfig.myURL,DBConfig.myLogin,DBConfig.myPassword);
        return c;
    }



}
