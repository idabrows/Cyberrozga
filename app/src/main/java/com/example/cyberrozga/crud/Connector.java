package com.example.cyberrozga.crud;

import com.example.cyberrozga.settings.DBConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Connector {
    private static Connection getConnection(){
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


    public static ArrayList<String> getString(){
        Connection conn=getConnection();
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
                strings.add(s.toString());
                s = new StringBuilder();
                        // print the results

                        System.out.format("%s, %s, %s\n", id, email, password);
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

 //   public static void main(String[] args) {
 //       System.out.print(getString());
 //   }
}
