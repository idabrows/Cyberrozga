package com.example.cyberrozga.domain;

import com.example.cyberrozga.domain.users.Pupil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RegisterPage implements Serializable {
    private Subject subject;
    private SchoolClass sclass;
    private ArrayList<Pupil> students;
    private ArrayList<Grade> grades;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public SchoolClass getSclass() {
        return sclass;
    }

    public void setSclass(SchoolClass sclass) {
        this.sclass = sclass;
    }

    public ArrayList<Pupil> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Pupil> students) {
        this.students = students;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }
}
