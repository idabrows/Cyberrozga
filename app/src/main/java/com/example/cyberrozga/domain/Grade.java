package com.example.cyberrozga.domain;

import com.example.cyberrozga.domain.users.Pupil;

import java.util.Date;

public class Grade {
    private Pupil student;
    private int value;
    private Subject subject;
    private SchoolClass sclass;
    private Date date;
    private int weight;

    public Grade(Pupil student, int value, Subject subject, SchoolClass sclass, Date date, int weight) {
        this.student = student;
        this.value = value;
        this.subject = subject;
        this.sclass = sclass;
        this.date = date;
        this.weight = weight;
    }

    public Pupil getStudent() {
        return student;
    }

    public void setStudent(Pupil student) {
        this.student = student;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
