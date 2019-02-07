package com.example.cyberrozga.view.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cyberrozga.R;

public class OfficePanelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_panel);

        Button groupmanagement = (Button) findViewById(R.id.groupManagementButton);

        groupmanagement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OfficePanelActivity.this, GroupManagement.class));
            }
        });
    }
}
