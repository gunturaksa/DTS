package com.example.pertemuan5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Menu3 extends AppCompatActivity {
    EditText Txt_Nama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);

        Txt_Nama = findViewById(R.id.Txt_Nama);
        Hasil = findViewById(R.id.Lbl_Hasil);
    }
    public void Tampil_Hasil(View v){
        Hasil.setText("Nama Anda Adalah : " +Txt_Nama.getText());
    }
}
