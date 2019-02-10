package com.example.cyberrozga.crud;

import com.example.cyberrozga.domain.Grade;
import com.example.cyberrozga.domain.SchoolClass;
import com.example.cyberrozga.domain.users.Pupil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Writer {
    public void addGrade(Grade grade){
        Connection conn= null;
        try {
            conn = Connector.getConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try
        {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd ");
            String query = "INSERT INTO `grades`(`id_student`, `subject`, `grade`, `weight`, `Date`) " +
                    "VALUES ("+grade.getStudent().getId()+" , "+grade.getSubject().getId()+" , "+grade.getValue()+" , '"+grade.getWeight()+"' , '"+
                    dateFormat.format(grade.getDate()) +"' )";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }


}
