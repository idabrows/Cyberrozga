package com.example.cyberrozga.domain;

import com.example.cyberrozga.domain.users.Pupil;

import java.io.Serializable;
import java.util.Date;

import java.util.Date;

public class Grade implements Serializable {
    private Pupil student;
    private int value;
    private Subject subject;
    private SchoolClass sclass;
    private Date date;
    private String weight;

    public Grade(Pupil student, int value, Subject subject, SchoolClass sclass, Date date, String weight){
        this.student=student;
        this.value=value;
        this.subject=subject;
        this.sclass=sclass;
        this.date=date;
        this.weight=weight;
    }

    @Override
    public String toString(){
        return "OCENA: "+value+"\n "+date+" "+subject;
    }

}
