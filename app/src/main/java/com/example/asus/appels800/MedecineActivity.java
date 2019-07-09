package com.example.asus.appels800;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.asus.appels800.model.DatabaseAccess;
import com.example.asus.appels800.model.Note;

import java.util.ArrayList;


public class MedecineActivity extends AppCompatActivity {


    RecyclerView recyclerViewarticlesmedic ;
    RecyclerView recyclerViewapediatres ;
    RecyclerView recyclerViewpedopsychiatr;
    RecyclerView recyclerViewpedomotric ;
    RecyclerView recyclerViewradio ;
    RecyclerView recyclerViewcardio;
    RecyclerView recyclerVieworl ;
    RecyclerView recyclerViewaudio;
    RecyclerView recyclerVieworthophoniste;
    RecyclerView recyclerViewdermato;
    RecyclerView recyclerViewendocrino;
    RecyclerView recyclerViewgastro;
    RecyclerView recyclerViewgynecolog;
    RecyclerView recyclerViewkinesy;
    RecyclerView recyclerViewlabodent;
    RecyclerView recyclerViewlaboanal;
    RecyclerView recyclerViewmeddentaire;
    RecyclerView recyclerViewmedgeneral;
    RecyclerView recyclerViewophtalmo;
    RecyclerView recyclerViewurologie;
    RecyclerView recyclerViewortho;
    RecyclerView recyclerViewchirugiegeneral;

    ProgressBar progressbar;

    DatabaseAccess databaseAccess;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medecine);

        Log.v("debuginconsistneyc", "Medecine : Oncreated");
        getSupportActionBar().setTitle("Médecine");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        progressbar=findViewById(R.id.progressBar);






    }

    @Override
    protected void onResume() {

        Log.v("debuginconsistneyc", "Medecine : OnResumed");


        databaseAccess= DatabaseAccess.getInstance(this);
        databaseAccess.open();

        super.onResume();
        new BackgroundTask(recyclerViewarticlesmedic,recyclerViewapediatres,recyclerViewpedopsychiatr,
                recyclerViewpedomotric,recyclerViewradio,recyclerViewcardio
        ,recyclerVieworl,recyclerViewaudio,recyclerVieworthophoniste,recyclerViewdermato,
                recyclerViewendocrino,recyclerViewgastro,
                recyclerViewgynecolog,recyclerViewkinesy,recyclerViewlabodent,recyclerViewlaboanal,
                recyclerViewmeddentaire,recyclerViewmedgeneral,recyclerViewophtalmo,recyclerViewurologie
        ,recyclerViewortho,recyclerViewchirugiegeneral,this,this,progressbar,databaseAccess).execute();
    }

    @Override
    protected void onDestroy() {
        Log.v("debuginconsistneyc", "Medecine : Ondestroy");


        super.onDestroy();


    }

    @Override
    protected void onPause() {
        Log.v("debuginconsistneyc", "Medecine : OnPause");

        databaseAccess.close();







        super.onPause();
    }

    @Override
    protected void onStart() {
        Log.v("debuginconsistneyc", "Medecine : Onstart");


        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.v("debuginconsistneyc", "Medecine : Onstop");



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
                //  adapter.getFilter().filter(s);
                return false;
            }
        });




        return true;
    }
}






class BackgroundTask extends AsyncTask<Void,Integer,Void>{



    RecyclerView recyclerViewarticlesmedic ;
    RecyclerView recyclerViewapediatres ;
    RecyclerView recyclerViewpedopsychiatr;
    RecyclerView recyclerViewpedomotric ;
    RecyclerView recyclerViewradio ;
    RecyclerView recyclerViewcardio;
    RecyclerView recyclerVieworl ;
    RecyclerView recyclerViewaudio;
    RecyclerView recyclerVieworthophoniste;
    RecyclerView recyclerViewdermato;
    RecyclerView recyclerViewendocrino;
    RecyclerView recyclerViewgastro;
    RecyclerView recyclerViewgynecolog;
    RecyclerView recyclerViewkinesy;
    RecyclerView recyclerViewlabodent;
    RecyclerView recyclerViewlaboanal;
    RecyclerView recyclerViewmeddentaire;
    RecyclerView recyclerViewmedgeneral;
    RecyclerView recyclerViewophtalmo;
    RecyclerView recyclerViewurologie;
    RecyclerView recyclerViewortho;
    RecyclerView recyclerViewchirugiegeneral;

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

