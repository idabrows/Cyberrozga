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
        String query = "SELECT * FROM credentials";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next())
        {
            int id = rs.getInt("id");
            String email = rs.getString("email");
            s.append(email).append(":");
            String password = rs.getString("password");
            s.append(password).append(":");
            String type = rs.getString("position");
            s.append(type).append(":");
            s.append(id);
            strings.add(s.toString());
            s = new StringBuilder();

        }
        st.close();
    return strings;
    }


}