package com.example.asus.appels800.model;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

/**
 * Created by ASUS on 15/11/2018.
 */
@Database(entities = {Note.class},version = 6)
public abstract class NoteDatabase extends RoomDatabase {


    private static NoteDatabase instance;

    public abstract NoteDao noteDao();

    public static  synchronized  NoteDatabase getInstance(Context context){
        if (instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),NoteDatabase.class,"annuaire_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }
        return  instance;
    }



    private static  RoomDatabase.Callback roomCallback =new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
           // new PopulateDbAsyncTask(instance).execute();
        }
    };



    private static class PopulateDbAsyncTask extends AsyncTask<Void,Void,Void>{


        private  NoteDao noteDao;

        public PopulateDbAsyncTask(NoteDatabase db) {
            noteDao = db.noteDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
        /*   noteDao.inseret(new Note("Title 4","Descrn 1",1,"ffg","ffg","ffg","ffg"));
            noteDao.inseret(new Note("Title 2","Description 2",2,"ffg","ffg","ffg","ffg"));
            noteDao.inseret(new Note("Title 3","Description 3",3,"ffg","ffg","ffg","ffg"));*/

            return null;
        }
    }

}
