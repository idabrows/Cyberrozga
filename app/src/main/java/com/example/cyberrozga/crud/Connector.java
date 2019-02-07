package com.example.cyberrozga.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
    public static Connection getConnection(){
        Connection c=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://192.168.43.140:3306/school","matt","");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }


    public static String getString(){
        Connection conn=getConnection();
        String s="x";
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
                String firstName = rs.getString("mail");
                s+=firstName;
                String lastName = rs.getString("password");
                        // print the results

                        System.out.format("%s, %s, %s\n", id, firstName, lastName);
            }
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.print(getString());
    }
}
