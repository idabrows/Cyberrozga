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
        this.weight=weightParse(weight);
    }

    public Grade(int id,Pupil student, int value, Subject subject, SchoolClass sclass, Date date, String weight){
        this.student=student;
        this.value=value;
        this.subject=subject;
        this.sclass=sclass;
        this.date=date;
        this.weight=weightParse(weight);
        this.id=id;
    }

    public Grade(Pupil student, int value, Subject subject, SchoolClass sclass, String weight){
        this.student=student;
        this.value=value;
        this.subject=subject;
        this.sclass=sclass;
        this.date=new Date();
        this.weight=weightParse(weight);
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

    public static String weightParse(String t){
        switch(t){
            case "spr": return t;
            case "Sprawdzian": return "spr";
            case "odp": return t;
            case "Odpowiedź": return "odp";
            case "krtk": return t;
            case "Kartkówka": return "krtk";
            case "zad": return t;
            case "Zadanie": return "zad";
            default:return null;
        }
    }
    @Override
    public String toString(){
        return value+" ("+weight+" "+date+")";
    }

}