package com.example.asus.appels800.model;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseOpenHelper extends SQLiteAssetHelper {
    private static  final String DATABASE_NAME="annuaire_database.db";
    private  static  final int DATABASE_VERSION=1;

    public  DatabaseOpenHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
}
