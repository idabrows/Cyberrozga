package com.example.cyberrozga.view.activities.teacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.cyberrozga.R;
import com.example.cyberrozga.controller.MainController;
import com.example.cyberrozga.domain.RegisterPage;
import com.example.cyberrozga.domain.Subject;
import com.example.cyberrozga.domain.users.Parent;
import com.example.cyberrozga.domain.users.Pupil;
import com.example.cyberrozga.view.activities.common.SubjectsActivity;
import com.example.cyberrozga.view.activities.parent.ChildrenPanelActivity;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {
    private ListView list;
    private ArrayAdapter<Subject> adapter;
    private MainController controller = MainController.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        list = (ListView) findViewById(R.id.listView1);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        RegisterPage registerPage = (RegisterPage) extras.getSerializable("REGISTER_PAGE");

        // ArrayList<Subject> carL = controller.getListOfSubjects(parent);
        // adapter = new ArrayAdapter<Pupil>(this, R.layout.row, carL);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long l) {
                Pupil item = (Pupil) adapter.getItemAtPosition(position);
                final Bundle childbundle = new Bundle();
                childbundle.putSerializable("CHILD_DATA", item);

                Intent intent = new Intent(RegisterActivity.this, StudentsList.class);
                intent.putExtras(childbundle);
                startActivity(intent);
            }
        });


    }
}