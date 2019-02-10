package com.example.cyberrozga.controller;

import com.example.cyberrozga.domain.Grade;
import com.example.cyberrozga.domain.RegisterPage;
import com.example.cyberrozga.domain.SchoolClass;
import com.example.cyberrozga.domain.Subject;
import com.example.cyberrozga.domain.users.Parent;
import com.example.cyberrozga.domain.users.Pupil;
import com.example.cyberrozga.domain.users.Teacher;

import java.util.ArrayList;
import java.util.Date;

public class MainController implements MainControllerService{
    private static MainController m;

    public static MainController getInstance(){
        if(m==null){
            m=new MainController();
            return m;
        }
        else return m;
    }

    private MainController(){

    }


    public ArrayList<Parent> getListOfParents(Pupil student){
        ArrayList<Parent> parents = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            parents.add(new Parent(null,null,null,"parent",""+i));
        }
        return parents;
    }

    public ArrayList<Pupil> getListOfStudents(Parent parent){
        ArrayList<Pupil> pupils = new ArrayList<>();

        for (int i = 1; i <= 8; i++) {
            pupils.add(new Pupil("student",""+i,null,null,null,null,null));
        }
        return pupils;
    }

    public ArrayList<Subject> getListOfSubjects(Pupil pupil){
        ArrayList<Subject> subjects = new ArrayList<>();

        for (int i = 1; i <= 8; i++) {
            subjects.add(new Subject("Polski kryjana "+pupil.toString(),true));
        }
        return subjects;
    }

    public ArrayList<Grade> getListOfGrades(Pupil pupil, Subject subject){
        ArrayList<Grade> grades = new ArrayList<>();

        for (int i = 1; i <= 8; i++) {
            grades.add(new Grade(pupil,3,subject,null,null,1) );
        }
        return grades;
    }

    public ArrayList<SchoolClass> getListOfClasses(Teacher teacher){
        ArrayList<SchoolClass> classes = new ArrayList<>();

        for (int i = 1; i <= 8; i++) {
            classes.add(new SchoolClass(i,"A",null ));
        }
        return classes;
    }

}
