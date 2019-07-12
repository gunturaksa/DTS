package com.example.pertemuan9a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText NIM;
    EditText Nama;
    EditText Kampus;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NIM = findViewById(R.id.NIM);
        Nama = findViewById(R.id.Nama);
        Kampus = findViewById(R.id.Kampus);
        hasil = findViewById(R.id.Hasil);
    }
    public void tampil_hasil (View v) {
        hasil.setText("NIM : "+NIM.getText()+"\n"+"Nama : "+Nama.getText()+"\n"+"Kampus : "+Kampus.getText());
    }

}
