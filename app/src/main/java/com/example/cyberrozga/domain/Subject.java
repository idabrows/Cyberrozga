package com.example.cyberrozga.domain;

import java.io.Serializable;

public class Subject implements Serializable {
    private String name;
    private boolean mandatory;

    public Subject(String name, boolean mandatory){
        this.name=name;
        this.mandatory=mandatory;
    }

    @Override
    public String toString(){
        return name;
    }

}
