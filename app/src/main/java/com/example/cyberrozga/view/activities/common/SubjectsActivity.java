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
import com.example.cyberrozga.domain.Subject;
import com.example.cyberrozga.domain.users.Parent;
import com.example.cyberrozga.domain.users.Pupil;
import com.example.cyberrozga.view.activities.parent.ChildrenPanelActivity;

import java.util.ArrayList;

public class SubjectsActivity extends AppCompatActivity {
    private ListView list ;
    private ArrayAdapter<Subject> adapter ;
    private MainController controller=MainController.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        list = (ListView) findViewById(R.id.listView1);
        Intent intent = getIntent();
        final Bundle childbundle = intent.getExtras();
        Pupil pupil = (Pupil) childbundle.getSerializable("CHILD_DATA");

        ArrayList<Subject> subjects = controller.getListOfSubjects(pupil);
        adapter = new ArrayAdapter<Subject>(this, R.layout.row, subjects);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long l){

                Subject item = (Subject) adapter.getItemAtPosition(position);
                final Bundle subjectbundle = new Bundle();
                subjectbundle.putSerializable("SUBJECT_DATA", item);

                Intent intent = new Intent(SubjectsActivity.this, GradesPreview.class);
                intent.putExtras(childbundle);
                intent.putExtras(subjectbundle);

                startActivity(intent);
            }
        });
    }
}
