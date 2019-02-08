package com.example.cyberrozga.view.activities.teacher;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import com.example.cyberrozga.R;

public class EditMarkPopUp extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popeditmark);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int)(width*0.8),(int)(height*0.6));
    }
}
