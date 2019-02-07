package com.example.cyberrozga.domain.users;

import com.example.cyberrozga.domain.RegisterPage;

import java.util.List;

public class Teacher extends Parent {
    List<RegisterPage> registers;

    public List<RegisterPage> getRegisters() {
        return registers;
    }

    public void setRegisters(List<RegisterPage> registers) {
        this.registers = registers;
    }

    public Teacher(List<Pupil> children, String email, String password, String firstName, String lastName, List<RegisterPage> registers) {
        super(children, email, password, firstName, lastName);
        this.registers = registers;
    }
}
