package com.example.cyberrozga.controller;

import com.example.cyberrozga.domain.Grade;
import com.example.cyberrozga.domain.SchoolClass;
import com.example.cyberrozga.domain.Subject;
import com.example.cyberrozga.domain.users.Parent;
import com.example.cyberrozga.domain.users.Pupil;
import com.example.cyberrozga.domain.users.Teacher;

import java.util.ArrayList;

public interface MainControllerService {
    public ArrayList<Parent> getListOfParents(Pupil student);
    public ArrayList<Pupil> getListOfStudents(Parent parent);
    public ArrayList<Subject> getListOfSubjects(Pupil pupil);
    public ArrayList<Grade> getListOfGrades(Pupil pupil, Subject subject);
    public ArrayList<SchoolClass> getListOfClasses(Teacher teacher);

}
