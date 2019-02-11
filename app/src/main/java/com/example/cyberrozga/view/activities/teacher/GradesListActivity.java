package com.example.cyberrozga.view.activities.teacher;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.cyberrozga.R;
import com.example.cyberrozga.controller.MainController;
import com.example.cyberrozga.domain.Grade;
import com.example.cyberrozga.domain.SchoolClass;
import com.example.cyberrozga.domain.Subject;
import com.example.cyberrozga.domain.users.Parent;
import com.example.cyberrozga.domain.users.Pupil;
import com.example.cyberrozga.view.activities.parent.ParentPanelActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class GradesListActivity extends AppCompatActivity {
    private ListView list ;
    private ArrayAdapter<Grade> adapter ;
    private MainController controller=MainController.getInstance();

    private Context mContext;
    private Activity mActivity;
    private ConstraintLayout mConstraintLayout;
    private PopupWindow mPopupWindow;
    private Button addButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades_list);

        mContext = getApplicationContext();
        mActivity = GradesListActivity.this;
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.cl);
        list = (ListView) findViewById(R.id.listView1);
        addButton = (Button) findViewById(R.id.addButton);

        Intent intent = getIntent();
        final Bundle childbundle = intent.getExtras();
        Pupil pupil = (Pupil) childbundle.getSerializable("CHILD");
        Subject subject = (Subject) childbundle.getSerializable("SUBJECT");
        SchoolClass sc = (SchoolClass) childbundle.getSerializable("SCHOOL_CLASS");

        ArrayList<Grade> subjects = controller.getListOfGrades(pupil,subject);
        adapter = new ArrayAdapter<Grade>(this, R.layout.row, subjects);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long l){
                LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);
                View customView = inflater.inflate(R.layout.popeditmark,null);
                mPopupWindow = new PopupWindow(
                        customView,
                        ActionBar.LayoutParams.WRAP_CONTENT,
                        ActionBar.LayoutParams.WRAP_CONTENT
                );
                if(Build.VERSION.SDK_INT>=21){
                    mPopupWindow.setElevation(5.0f);
                }
                ImageButton closeButton = (ImageButton) customView.findViewById(R.id.ib_close);
                Spinner a = (Spinner) customView.findViewById(R.id.marksSpinner1);

                String[] grades = {"1","2","3","4","5","6"};

                ArrayAdapter<String> adapter1 =
                        new ArrayAdapter<String>(GradesListActivity.this,
                                android.R.layout.simple_spinner_dropdown_item, grades);
                adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                a.setAdapter(adapter1);

                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mPopupWindow.dismiss();
                    }
                });


                a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });


                mPopupWindow.showAtLocation(mConstraintLayout, Gravity.CENTER,0,0);


            }
        });


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);
                View customView = inflater.inflate(R.layout.popaddmark,null);
                mPopupWindow = new PopupWindow(
                        customView,
                        ActionBar.LayoutParams.WRAP_CONTENT,
                        ActionBar.LayoutParams.WRAP_CONTENT
                );
                if(Build.VERSION.SDK_INT>=21){
                    mPopupWindow.setElevation(5.0f);
                }
                ImageButton closeButton = (ImageButton) customView.findViewById(R.id.ib_close);

                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mPopupWindow.dismiss();
                    }
                });
                mPopupWindow.showAtLocation(mConstraintLayout, Gravity.CENTER,0,0);

            }
        });








    }
}
