package com.example.cyberrozga.domain.users;

import com.example.cyberrozga.domain.RegisterPage;

import java.util.List;

public class Secretary extends Teacher {
    public Secretary(List<Pupil> children, String email, String password, String firstName, String lastName, List<RegisterPage> registers) {
        super(children, email, password, firstName, lastName, registers);
    }
}
