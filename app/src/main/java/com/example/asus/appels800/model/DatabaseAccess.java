package com.example.asus.appels800.model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

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
    public List<Note> getlist() {
        List<Note> studentArrayList = new ArrayList<Note>();
         Cursor cursor = db.rawQuery("SELECT * FROM annuaire_table", null);
        while(cursor.moveToNext()) {
            studentArrayList.add(new Note(cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("description")), cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("numone")), cursor.getString(cursor.getColumnIndex("numtwo")),cursor.getString(cursor.getColumnIndex("numthree")),cursor.getString(cursor.getColumnIndex("numfour"))));
        }

        return studentArrayList ;
    }

}
