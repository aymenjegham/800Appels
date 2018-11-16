package com.example.asus.architecturecomponentexample;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by ASUS on 15/11/2018.
 */

@Dao
public interface NoteDao {

    @Insert
    void inseret(Note note);


    @Update
    void update(Note note);


    @Delete
    void delete(Note note);


    @Query("DELETE FROM note_table")
    void deleteAllNotes();



    @Query("SELECT * FROM note_table ORDER BY priority DESC")
    LiveData<List<Note>> getAllNotes();
}
