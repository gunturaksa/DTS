package com.example.pertemuan10a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TampilanAwal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_awal);
    }
    public void internalpage (View v){
        Intent internal = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(internal);
    }
    public void externalpage (View v){
        Intent external = new Intent(getApplicationContext(),External.class);
        startActivity(external);
    }
}
