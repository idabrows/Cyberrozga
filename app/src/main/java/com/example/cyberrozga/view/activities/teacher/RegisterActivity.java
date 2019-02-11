package com.example.cyberrozga.view.activities.teacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.cyberrozga.R;
import com.example.cyberrozga.controller.MainController;
import com.example.cyberrozga.domain.RegisterPage;
import com.example.cyberrozga.domain.SchoolClass;
import com.example.cyberrozga.domain.Subject;
import com.example.cyberrozga.domain.users.Parent;
import com.example.cyberrozga.domain.users.Pupil;
import com.example.cyberrozga.domain.users.Teacher;
import com.example.cyberrozga.view.activities.common.SubjectsActivity;
import com.example.cyberrozga.view.activities.parent.ChildrenPanelActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        this.simpleAdapterListView();
    }


    // This method use SimpleAdapter to show data in ListView.
    private void simpleAdapterListView() {
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        Teacher teacher = (Teacher) extras.getSerializable("TEACHER_DATA");
        final Bundle registerbundle = new Bundle();

        setTitle("Wybierz klasę");

        final Map<SchoolClass,Subject> map=MainController.getInstance().getListOfClassesAndSubjects(teacher);
        final SchoolClass[] sc  = map.keySet().toArray(new SchoolClass[map.size()]);
        Arrays.sort(sc);
        int len = map.size();
        final String[] titleArr = new String[len];
        final String[] descArr = new String[len];
        final SchoolClass[] schoolClasses = new SchoolClass[len];
        final Subject[] subjects = new Subject[len];
        int i=0;
        for (SchoolClass x: sc) {
            titleArr[i] = x.toString();
            schoolClasses[i] = x;
            descArr[i] = map.get(x).toString();
            subjects[i] = map.get(x);
            i++;
        }

        ArrayList<Map<String,Object>> itemDataList = new ArrayList<Map<String,Object>>();

        for(int j =0; j < titleArr.length; j++) {
            Map<String,Object> listItemMap = new HashMap<String,Object>();
            listItemMap.put("title", titleArr[j]);
            listItemMap.put("description", descArr[j]);
            itemDataList.add(listItemMap);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,itemDataList,android.R.layout.simple_list_item_2,
                new String[]{"title","description"},new int[]{android.R.id.text1,android.R.id.text2});

        ListView listView = (ListView)findViewById(R.id.listView1);
        listView.setAdapter(simpleAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                Object clickItemObj = adapterView.getAdapter().getItem(index);
                registerbundle.putSerializable("SCHOOL_CLASS", sc[index]);
                registerbundle.putSerializable("SUBJECT", subjects[index]);
                Intent intent=new Intent(RegisterActivity.this, StudentsList.class);
                intent.putExtras(registerbundle);
                startActivity(intent);
            }
        });

    }
}