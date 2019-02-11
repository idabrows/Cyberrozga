package com.example.cyberrozga.view.activities.parent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cyberrozga.R;
import com.example.cyberrozga.view.activities.common.Mails;

public class ParentInbox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_inbox);

        Button view = (Button) findViewById(R.id.button);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ParentInbox.this, Mails.class));
            }
        });

    }
}
