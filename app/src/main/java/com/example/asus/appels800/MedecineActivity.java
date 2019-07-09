package com.example.asus.appels800;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
 import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


import com.example.asus.appels800.model.DatabaseAccess;
import com.example.asus.appels800.model.Note;

import java.util.ArrayList;


public class MedecineActivity extends AppCompatActivity {


    RecyclerView recyclerviewmed ;
    DatabaseAccess databaseAccess;



    ArrayList<Note> list = new ArrayList<Note>();
    ArrayList<Note> list2 = new ArrayList<Note>();
    ArrayList<Note> list3 = new ArrayList<Note>();
    ArrayList<Note> list4 = new ArrayList<Note>();
    ArrayList<Note> list5 = new ArrayList<Note>();
    ArrayList<Note> list6 = new ArrayList<Note>();
    ArrayList<Note> list7 = new ArrayList<Note>();
    ArrayList<Note> list8 = new ArrayList<Note>();
    ArrayList<Note> list9 = new ArrayList<Note>();
    ArrayList<Note> list10 = new ArrayList<Note>();
    ArrayList<Note> list11 = new ArrayList<Note>();
    ArrayList<Note> list12 = new ArrayList<Note>();
    ArrayList<Note> list13 = new ArrayList<Note>();
    ArrayList<Note> list14 = new ArrayList<Note>();
    ArrayList<Note> list15 = new ArrayList<Note>();
    ArrayList<Note> list16 = new ArrayList<Note>();
    ArrayList<Note> list17 = new ArrayList<Note>();
    ArrayList<Note> list18 = new ArrayList<Note>();
    ArrayList<Note> list19 = new ArrayList<Note>();
    ArrayList<Note> list20 = new ArrayList<Note>();
    ArrayList<Note> list21 = new ArrayList<Note>();
    ArrayList<Note> list22 = new ArrayList<Note>();

    ArrayList<Note> listofall = new ArrayList<Note>();
    NoteAdapter adapter  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medecine);

         getSupportActionBar().setTitle("Médecine");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerviewmed =findViewById(R.id.recyclerviewmed);
        recyclerviewmed.setLayoutManager(new LinearLayoutManager(this ));
        recyclerviewmed.setHasFixedSize(false);
        adapter = new NoteAdapter();
        recyclerviewmed.setAdapter(adapter);
    }

    @Override
    protected void onResume() {

        databaseAccess= DatabaseAccess.getInstance(this);
        databaseAccess.open();

        super.onResume();

        list = (ArrayList<Note>) databaseAccess.getarticlesmedic();
        list2 = (ArrayList<Note>) databaseAccess.getpediatres();
        list3 = (ArrayList<Note>) databaseAccess.getpedopsychiatr();
        list4 = (ArrayList<Note>) databaseAccess.getpedopsychomotric();
        list5 = (ArrayList<Note>) databaseAccess.getradio();
        list6 = (ArrayList<Note>) databaseAccess.getcardio();
        list7 = (ArrayList<Note>) databaseAccess.getorl();
        list8 = (ArrayList<Note>) databaseAccess.getaudio();
        list9 = (ArrayList<Note>) databaseAccess.getorthophoniste();
        list10 = (ArrayList<Note>) databaseAccess.getdermato();
        list11 = (ArrayList<Note>) databaseAccess.getendocrino();
        list12 = (ArrayList<Note>) databaseAccess.getgastro();
        list13 = (ArrayList<Note>) databaseAccess.getgynecolog();
        list14 = (ArrayList<Note>) databaseAccess.getkynesy();
        list15 = (ArrayList<Note>) databaseAccess.getlabodentaire();
        list16 = (ArrayList<Note>) databaseAccess.getlaboanal();
        list17 = (ArrayList<Note>) databaseAccess.getmeddentaire();
        list18 = (ArrayList<Note>) databaseAccess.getmedgeneral();
        list19 = (ArrayList<Note>) databaseAccess.getophtalmo();
        list20 = (ArrayList<Note>) databaseAccess.geturologie();
        list21 = (ArrayList<Note>) databaseAccess.getortho();
        list22 = (ArrayList<Note>) databaseAccess.getchirugiegeneral();

        listofall.add(new Note("ARTICLES MEDICAUX ET ORTHOPEDIQUES","",99,"","","","",""));
        listofall.addAll(list);
        listofall.add(new Note("Pédiatres","",99,"","","","",""));
        listofall.addAll(list2);
        listofall.add(new Note("Pédopsychiatre","",99,"","","","",""));
        listofall.addAll(list3);
        listofall.add(new Note("Psychomotricien","",99,"","","","",""));
        listofall.addAll(list4);
        listofall.add(new Note("Radiologie","",99,"","","","",""));
        listofall.addAll(list5);
        listofall.add(new Note("Cardiologie","",99,"","","","",""));
        listofall.addAll(list6);
        listofall.add(new Note("Chirurgie O.R.L","",99,"","","","",""));
        listofall.addAll(list7);
        listofall.add(new Note("AUDIOLOGIE","",99,"","","","",""));
        listofall.addAll(list8);
        listofall.add(new Note("ORTHOPHONISTE","",99,"","","","",""));
        listofall.addAll(list9);
        listofall.add(new Note("Dermatologie","",99,"","","","",""));
        listofall.addAll(list10);
        listofall.add(new Note("Endocrinologie","",99,"","","","",""));
        listofall.addAll(list11);
        listofall.add(new Note("Gastro Enterologie","",99,"","","","",""));
        listofall.addAll(list12);
        listofall.add(new Note("Gynécologie Obstétrique","",99,"","","","",""));
        listofall.addAll(list13);
        listofall.add(new Note("Kinésithérapeute","",99,"","","","",""));
        listofall.addAll(list14);
        listofall.add(new Note("Laboratoire Prothèse Dentaire","",99,"","","","",""));
        listofall.addAll(list15);
        listofall.add(new Note("MEDECINE  DENTAIRE","",99,"","","","",""));
        listofall.addAll(list16);
        listofall.add(new Note("MEDECINE GÉNÉRALE","",99,"","","","",""));
        listofall.addAll(list18);
        listofall.add(new Note("OPHTALMOLOGIE","",99,"","","","",""));
        listofall.addAll(list19);
        listofall.add(new Note("Urologie","",99,"","","","",""));
        listofall.addAll(list20);
        listofall.add(new Note("Chirurgie Orthopédique","",99,"","","","",""));
        listofall.addAll(list21);
        listofall.add(new Note("Chirurgie Générale","",99,"","","","",""));
        listofall.addAll(list22);
        adapter.setNotes(listofall, this, this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {

        databaseAccess.close();
        super.onPause();
    }

    @Override
    protected void onStart() {

        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
          MenuItem searchitem =menu.findItem(R.id.search);
        SearchView searchView =(SearchView) searchitem.getActionView();
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
}

