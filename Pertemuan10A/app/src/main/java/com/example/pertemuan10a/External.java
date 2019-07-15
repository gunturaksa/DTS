package com.example.pertemuan10a;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class External extends AppCompatActivity {

        public static final String FILENAME = "namafile.txt";
        TextView TextBaca;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_external);
            TextBaca = findViewById(R.id.Lbl_Text_External);
        }
        public void buatfileex (View v) {

            String isiFile = "Coba isi Data File Text";


            String kondisi = Environment.getExternalStorageState();
            if (!Environment.MEDIA_MOUNTED.equals(kondisi)){
                return;
            }

            File file = new File(getExternalFilesDir(null),FILENAME);
            FileOutputStream outputStream = null;
            try {
                file.createNewFile();
                outputStream = new FileOutputStream(file, true);
                outputStream.write(isiFile.getBytes());
                outputStream.flush();
                outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void gantifileex (View v) {
            String ubah = "Update isi data File Text";
            File file = new File(getExternalFilesDir(null),FILENAME);

            FileOutputStream outputStream = null;
            try {
                file.createNewFile();
                outputStream = new FileOutputStream(file, false);
                outputStream.write(ubah.getBytes());
                outputStream.flush();
                outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public void bacafileex (View v){
            File sdcard = getExternalFilesDir(null);
            File file = new File(getExternalFilesDir(null),FILENAME);
            if (file.exists()){
                StringBuilder text = new StringBuilder();

                try{
                    BufferedReader br = new BufferedReader(new FileReader(file));

                    String line = br.readLine();

                    while (line != null){
                        text.append(line);
                        line = br.readLine();
                    }
                    br.close();
                }
                catch (IOException e){
                    System.out.println("Error "+e.getMessage());
                }
                TextBaca.setText(text.toString());
            }
        }
        public void hapusfileex(View v){
            File file = new File(getExternalFilesDir(null),FILENAME);
            if (file.exists()){
                file.delete();
            }
        }
    }