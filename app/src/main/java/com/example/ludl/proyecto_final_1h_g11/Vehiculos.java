package com.example.ludl.proyecto_final_1h_g11;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.ArrayRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Vehiculos extends AppCompatActivity {

    String lineatxt;
    String txtcompleto;
    // Hasta aqui cahe loco el resto ya no le comprendi


    public  void  Editar(View view){


        Intent newform = new Intent(Vehiculos.this,Editar.class);
        finish();
        startActivity(newform);
    }

    public  void  Insertar(View view){


        Intent newform = new Intent(Vehiculos.this,Insertar.class);
        finish();
        startActivity(newform);
    }

    public  void  Eliminar(View view){


        Intent newform = new Intent(Vehiculos.this,Eliminar.class);
        finish();
        startActivity(newform);
    }



}
