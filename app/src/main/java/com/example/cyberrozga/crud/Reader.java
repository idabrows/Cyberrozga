package com.example.cyberrozga.crud;

import com.example.cyberrozga.domain.Grade;
import com.example.cyberrozga.domain.SchoolClass;
import com.example.cyberrozga.domain.Subject;
import com.example.cyberrozga.domain.users.Parent;
import com.example.cyberrozga.domain.users.Pupil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class Reader {



    public ArrayList<Pupil> getListOfStudents(Parent parent){
        ArrayList<Pupil> pupils = new ArrayList<>();

        Connection conn= null;
        try {
            conn = Connector.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try
        {
            int pID=parent.getId();
            String query = "SELECT s.id as 'id', s.name as 'name', s.surname as 'surename', c.email as 'email', c.password as 'password'," +
                    " s.class as 'class' FROM credentials as c JOIN students as s on s.id=c.id WHERE s.parent1="+pID+" OR s.parent2="+pID;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
                int id = rs.getInt("id");
                String name=rs.getString("name");
                String surename=rs.getString("surename");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String classMy = rs.getString("class");
                pupils.add(new Pupil(id,name,surename,null,new SchoolClass(classMy,null),null,email,password));
            }
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return pupils;
    }

    public ArrayList<Subject> getListOfSubjects(Pupil pupil){
        ArrayList<Subject> subjects = new ArrayList<>();
        Connection conn= null;
        try {
            conn = Connector.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try
        {
            int pID=pupil.getId();
            String query = "SELECT subjects.name as 'name' from subjects JOIN" +
                    " classToSubject on classToSubject.subject=subjects.id join" +
                    " students on classToSubject.class=students.class where students.id="+pID;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
                String name=rs.getString("name");
                subjects.add(new Subject(name));
            }
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return subjects;
    }

    public ArrayList<Grade> getListOfGrades(Pupil pupil, Subject subject){
        ArrayList<Grade> grades = new ArrayList<>();
        Connection conn= null;
        try {
            conn = Connector.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try
        {
            int pID=pupil.getId();
            String query = "SELECT * FROM grades JOIN subjects on subjects.id=grades.subject " +
                    "WHERE grades.id_student="+pID+ " and subjects.name='"+subject.toString()+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
                int grade=rs.getInt("grade");
                String weight=rs.getString("weight");
                Date date=rs.getDate("date");
                grades.add(new Grade(pupil,grade,subject,pupil.getSclass(),date,weight));
            }
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return grades;
    }

}