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
        String param;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                param= null;
            } else {
                param= extras.getString("param");
            }
        } else {
            param= (String) savedInstanceState.getSerializable("param");
        }

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        ArrayList<Note> list = new ArrayList<Note>();

        list = (ArrayList<Note>) databaseAccess.getlist(param);
        Log.v("gettingresult",list.size()+" "+list.get(0).getDescription());
        databaseAccess.close();


        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        final NoteAdapter adapter = new NoteAdapter();
        recyclerView.setAdapter(adapter);
        adapter.setNotes(list);


    }
}
