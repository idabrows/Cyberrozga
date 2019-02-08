package com.example.cyberrozga.view.activities.parent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.cyberrozga.R;
import com.example.cyberrozga.controller.MainController;
import com.example.cyberrozga.domain.users.Pupil;

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


        ArrayList<Pupil> carL = controller.getListOfStudents(null);

        adapter = new ArrayAdapter<Pupil>(this, R.layout.row, carL);

        list.setAdapter(adapter);
    }


}