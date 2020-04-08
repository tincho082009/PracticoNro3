package com.example.practiconro3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        private ArrayList<Inmueble> lista = new ArrayList<Inmueble>();


@Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
        }

        public void cargarDatos(){
                lista.add(new Inmueble(R.drawable.casa1, "Juana Koslay", 80000));
        }
}

