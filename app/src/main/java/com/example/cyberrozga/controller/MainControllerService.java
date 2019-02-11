package com.example.cyberrozga.controller;




import com.example.cyberrozga.domain.Grade;
import com.example.cyberrozga.domain.SchoolClass;
import com.example.cyberrozga.domain.Subject;
import com.example.cyberrozga.domain.users.Parent;
import com.example.cyberrozga.domain.users.Pupil;
import com.example.cyberrozga.domain.users.Teacher;

import java.util.ArrayList;
import java.util.Map;

public interface MainControllerService {
    public ArrayList<Parent> getListOfParents(Pupil student);
    public ArrayList<Pupil> getListOfStudents(Parent parent);
    public ArrayList<Pupil> getListOfStudents(SchoolClass schoolClass);
    public ArrayList<Subject> getListOfSubjects(Pupil pupil);
    public ArrayList<Grade> getListOfGrades(Pupil pupil, Subject subject);
    public Map<SchoolClass,Subject> getListOfClassesAndSubjects(Teacher teacher);
    public boolean isAParent(Teacher t);
    public void addGrade(Grade grade);
    public void deleteGrade(Grade grade);
    public void updateGrade(Grade oldG,Grade newG);

}
