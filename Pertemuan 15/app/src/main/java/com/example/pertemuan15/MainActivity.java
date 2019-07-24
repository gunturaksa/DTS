package com.example.pertemuan15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    String usernamedata;
    String passworddata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
    }

    public void masuk(View v) {
        usernamedata = username.getText().toString();
        passworddata = password.getText().toString();
        if (usernamedata.equals("admin") && passworddata.equals("admin")){
            Intent masuk = new Intent(getApplicationContext(), activity_menuutama.class);
            startActivity(masuk);
            finish();
        }
        else
            Toast.makeText(this,"Anda Memasukkan Password Dan Username yang Salah",Toast.LENGTH_SHORT).show();
    }
        public void keluar (View v){
            finish();
        }
    }

