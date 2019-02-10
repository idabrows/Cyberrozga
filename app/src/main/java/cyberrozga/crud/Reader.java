package com.example.cyberrozga.crud;

import com.example.cyberrozga.domain.Grade;
import com.example.cyberrozga.domain.SchoolClass;
import com.example.cyberrozga.domain.Subject;
import com.example.cyberrozga.domain.users.Parent;
import com.example.cyberrozga.domain.users.Pupil;
import com.example.cyberrozga.domain.users.Teacher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Reader {



    public ArrayList<Pupil> getListOfStudents(Parent parent){
        ArrayList<Pupil> pupils = new ArrayList<>();

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
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try
        {
            int pID=pupil.getId();
            String query = "SELECT subjects.name as 'name', subjects.id as 'id' from subjects JOIN" +
                    " classToSubject on classToSubject.subject=subjects.id join" +
                    " students on classToSubject.class=students.class where students.id="+pID;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
                String name=rs.getString("name");
                int id=rs.getInt("id");
                subjects.add(new Subject(name,id));
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

    public ArrayList<Grade> getListOfGrades(Pupil pupil,Subject subject){
        ArrayList<Grade> grades = new ArrayList<>();
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

    public Map<SchoolClass,Subject> getListOfClassesAndSubjects(Teacher teacher){
        Map<SchoolClass,Subject> CS = new HashMap<>();
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
            int tID=teacher.getId();
            String query = "SELECT t.class as 'class', s.name as 'subject', s.id as 'id' FROM teachertoclass as t JOIN" +
                    " subjects as s on t.subjectid=s.id WHERE t.teacherid="+tID;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
                String sclass=rs.getString("class");
                String subject=rs.getString("subject");
                int id=rs.getInt("id");
                CS.put(new SchoolClass(sclass,null),new Subject(subject,id));
            }
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return CS;
    }

    public ArrayList<Pupil> getListOfStudents(SchoolClass sc){
        ArrayList<Pupil> pupils = new ArrayList<>();

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

            String query = "SELECT s.id as 'id', s.name as 'name', s.surname as 'surename', c.email as 'email', c.password as 'password', s.class as 'class'" +
                    " FROM credentials as c JOIN students as s on s.id=c.id WHERE s.class='" +sc.toString()+ "'";
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

    public boolean isAParent(Teacher t){
        ArrayList<Pupil> pupils = getListOfStudents(t);
        if(pupils.isEmpty()) return false;
        return true;
    }


}