    NoteAdapter adapter  ;
      NoteAdapter adapter2 ;
     NoteAdapter adapter3  ;
    NoteAdapter adapter4  ;
      NoteAdapter adapter5  ;
      NoteAdapter adapter6  ;
      NoteAdapter adapter7  ;
      NoteAdapter adapter8  ;
      NoteAdapter adapter9  ;
      NoteAdapter adapter10 ;
      NoteAdapter adapter11 ;
      NoteAdapter adapter12  ;
     NoteAdapter adapter13  ;
     NoteAdapter adapter14  ;
    NoteAdapter adapter15  ;
     NoteAdapter adapter16  ;
      NoteAdapter adapter17 ;
      NoteAdapter adapter18  ;
      NoteAdapter adapter19  ;
      NoteAdapter adapter20  ;
     NoteAdapter adapter21  ;
      NoteAdapter adapter22  ;

      Context context;
       ProgressBar progressbar;
      DatabaseAccess databaseAccess;
    MedecineActivity medecineActivity;




    public BackgroundTask(RecyclerView recyclerViewarticlesmedic, RecyclerView recyclerViewapediatres, RecyclerView recyclerViewpedopsychiatr, RecyclerView recyclerViewpedomotric, RecyclerView recyclerViewradio, RecyclerView recyclerViewcardio, RecyclerView recyclerVieworl, RecyclerView recyclerViewaudio, RecyclerView recyclerVieworthophoniste, RecyclerView recyclerViewdermato, RecyclerView recyclerViewendocrino, RecyclerView recyclerViewgastro, RecyclerView recyclerViewgynecolog, RecyclerView recyclerViewkinesy, RecyclerView recyclerViewlabodent, RecyclerView recyclerViewlaboanal, RecyclerView recyclerViewmeddentaire, RecyclerView recyclerViewmedgeneral, RecyclerView recyclerViewophtalmo, RecyclerView recyclerViewurologie, RecyclerView recyclerViewortho, RecyclerView recyclerViewchirugiegeneral,Context context,MedecineActivity medecineActivity,ProgressBar progressbar,DatabaseAccess databaseAccess) {
        this.recyclerViewarticlesmedic = recyclerViewarticlesmedic;
        this.recyclerViewapediatres = recyclerViewapediatres;
        this.recyclerViewpedopsychiatr = recyclerViewpedopsychiatr;
        this.recyclerViewpedomotric = recyclerViewpedomotric;
        this.recyclerViewradio = recyclerViewradio;
        this.recyclerViewcardio = recyclerViewcardio;
        this.recyclerVieworl = recyclerVieworl;
        this.recyclerViewaudio = recyclerViewaudio;
        this.recyclerVieworthophoniste = recyclerVieworthophoniste;
        this.recyclerViewdermato = recyclerViewdermato;
        this.recyclerViewendocrino = recyclerViewendocrino;
        this.recyclerViewgastro = recyclerViewgastro;
        this.recyclerViewgynecolog = recyclerViewgynecolog;
        this.recyclerViewkinesy = recyclerViewkinesy;
        this.recyclerViewlabodent = recyclerViewlabodent;
        this.recyclerViewlaboanal = recyclerViewlaboanal;
        this.recyclerViewmeddentaire = recyclerViewmeddentaire;
        this.recyclerViewmedgeneral = recyclerViewmedgeneral;
        this.recyclerViewophtalmo = recyclerViewophtalmo;
        this.recyclerViewurologie = recyclerViewurologie;
        this.recyclerViewortho = recyclerViewortho;
        this.recyclerViewchirugiegeneral = recyclerViewchirugiegeneral;
        this.context=context;
        this.medecineActivity=medecineActivity;
         this.progressbar=progressbar;
        this.databaseAccess=databaseAccess;

        this.recyclerViewarticlesmedic = medecineActivity.findViewById(R.id.recyclerView);
        this.recyclerViewapediatres = medecineActivity.findViewById(R.id.recyclerView2_pediatres);
        this.recyclerViewpedopsychiatr =medecineActivity.findViewById(R.id.recyclerView3);
        this.recyclerViewpedomotric = medecineActivity.findViewById(R.id.recyclerView4);
        this.recyclerViewradio =medecineActivity.findViewById(R.id.recyclerView5);
        this.recyclerViewcardio =medecineActivity.findViewById(R.id.recyclerView6);
        this.recyclerVieworl =medecineActivity.findViewById(R.id.recyclerView7);
        this.recyclerViewaudio = medecineActivity.findViewById(R.id.recyclerView8);
        this.recyclerVieworthophoniste =medecineActivity.findViewById(R.id.recyclerView9);
        this.recyclerViewdermato =medecineActivity.findViewById(R.id.recyclerView10);
        this.recyclerViewendocrino =medecineActivity.findViewById(R.id.recyclerView11);
        this.recyclerViewgastro = medecineActivity.findViewById(R.id.recyclerView12);
        this.recyclerViewgynecolog =medecineActivity.findViewById(R.id.recyclerView13);
        this.recyclerViewkinesy = medecineActivity.findViewById(R.id.recyclerView14);
        this.recyclerViewlabodent = medecineActivity.findViewById(R.id.recyclerView15);
        this.recyclerViewlaboanal = medecineActivity.findViewById(R.id.recyclerView16);
        this.recyclerViewmeddentaire =medecineActivity.findViewById(R.id.recyclerView17);
        this.recyclerViewmedgeneral =medecineActivity.findViewById(R.id.recyclerView18);
        this.recyclerViewophtalmo = medecineActivity.findViewById(R.id.recyclerView19);
        this.recyclerViewurologie = medecineActivity.findViewById(R.id.recyclerView20);
        this.recyclerViewortho = medecineActivity.findViewById(R.id.recyclerView21);
        this.recyclerViewchirugiegeneral =medecineActivity.findViewById(R.id.rv22);


        this.recyclerViewarticlesmedic.setLayoutManager(new LinearLayoutManager(medecineActivity ));
        this.recyclerViewapediatres.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewpedopsychiatr.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewpedomotric.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewradio.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewcardio.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerVieworl.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewaudio.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerVieworthophoniste.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewdermato.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewendocrino.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewgastro.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewgynecolog.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewkinesy.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewlabodent.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewlaboanal.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewmeddentaire.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewmedgeneral.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewophtalmo.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewurologie.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewortho.setLayoutManager(new LinearLayoutManager(medecineActivity));
        this.recyclerViewchirugiegeneral.setLayoutManager(new LinearLayoutManager(medecineActivity));


        this.recyclerViewarticlesmedic.setHasFixedSize(false);
        this.recyclerViewapediatres.setHasFixedSize(false);
        this.recyclerViewpedopsychiatr.setHasFixedSize(false);
        this.recyclerViewpedomotric.setHasFixedSize(false);
        this.recyclerViewradio.setHasFixedSize(false);
        this.recyclerViewcardio.setHasFixedSize(false);
        this.recyclerVieworl.setHasFixedSize(false);
        this.recyclerViewaudio.setHasFixedSize(false);
        this.recyclerVieworthophoniste.setHasFixedSize(false);
        this.recyclerViewdermato.setHasFixedSize(false);
        this.recyclerViewendocrino.setHasFixedSize(false);
        this.recyclerViewgastro.setHasFixedSize(false);
        this.recyclerViewgynecolog.setHasFixedSize(false);
        this.recyclerViewkinesy.setHasFixedSize(false);
        this.recyclerViewlabodent.setHasFixedSize(false);
        this.recyclerViewlaboanal.setHasFixedSize(false);
        this.recyclerViewmeddentaire.setHasFixedSize(false);
        this.recyclerViewmedgeneral.setHasFixedSize(false);
        this.recyclerViewophtalmo.setHasFixedSize(false);
        this.recyclerViewurologie.setHasFixedSize(false);
        this.recyclerViewortho.setHasFixedSize(false);
        this.recyclerViewchirugiegeneral.setHasFixedSize(false);


    }




