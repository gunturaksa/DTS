package com.example.pertemuan13b;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

import static com.example.pertemuan13b.konfigurasi.URL_ADD;

public class  MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextName;
    private EditText editTextDesg;
    private EditText editTextSal;

    private Button buttonAdd;
    private Button buttonView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = findViewById(R.id.editTextName);
        editTextDesg = findViewById(R.id.editTextDesg);
        editTextSal = findViewById(R.id.editTextSalary);

        buttonAdd =  findViewById(R.id.buttonAdd);
        buttonView = findViewById(R.id.buttonView);

        buttonAdd.setOnClickListener(this);
        buttonView.setOnClickListener(this);

    }
    private void addEmployee() {
        final String name = editTextName.getText().toString().trim();
        final String desg = editTextDesg.getText().toString().trim();
        final String sal = editTextSal.getText().toString().trim();

        class addEmployee extends AsyncTask<Void,Void,String>{
            ProgressDialog loading;

            protected void onPreExecute(){
                super.onPreExecute();
                loading = ProgressDialog.show(MainActivity.this,"Menambahkan...","Tunggu Sebentar...",false,false);
            }
        protected void onPostExecute(String s){
                super.onPostExecute(s);
                loading.dismiss();
            Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
            }
            protected String doInBackground(Void... v){
                HashMap<String,String> params = new HashMap<>();
                params.put(konfigurasi.KEY_EMP_NAMA,name);
                params.put(konfigurasi.KEY_EMP_POSISI,desg);
                params.put(konfigurasi.KEY_EMP_GAJIH,sal);
                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(konfigurasi.URL_ADD, params);
                return res;
            }
        }
        addEmployee ae = new addEmployee();
        ae.execute();
    }
    public void onClick(View v){
        if (v == buttonAdd){
            addEmployee();
        }
        if(v == buttonView){
            startActivity(new Intent(getApplicationContext(),TampilanSemuaPegawai.class));
        }
    }
}
