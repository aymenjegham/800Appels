package com.example.asus.appels800.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Aymen Jegham on 06/11/2018.
 */


 public class Note {
    private int id;
    private String title;
    private String description;
    private int priority;
    private String numone;
    private String numtwo;
    private String numthree;
    private String numfour;
    private String type;

    public static final int MEDECINETYPE = 99;


    public Note(String title, String description, int priority,String numone,String numtwo,String numthree,String numfour,String type) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.numone=numone;
        this.numtwo=numtwo;
        this.numthree=numthree;
        this.numfour=numfour;
        this.type=type;
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

    public String getNumone() {
        return numone;
    }

    public void setNumone(String numone) {
        this.numone = numone;
    }

    public String getNumtwo() {
        return numtwo;
    }

    public void setNumtwo(String numtwo) {
        this.numtwo = numtwo;
    }

    public String getNumthree() {
        return numthree;
    }

    public void setNumthree(String numthree) {
        this.numthree = numthree;
    }

    public String getNumfour() {
        return numfour;
    }

    public void setNumfour(String numfour) {
        this.numfour = numfour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
