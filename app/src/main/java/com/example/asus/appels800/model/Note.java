package com.example.asus.appels800.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Aymen Jegham on 06/11/2018.
 */


@Entity(tableName = "note_table")
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;
    private String description;
    private int priority;

    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
