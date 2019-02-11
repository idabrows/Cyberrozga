package com.example.cyberrozga.view.activities.teacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cyberrozga.R;
import com.example.cyberrozga.domain.users.Parent;
import com.example.cyberrozga.domain.users.Teacher;
import com.example.cyberrozga.view.activities.parent.ParentPanelActivity;

public class ChoosePanelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_panel);

        Button teacher = (Button) findViewById(R.id.teacher);
        Button send = (Button) findViewById(R.id.parent);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        final Teacher te = (Teacher) extras.getSerializable("TEACHER_DATA");

        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intentSubjectsAndClasses = new Intent(ChoosePanelActivity.this, TeacherPanelActivity.class);
                final Bundle teacherbundle = new Bundle();
                teacherbundle.putSerializable("TEACHER_DATA", te);
                intentSubjectsAndClasses.putExtras(teacherbundle);
                startActivity(intentSubjectsAndClasses);
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intentSubjectsAndClasses = new Intent(ChoosePanelActivity.this, ParentPanelActivity.class);
                final Bundle parentbundle = new Bundle();
                parentbundle.putSerializable("PARENT_DATA", (Parent)te);
                intentSubjectsAndClasses.putExtras(parentbundle);
                startActivity(intentSubjectsAndClasses);
            }
        });


    }
}
