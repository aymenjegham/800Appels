package com.example.asus.appels800.model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.reactivestreams.Subscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.Observable;

import static android.support.constraint.Constraints.TAG;

public class DatabaseAccess {

    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static  DatabaseAccess instance;
    Cursor c= null;

    private DatabaseAccess(Context context){
        this.openHelper=new DatabaseOpenHelper(context);
    }

    public static DatabaseAccess getInstance(Context context){
        if(instance == null){
            instance=new DatabaseAccess(context);
        }
        return instance;
    }

    public void  open(){
        this.db=openHelper.getWritableDatabase();
    }

    public void close(){
        if(db !=null){
            this.db.close();
        }
    }

 /*   public String getlist(String param){
        c=db.rawQuery("SELECT * FROM annuaire_table",null);
        StringBuffer buffer =new StringBuffer();
        while (c.moveToNext()){
            String list = c.getString(0);
           buffer.append(""+list);
        }
        return  buffer.toString();
    }

    */
    public List<Note> getlist(String param) {
        List<Note> studentArrayList = new ArrayList<Note>();
         Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= ?", new String [] {param});
        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getsoinlist(String param1,String param2) {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description IN ( ? ,?)", new String [] {param1,param2});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getarticlesmedic() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'ARTICLES MEDICAUX ET ORTHOPEDIQUES'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }



    public List<Note> getpediatres() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Pédiatres'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getpedopsychiatr() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Pédopsychiatre'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getpedopsychomotric() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Psychomotricien'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getradio() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Radiologie'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getcardio() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Cardiologie'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getorl() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Chirurgie O.R.L'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getaudio() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'AUDIOLOGIE'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getorthophoniste() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'ORTHOPHONISTE'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getdermato() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Dermatologie'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getendocrino() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Endocrinologie'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getgastro() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Gastro Enterologie'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getgynecolog() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Gynécologie Obstétrique'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getkynesy() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Kinésithérapeute'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getlabodentaire() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Laboratoire Prothèse Dentaire'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getlaboanal() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Laboratoire D’analyses Médicales'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getmeddentaire() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'MEDECINE  DENTAIRE'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getmedgeneral() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'MEDECINE GÉNÉRALE'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }


    public List<Note> getophtalmo() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'OPHTALMOLOGIE'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> geturologie() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Urologie'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }

    public List<Note> getortho() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Chirurgie Orthopédique'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }
    public List<Note> getchirugiegeneral() {
        List<Note> studentArrayList = new ArrayList<Note>();
        Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table where  description= 'Chirurgie Générale'", new String [] {});

        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour")),cursor.getString(cursor.getColumnIndex("type"))));
        }

        return studentArrayList ;
    }
}
