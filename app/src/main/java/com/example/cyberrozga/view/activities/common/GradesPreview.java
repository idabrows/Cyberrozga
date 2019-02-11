package com.example.cyberrozga.view.activities.common;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.cyberrozga.R;
import com.example.cyberrozga.controller.MainController;
import com.example.cyberrozga.domain.Grade;
import com.example.cyberrozga.domain.Subject;
import com.example.cyberrozga.domain.users.Pupil;

import java.util.ArrayList;

public class GradesPreview extends AppCompatActivity {
    private ListView list ;
    private ArrayAdapter<Grade> adapter ;
    private MainController controller=MainController.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades_preview);
        list = (ListView) findViewById(R.id.listView1);
        Intent intent = getIntent();
        final Bundle childbundle = intent.getExtras();
        Pupil pupil = (Pupil) childbundle.getSerializable("CHILD_DATA");
        Subject subject = (Subject) childbundle.getSerializable("SUBJECT_DATA");

        ArrayList<Grade> subjects = controller.getListOfGrades(pupil,subject);
        adapter = new ArrayAdapter<Grade>(this, R.layout.row, subjects);
        list.setAdapter(adapter);

    }
}
