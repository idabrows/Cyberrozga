package com.example.cyberrozga.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.cyberrozga.R;
import com.example.cyberrozga.view.CustomRecyclerAdapter;
import com.example.cyberrozga.view.PersonUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ChildrenPanelActivity extends AppCompatActivity {

    List<PersonUtils> personUtilsList;
    RequestQueue rq;
    String request_url = "http://localhost/testapi.php";
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_children_panel);


        rq = Volley.newRequestQueue(this);
        recyclerView = (RecyclerView) findViewById(R.id.recycleViewContainer);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        personUtilsList = new ArrayList<>();
        sendRequest();


    }

    public void sendRequest(){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, request_url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for(int i = 0; i < response.length(); i++){
                    PersonUtils personUtils = new PersonUtils();
                    try {
                        JSONObject jsonObject = response.getJSONObject(i);
                        personUtils.setPersonFirstName(jsonObject.getString("firstname"));
                        personUtils.setPersonLastName(jsonObject.getString("lastname"));
                        personUtils.setJobProfile(jsonObject.getString("jobprofile"));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    personUtilsList.add(personUtils);
                }
                mAdapter = new CustomRecyclerAdapter(ChildrenPanelActivity.this, personUtilsList);
                recyclerView.setAdapter(mAdapter);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i("Volley Error: ", error.getMessage());
            }
        });
        rq.add(jsonArrayRequest);

    }



}