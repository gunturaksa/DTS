package com.example.pertemuan5;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu1 extends AppCompatActivity {
    Button Btn1;
    Button Btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        Btn1 = findViewById(R.id.Btn1);
        Btn2 = findViewById(R.id.Btn2);
    }
    public void ubahMerah(View v){
        Btn1.setBackgroundColor(Color.RED);
    }
    public void ubahHijau(View v){
        Btn2.setBackgroundColor(Color.GREEN);
    }
}
