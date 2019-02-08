package com.example.cyberrozga.view.activities.teacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cyberrozga.R;

import java.util.Objects;

public class TeacherPanelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_panel);
     //   getActionBar().setTitle("Hello world App");
        Objects.requireNonNull(getSupportActionBar()).setTitle("Cyberrózga - panel główny");  // provide compatibility to all the versions


        Button register = (Button) findViewById(R.id.registerButton);
        Button send = (Button) findViewById(R.id.sendToParentsButton);
        Button inbox = (Button) findViewById(R.id.inboxTeacherButton);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherPanelActivity.this, RegisterActivity.class));
            }
        });
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherPanelActivity.this, MailToParents.class));
            }
        });
        inbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherPanelActivity.this, TeacherInbox.class));
            }
        });

    }
}
