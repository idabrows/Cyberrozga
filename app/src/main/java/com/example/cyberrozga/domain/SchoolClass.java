package com.example.cyberrozga.domain;

import com.example.cyberrozga.domain.users.Pupil;
import com.example.cyberrozga.domain.users.User;

import java.io.Serializable;
import java.util.List;



import java.util.List;

public class SchoolClass implements Serializable,Comparable {
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

    public List<Pupil> getStudents() {
        return students;
    }

    public void setStudents(List<Pupil> students) {
        this.students = students;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }



    @Override
    public int compareTo(Object schoolClass) {
        return this.toString().compareTo(schoolClass.toString());
    }
}
