package com.example.student.kolokwium_pycia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ArrayList<Leki> lekarstwo= new ArrayList<>();
        lekarstwo.add(new Leki("Wibowita"1));


    }
}
