package com.example.cyberrozga.view.activities.teacher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.cyberrozga.R;
import com.example.cyberrozga.controller.MainController;
import com.example.cyberrozga.domain.SchoolClass;
import com.example.cyberrozga.domain.users.Pupil;

import java.util.ArrayList;

public class MailToParents extends AppCompatActivity {
    private ArrayAdapter<SchoolClass> adapter;
    private MainController controller=MainController.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_to_parents);

        ArrayList<SchoolClass> classes = controller.getListOfClasses(null);
        Spinner s = (Spinner) findViewById(R.id.classSpinner);
        ArrayAdapter<SchoolClass> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,classes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
    }
}
