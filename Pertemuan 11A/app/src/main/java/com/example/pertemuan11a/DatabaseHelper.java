package com.example.pertemuan11a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.util.Log;
import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static String DATABASE_NAME = "student_database";
    private static final int DATABASE_VERSION = 1;
    private static final String QUERY_CREATE = "CREATE TABLE mahasiswa(nim INTEGER PRIMARY KEY AUTOINCREMENT,nama TEXT);";

    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        Log.d("table",QUERY_CREATE);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL(QUERY_CREATE);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion,int newVersion){
        db.execSQL("DROP TABLE IF EXISTS 'mahasiswa'");
        onCreate(db);
    }
    public long addStudentDetail(String student){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("nama",student);
        long insert = db.insert("mahasiswa",null,values);
        return insert;
    }
    public ArrayList<String> getAllStudentsList(){
        ArrayList<String> studentsArrayList = new ArrayList<String>();
        String name="";
        String selectQuery = "SELECT * FROM mahasiswa";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery,null);
        if(c.moveToFirst()){
            do {
                name = c.getString(c.getColumnIndex("nama"));

                studentsArrayList.add(name);
            }while (c.moveToNext());
            Log.d("Array",studentsArrayList.toString());
        }
        return studentsArrayList;
    }
}
