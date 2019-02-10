package com.example.cyberrozga.domain.users;

import com.example.cyberrozga.domain.Grade;
import com.example.cyberrozga.domain.SchoolClass;
import com.example.cyberrozga.domain.Subject;

import java.util.List;

public class Pupil extends User{
    private List<Grade> grades;
    private SchoolClass sclass;
    private List<Subject> subjects;

    public String getFirstName() {
        return firstName;
    }

    public Pupil(int id,String firstName, String lastName, List<Grade> grades, SchoolClass sclass, List<Subject> subjects, String email, String password) {
        super(id,firstName,lastName,email,password);
        this.grades = grades;
        this.sclass = sclass;
        this.subjects = subjects;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public SchoolClass getSclass() {
        return sclass;
    }

    public void setSclass(SchoolClass sclass) {
        this.sclass = sclass;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return firstName+" "+lastName;
    }
}
