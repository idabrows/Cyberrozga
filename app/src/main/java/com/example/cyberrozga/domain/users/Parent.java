package com.example.cyberrozga.domain.users;

import java.util.List;

public class Parent {
    private List<Pupil> children;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    public  Parent(List<Pupil> children,String email, String password, String firstName, String lastName){
        this.children=children;
        this.email=email;
        this.password=password;
        this.firstName=firstName;
        this.lastName=lastName;
    }


    public List<Pupil> getChildren() {
        return children;
    }

    public void setChildren(List<Pupil> children) {
        this.children = children;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
