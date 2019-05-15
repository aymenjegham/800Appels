package com.example.asus.appels800.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Aymen Jegham on 06/11/2018.
 */


@Entity(tableName = "annuaire_table")
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;
    private String description;
    private int priority;
    private int numone;
    private int numtwo;
    private int numthree;

    public Note(String title, String description, int priority,int numone,int numtwo,int numthree) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.numone=numone;
        this.numtwo=numtwo;
        this.numthree=numthree;
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

    public int getNumone() {
        return numone;
    }

    public void setNumone(int numone) {
        this.numone = numone;
    }

    public int getNumtwo() {
        return numtwo;
    }

    public void setNumtwo(int numtwo) {
        this.numtwo = numtwo;
    }

    public int getNumthree() {
        return numthree;
    }

    public void setNumthree(int numthree) {
        this.numthree = numthree;
    }
}
