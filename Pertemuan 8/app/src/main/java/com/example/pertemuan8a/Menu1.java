package com.example.pertemuan8a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Menu1 extends AppCompatActivity {
    EditText Txt_CheckAngka;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        Txt_CheckAngka = findViewById(R.id.Txt_CheckAngka);
    }
    public void check (View v) {


        if (Txt_CheckAngka.getText().length() < 1){
            Toast.makeText(this, "Masukkan Angka", Toast.LENGTH_SHORT).show();
        }
        else {
                a = Integer.parseInt(Txt_CheckAngka.getText().toString());
                if (a % 2 == 0) {
                    Toast.makeText(this, "Angka Yang Anda Masukkan Adalah Genap", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Angka Yang Anda Masukkan Adalah Ganjil", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

