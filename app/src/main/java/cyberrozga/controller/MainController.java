package com.example.cyberrozga.controller;




import com.example.cyberrozga.controller.MainControllerService;
import com.example.cyberrozga.crud.Reader;
import com.example.cyberrozga.domain.Grade;
import com.example.cyberrozga.domain.SchoolClass;
import com.example.cyberrozga.domain.Subject;
import com.example.cyberrozga.domain.users.Parent;
import com.example.cyberrozga.domain.users.Pupil;
import com.example.cyberrozga.domain.users.Teacher;

import java.util.ArrayList;

public class MainController implements MainControllerService {
    private static MainController m;
    private Reader reader;

    public static MainController getInstance(){
        if(m==null){
            m=new MainController();
            return m;
        }
        else return m;
    }

    private MainController(){
        reader=new Reader();
    }


    public ArrayList<Parent> getListOfParents(Pupil student){
        return null;
    }

    public ArrayList<Pupil> getListOfStudents(Parent parent){
       return reader.getListOfStudents(parent);
    }

    public ArrayList<Subject> getListOfSubjects(Pupil pupil){
        return reader.getListOfSubjects(pupil);
    }

    public ArrayList<Grade> getListOfGrades(Pupil pupil, Subject subject){
        return reader.getListOfGrades(pupil,subject);
    }

    public ArrayList<SchoolClass> getListOfClasses(Teacher teacher){
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getInstance().getListOfStudents(new Parent(37,null,null,null,null,null)));
        System.out.println(getInstance().getListOfSubjects(new Pupil(1,null,null,null,null,null,null,null)));
        System.out.println(getInstance().getListOfGrades(new Pupil(1,null,null,null,null,null,null,null),
                new Subject("Matematyka")));

    }

}
