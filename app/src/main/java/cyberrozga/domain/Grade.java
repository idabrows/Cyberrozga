package com.example.cyberrozga.domain;


import com.example.cyberrozga.domain.users.Pupil;

import java.util.Date;

public class Grade {
    private Pupil student;
    private int value;
    private Subject subject;
    private SchoolClass sclass;
    private Date date;
    private String weight;
    private int id;

    public Grade(Pupil student, int value, Subject subject, SchoolClass sclass, Date date, String weight){
        this.student=student;
        this.value=value;
        this.subject=subject;
        this.sclass=sclass;
        this.date=date;
        this.weight=weight;
    }

    public Grade(int id,Pupil student, int value, Subject subject, SchoolClass sclass, Date date, String weight){
        this.student=student;
        this.value=value;
        this.subject=subject;
        this.sclass=sclass;
        this.date=date;
        this.weight=weight;
        this.id=id;
    }

    public Grade(Pupil student, int value, Subject subject, SchoolClass sclass, String weight){
        this.student=student;
        this.value=value;
        this.subject=subject;
        this.sclass=sclass;
        this.date=new Date();
        this.weight=weight;
    }

    public Pupil getStudent() {
        return student;
    }

    public int getValue() {
        return value;
    }

    public Subject getSubject() {
        return subject;
    }

    public SchoolClass getSclass() {
        return sclass;
    }

    public Date getDate() {
        return date;
    }

    public String getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return value+" "+date+" "+subject;
    }

}
