package com.example.cyberrozga.view.activities.pupil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cyberrozga.R;

import java.util.Objects;

public class StudentPanelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_panel);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Cyberrózga - panel główny");  // provide compatibility to all the versions

    }
}
