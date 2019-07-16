package com.example.pertemuan11a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText etname;
    private DatabaseHelper databasehelper;
    private TextView tvnames;
    private ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databasehelper = new DatabaseHelper(this);
        tvnames = findViewById(R.id.tvnames);
        etname = findViewById(R.id.etname);
    }
public void inputdata(View v){
        databasehelper.addStudentDetail(etname.getText().toString());
        etname.setText("");
        Toast.makeText(this,"Stored Successfully",Toast.LENGTH_SHORT).show();
    }
    public void tampilkan(View v){
        arrayList = databasehelper.getAllStudentsList();
        tvnames.setText("");
        for (int i=0;i<arrayList.size();i++){
            tvnames.setText(tvnames.getText().toString()+", "+arrayList.get(i));
        }
    }
}
