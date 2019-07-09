package com.example.asus.appels800;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;


import com.example.asus.appels800.model.DatabaseAccess;
import com.example.asus.appels800.model.Note;

import java.util.ArrayList;
import java.util.List;

public class NotMainActivity extends AppCompatActivity {

    NoteAdapter adapter = new NoteAdapter();
    String param,param2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Context cxt=getApplicationContext();
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                param= null;
                param2=null;
            } else {
                param= extras.getString("param",null);
                param2=extras.getString("param2","null");
                getSupportActionBar().setTitle(param);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);

             }
        } else {
            param= (String) savedInstanceState.getString("param");
            param2= (String) savedInstanceState.getString("param2");

            Log.v("savedinst",param+"    "+param2);



        }

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        ArrayList<Note> list = new ArrayList<Note>();


        if(param2.equals(null)){
            list = (ArrayList<Note>) databaseAccess.getlist(param);

        }else{
            list=(ArrayList<Note>) databaseAccess.getsoinlist(param,param2);

        }
         databaseAccess.close();


        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(adapter);
        adapter.setNotes(list,cxt,this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        MenuItem searchitem =menu.findItem(R.id.search);
        SearchView searchView =(SearchView) searchitem.getActionView();

        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });
        return true;
    }



    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


            outState.putString("param",param);
            outState.putString("param2",param2);



    }
}
