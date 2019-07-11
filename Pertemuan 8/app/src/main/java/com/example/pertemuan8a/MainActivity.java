package com.example.pertemuan8a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        EditText Txt_Angka1;
        EditText Txt_Angka2;
        TextView hasil;
        int a,b,proc;

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.optionmenu, menu);
            return true;
        }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu1) {
            startActivity(new Intent(this, Menu1.class));
        }
        return true;
    }
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Txt_Angka1 = findViewById(R.id.Txt_Angka1);
            Txt_Angka2 = findViewById(R.id.Txt_Angka2);
            hasil = findViewById(R.id.Lbl_Angka);
        }
        public void tambah (View v) {
            if (Txt_Angka1.getText().length()>0 && Txt_Angka2.getText().length()>0) {
                a = Integer.parseInt(Txt_Angka1.getText().toString());
                b = Integer.parseInt(Txt_Angka2.getText().toString());
                proc = a + b;
                hasil.setText(Integer.toString(proc));
            }
            else
                Toast.makeText(this, "Masukkan Angka Lebih Dahulu", Toast.LENGTH_SHORT).show();
        }
        public void kurang (View v){
            if (Txt_Angka1.getText().length()>0 && Txt_Angka2.getText().length()>0) {
                a = Integer.parseInt(Txt_Angka1.getText().toString());
                b = Integer.parseInt(Txt_Angka2.getText().toString());
                proc = a - b;
                hasil.setText(Integer.toString(proc));
            }
            else
                Toast.makeText(this, "Masukkan Angka Lebih Dahulu", Toast.LENGTH_SHORT).show();
        }
        public void kali (View v){
            if (Txt_Angka1.getText().length()>0 && Txt_Angka2.getText().length()>0) {
                a = Integer.parseInt(Txt_Angka1.getText().toString());
                b = Integer.parseInt(Txt_Angka2.getText().toString());
                proc = a * b;
                hasil.setText(Integer.toString(proc));
            }
            else
                Toast.makeText(this, "Masukkan Angka Lebih Dahulu", Toast.LENGTH_SHORT).show();
        }
        public void bagi (View v){
            if (Txt_Angka1.getText().length()>0 && Txt_Angka2.getText().length()>0) {
                a = Integer.parseInt(Txt_Angka1.getText().toString());
                b = Integer.parseInt(Txt_Angka2.getText().toString());
                proc = a / b;
                hasil.setText(Integer.toString(proc));
            }
            else
                Toast.makeText(this, "Masukkan Angka Lebih Dahulu", Toast.LENGTH_SHORT).show();
        }
        public void clear (View v){
            Txt_Angka1.setText("");
            Txt_Angka2.setText("");
        }
}
