package com.example.cyberrozga.domain;

import com.example.cyberrozga.domain.users.Pupil;

import java.util.List;


public class SchoolClass {
    private int number;
    private String division;
    private List<Pupil> students;

    public SchoolClass(int number, String division, List<Pupil> students) {
        this.number = number;
        this.division = division;
        this.students = students;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public List<Pupil> getStudents() {
        return students;
    }

    public void setStudents(List<Pupil> students) {
        this.students = students;
    }
}
