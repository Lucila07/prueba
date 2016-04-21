package com.example.lucila.myapplication;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ejemploFragments extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       //el viewgroup es el container dnd se va a dibujar el fragment
       // al inflate le mandas lo que queres dibujar(layout)  y el contenedor
        return inflater.inflate(R.layout.activity_ejemplo_fragments, container, false);
    }
}