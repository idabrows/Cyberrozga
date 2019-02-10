package com.example.cyberrozga.domain;

import com.example.cyberrozga.domain.users.Pupil;

import java.util.List;

public class SchoolClass {
    private String division;
    private List<Pupil> students;

    public SchoolClass(String division,List<Pupil> students){
        this.division=division;
        this.students=students;
    }

    @Override
    public String toString(){
        return this.division;
    }

}
