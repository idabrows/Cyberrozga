package com.example.cyberrozga.controller;

import com.example.cyberrozga.crud.Connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LoginController {

    public static ArrayList<String> getString() throws SQLException, ClassNotFoundException {
        Connection conn= Connector.getConnection();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("");
        StringBuilder s= new StringBuilder();
        try
        {
            //System.out.print(getConnection());

            String query = "SELECT * FROM credentials";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next())
            {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                s.append(email).append(":");
                String password = rs.getString("password");
                s.append(password).append(":");
                String type = rs.getString("position");
                s.append(type);
                s.append(id);
                strings.add(s.toString());
                s = new StringBuilder();
            }
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return strings;
    }


}
