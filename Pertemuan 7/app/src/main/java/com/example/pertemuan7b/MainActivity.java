package com.example.pertemuan7b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Txt_Nama;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hasil = findViewById(R.id.Lbl_Hasil);
        Txt_Nama = findViewById(R.id.Txt_Nama);
    }
    public void tampil_hasil (View v){
        hasil.setText("Nama Anda Adalah " +Txt_Nama.getText());
    }
}
