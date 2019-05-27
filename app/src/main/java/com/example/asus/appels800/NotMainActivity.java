package com.example.asus.appels800;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import com.example.asus.appels800.model.DatabaseAccess;
import com.example.asus.appels800.model.Note;

import java.util.ArrayList;
import java.util.List;

public class NotMainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String param,param2;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                param= null;
                param2=null;
            } else {
                param= extras.getString("param",null);
                param2=extras.getString("param2","null");
            }
        } else {
            param= (String) savedInstanceState.getSerializable("param");
            param2= (String) savedInstanceState.getSerializable("param2");
        }

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        ArrayList<Note> list = new ArrayList<Note>();
        ArrayList<Note> list2 = new ArrayList<Note>();


        if(param2.equals(null)){
            list = (ArrayList<Note>) databaseAccess.getlist(param);

        }else{
            list=(ArrayList<Note>) databaseAccess.getsoinlist(param,param2);

        }
         databaseAccess.close();


        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        final NoteAdapter adapter = new NoteAdapter();
        recyclerView.setAdapter(adapter);
        adapter.setNotes(list);


    }
}
