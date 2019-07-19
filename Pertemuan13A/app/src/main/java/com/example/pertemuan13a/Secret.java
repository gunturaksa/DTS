package com.example.pertemuan13a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Secret extends AppCompatActivity {
    TextView lbl_hasil;
    EditText Txt_Nama;
    EditText Txt_NIM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret);
        lbl_hasil = findViewById(R.id.lbl_hasil);
        Txt_Nama = findViewById(R.id.Txt_Nama);
        Txt_NIM = findViewById(R.id.Txt_NIM);
    }
    public void inputkan (View v){
        lbl_hasil.setText("NIM : "+Txt_NIM.getText()+"\n"+"NAMA : "+Txt_Nama.getText());
    }
}
