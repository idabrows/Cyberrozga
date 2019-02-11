package com.example.cyberrozga.view.activities.pupil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cyberrozga.R;
import com.example.cyberrozga.domain.users.Pupil;
import com.example.cyberrozga.view.activities.common.SubjectsActivity;

import java.util.Objects;

public class StudentPanelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_panel);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Cyberrózga - panel główny");  // provide compatibility to all the versions
        Button previewButton = (Button) findViewById(R.id.previewButton);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        Pupil pupil = (Pupil) extras.getSerializable("PUPIL_DATA");
        final Bundle parentbundle = new Bundle();
        parentbundle.putSerializable("CHILD_DATA", pupil);


        previewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Intent intentSubjects = new Intent(StudentPanelActivity.this, SubjectsActivity.class);
                intentSubjects.putExtras(parentbundle);
                startActivity(intentSubjects);
              }
        });
    }
}
