package com.example.pertemuan5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Menu4 extends AppCompatActivity {
    EditText Txt_Isi;
    TextView Hasil;
    int x,y;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu4);
        Txt_Isi = findViewById(R.id.Txt_Isi);
        Hasil = findViewById(R.id.Lbl_Hasil);

    }
    public void Tampil_Hasil(View v){
        a = Integer.parseInt(Txt_Isi.getText().toString());
        x = 1;
        y = x * x;
        while(y != a){
            x=x+1;
            y=x*x;
        }

        Hasil.setText(Txt_Isi.getText()+" adalah pangkat dari "+x);
    }
}