    @Override
    protected void onPreExecute() {

        Log.v("debuginconsistneyc", "asynck : onpre");



         progressbar.setVisibility(View.VISIBLE);
        adapter = new NoteAdapter();
        adapter2 = new NoteAdapter();
        adapter3 = new NoteAdapter();
        adapter4 = new NoteAdapter();
        adapter5 = new NoteAdapter();
        adapter6 = new NoteAdapter();
        adapter7 = new NoteAdapter();
        adapter8 = new NoteAdapter();
        adapter9 = new NoteAdapter();
        adapter10 = new NoteAdapter();
        adapter11 = new NoteAdapter();
        adapter12 = new NoteAdapter();
        adapter13 = new NoteAdapter();
        adapter14 = new NoteAdapter();
        adapter15 = new NoteAdapter();
        adapter16 = new NoteAdapter();
        adapter17 = new NoteAdapter();
        adapter18 = new NoteAdapter();
        adapter19 = new NoteAdapter();
        adapter20 = new NoteAdapter();
        adapter21 = new NoteAdapter();
        adapter22 = new NoteAdapter();


        this.recyclerViewarticlesmedic.setAdapter(adapter);
        this.recyclerViewapediatres.setAdapter(adapter2);
        this.recyclerViewpedopsychiatr.setAdapter(adapter3);
        this.recyclerViewpedomotric.setAdapter(adapter4);
        this.recyclerViewradio.setAdapter(adapter5);
        this.recyclerViewcardio.setAdapter(adapter6);
        this.recyclerVieworl.setAdapter(adapter7);
        this.recyclerViewaudio.setAdapter(adapter8);
        this.recyclerVieworthophoniste.setAdapter(adapter9);
        this.recyclerViewdermato.setAdapter(adapter10);
        this.recyclerViewendocrino.setAdapter(adapter11);
        this.recyclerViewgastro.setAdapter(adapter12);
        this.recyclerViewgynecolog.setAdapter(adapter13);
        this.recyclerViewkinesy.setAdapter(adapter14);
        this.recyclerViewlabodent.setAdapter(adapter15);
        this.recyclerViewlaboanal.setAdapter(adapter16);
        this.recyclerViewmeddentaire.setAdapter(adapter17);
        this.recyclerViewmedgeneral.setAdapter(adapter18);
        this.recyclerViewophtalmo.setAdapter(adapter19);
        this.recyclerViewurologie.setAdapter(adapter20);
        this.recyclerViewortho.setAdapter(adapter21);
        this.recyclerViewchirugiegeneral.setAdapter(adapter22);


     }

