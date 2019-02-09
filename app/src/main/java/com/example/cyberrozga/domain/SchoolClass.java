package com.example.cyberrozga.domain;

import com.example.cyberrozga.domain.users.Pupil;

import java.util.List;


public class SchoolClass {
    private int number;
    private String division;
    private List<Pupil> students;

    public SchoolClass(int number,String division,List<Pupil> students){
        this.number=number;
        this.division=division;
        this.students=students;
    }

    @Override
    public String toString(){
        return Integer.toString(this.number)+this.division;
    }

}
