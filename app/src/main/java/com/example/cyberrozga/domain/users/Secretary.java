package com.example.cyberrozga.domain.users;

import com.example.cyberrozga.domain.RegisterPage;

import java.io.Serializable;
import java.util.List;

public class Secretary extends Teacher  implements Serializable {

    public Secretary(int id,List<Pupil> children, String email, String password, String firstName, String lastName, List<RegisterPage> registers) {
        super(id,children, email, password, firstName, lastName, registers);
    }
}