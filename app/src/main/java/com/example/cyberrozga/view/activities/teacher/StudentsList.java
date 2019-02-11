package com.example.cyberrozga.view.activities.teacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.cyberrozga.R;
import com.example.cyberrozga.controller.MainController;
import com.example.cyberrozga.crud.Connector;
import com.example.cyberrozga.domain.RegisterPage;
import com.example.cyberrozga.domain.SchoolClass;
import com.example.cyberrozga.domain.Subject;
import com.example.cyberrozga.domain.users.Parent;
import com.example.cyberrozga.domain.users.Pupil;
import com.example.cyberrozga.view.activities.common.SubjectsActivity;
import com.example.cyberrozga.view.activities.parent.ChildrenPanelActivity;
import com.example.cyberrozga.view.activities.pupil.StudentPanelActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentsList extends AppCompatActivity {

    private ListView list ;

    private MainController controller=MainController.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list);
        list = (ListView) findViewById(R.id.listview);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        final SchoolClass schoolClass = (SchoolClass) extras.getSerializable("SCHOOL_CLASS");
        final Subject subject = (Subject) extras.getSerializable("SUBJECT");
        String[] from = new String[]{"rowid", "col_1", "col_2"};
        int[] to = new int[]{R.id.item1, R.id.item2, R.id.item3};
        List<HashMap<String, String>> fillMaps = new ArrayList<HashMap<String, String>>();
        final List<Pupil> students = MainController.getInstance().getListOfStudents(schoolClass);

        for (int i = 0; i < students.size(); i++) {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("rowid", "" + (i + 1));
            map.put("col_1", students.get(i).getLastName());
            map.put("col_2", students.get(i).getFirstName());
            fillMaps.add(map);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, fillMaps, R.layout.row_students_list, from, to);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,long l){
                Pupil itempupil = (Pupil) adapter.getItemAtPosition(position);
                final Bundle bundle = new Bundle();
                bundle.putSerializable("CHILD", students.get(position));
                bundle.putSerializable("SUBJECT",subject);
                bundle.putSerializable("SCHOOL_CLASS", schoolClass);

                Intent intent = new Intent(StudentsList.this, GradesListActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


}