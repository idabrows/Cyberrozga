package com.example.cyberrozga.domain;

import java.io.Serializable;

public class Subject implements Serializable {
    private String name;
    private  int id;

    public Subject(String name){
        this.name=name;
    }

    public Subject(String name,int id)
    {
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return name;
    }
}
