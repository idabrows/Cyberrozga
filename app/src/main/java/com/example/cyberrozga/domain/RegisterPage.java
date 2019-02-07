package com.example.cyberrozga.domain;

import com.example.cyberrozga.domain.users.Pupil;

import java.util.List;

public class RegisterPage {
    private Subject subject;
    private SchoolClass sclass;
    private List<Pupil> students;
    private List<Grade> grades;

    public RegisterPage(Subject subject, SchoolClass sclass, List<Pupil> students, List<Grade> grades) {
        this.subject = subject;
        this.sclass = sclass;
        this.students = students;
        this.grades = grades;
    }

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

    public List<Pupil> getStudents() {
        return students;
    }

    public void setStudents(List<Pupil> students) {
        this.students = students;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
