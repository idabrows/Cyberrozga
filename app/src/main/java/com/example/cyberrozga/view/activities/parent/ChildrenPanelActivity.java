package com.example.cyberrozga.view.activities.parent;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.cyberrozga.R;
import com.example.cyberrozga.controller.MainController;
import com.example.cyberrozga.domain.users.Parent;
import com.example.cyberrozga.domain.users.Pupil;
import com.example.cyberrozga.view.activities.common.SubjectsActivity;

import java.util.ArrayList;

public class ChildrenPanelActivity extends AppCompatActivity {

    private ListView list ;
    private ArrayAdapter<Pupil> adapter ;
    private MainController controller=MainController.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_children_panel);

        list = (ListView) findViewById(R.id.listView1);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        Parent parent = (Parent) extras.getSerializable("PARENT_DATA");


        ArrayList<Pupil> carL = controller.getListOfStudents(parent);
        adapter = new ArrayAdapter<Pupil>(this, R.layout.row, carL);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,long l){
                Pupil item = (Pupil) adapter.getItemAtPosition(position);
                final Bundle childbundle = new Bundle();
                childbundle.putSerializable("CHILD_DATA", item);
                Intent intent = new Intent(ChildrenPanelActivity.this, SubjectsActivity.class);
                intent.putExtras(childbundle);
                startActivity(intent);
            }
        });
    }


}