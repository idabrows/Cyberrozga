package com.example.cyberrozga.controller;




import com.example.cyberrozga.controller.MainControllerService;
import com.example.cyberrozga.crud.Reader;
import com.example.cyberrozga.crud.Writer;
import com.example.cyberrozga.domain.Grade;
import com.example.cyberrozga.domain.SchoolClass;
import com.example.cyberrozga.domain.Subject;
import com.example.cyberrozga.domain.users.Parent;
import com.example.cyberrozga.domain.users.Pupil;
import com.example.cyberrozga.domain.users.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class MainController implements MainControllerService {
    private static MainController m;
    private Reader reader;
    private Writer writer;

    public static MainController getInstance(){
        if(m==null){
            m=new MainController();
            return m;
        }
        else return m;
    }

    private MainController(){
        reader=new Reader();
        writer=new Writer();
    }


    public ArrayList<Parent> getListOfParents(Pupil student){
        return null;
    }

    public ArrayList<Pupil> getListOfStudents(Parent parent){
       return reader.getListOfStudents(parent);
    }

    public ArrayList<Pupil> getListOfStudents(SchoolClass sc){
        return reader.getListOfStudents(sc);
    }

    public ArrayList<Subject> getListOfSubjects(Pupil pupil){
        return reader.getListOfSubjects(pupil);
    }

    public ArrayList<Grade> getListOfGrades(Pupil pupil, Subject subject){
        return reader.getListOfGrades(pupil,subject);
    }

    public Map<SchoolClass,Subject> getListOfClassesAndSubjects(Teacher teacher){
        return reader.getListOfClassesAndSubjects(teacher);
    }

    public boolean isAParent(Teacher t) {
        return reader.isAParent(t);
    }

    public void addGrade(Grade grade){
        writer.addGrade(grade);
    }

    public void deleteGrade(Grade grade){
        writer.deleteGrade(grade);
    }

    public void updateGrade(Grade oldG, Grade newG){
        writer.updateGrade(oldG,newG);
    }


    public static void main(String[] args) {
//        System.out.println(getInstance().getListOfStudents(new Parent(37,null,null,null,null,null)));
//        System.out.println(getInstance().getListOfSubjects(new Pupil(1,null,null,null,null,null,null,null)));
//        System.out.println(getInstance().getListOfGrades(new Pupil(1,null,null,null,null,null,null,null),
//                new Subject("Matematyka")));
//        System.out.println(getInstance().getListOfClassesAndSubjects(new Teacher(52,null,null,null,null,null,null)));
//        System.out.println(getInstance().getListOfStudents(new SchoolClass("1a",null)));
//        getInstance().addGrade(new Grade(new Pupil(1,null,null,null,null,null,null,null),
//                5,new Subject("Matematyka",1),null, "krtk"));
//        getInstance().deleteGrade(new Grade(122,null,0,null,null,null,null));
//         getInstance().updateGrade(new Grade(120,null,0,null,null,null,null),
//                 new Grade(null, 6,null,null,"krtk"));

    }


}