    @Override
    protected Void doInBackground(Void... voids) {

        Log.v("debuginconsistneyc", "asynck : onback");












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













        return null;
    }
    @Override
    protected void onPostExecute(Void aVoid) {


        Log.v("debuginconsistneyc", "asynck : onPost");

        adapter.setNotes(list, context, medecineActivity);
        adapter2.setNotes(list2, context, medecineActivity);
        adapter3.setNotes(list3, context, medecineActivity);
        adapter4.setNotes(list4, context, medecineActivity);
        adapter5.setNotes(list5, context, medecineActivity);
        adapter6.setNotes(list6, context, medecineActivity);
        adapter7.setNotes(list7, context, medecineActivity);
        adapter8.setNotes(list8, context, medecineActivity);
        adapter9.setNotes(list9, context, medecineActivity);
        adapter10.setNotes(list10, context, medecineActivity);
        adapter11.setNotes(list11, context, medecineActivity);
        adapter12.setNotes(list12, context, medecineActivity);
        adapter13.setNotes(list13, context, medecineActivity);
        adapter14.setNotes(list14, context, medecineActivity);
        adapter15.setNotes(list15, context, medecineActivity);
        adapter16.setNotes(list16, context, medecineActivity);
        adapter17.setNotes(list17, context, medecineActivity);
        adapter18.setNotes(list18, context, medecineActivity);
        adapter19.setNotes(list19, context, medecineActivity);
        adapter20.setNotes(list20, context, medecineActivity);
        adapter21.setNotes(list21, context, medecineActivity);
        adapter22.setNotes(list22, context, medecineActivity);






        progressbar.setVisibility(View.GONE);







    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        progressbar.post(new Runnable() {
            @Override
            public void run() {
                Log.v("updateprogress",values[0]+"   ");
                 progressbar.setProgress(values[0]);
             }
        });

    }



}
