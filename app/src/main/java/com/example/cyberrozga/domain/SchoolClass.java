package com.example.cyberrozga.domain;

import com.example.cyberrozga.domain.users.Pupil;

import java.io.Serializable;
import java.util.List;



import java.util.List;

public class SchoolClass implements Serializable {
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
