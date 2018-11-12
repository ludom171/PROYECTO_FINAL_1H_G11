package com.example.ludl.proyecto_final_1h_g11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.vista.Editar;

public class Vehiculos extends AppCompatActivity {



    String lineatxt;
    String txtcompleto;
    // Hasta aqui cahe loco el resto ya no le comprendi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vehiculos);

    }


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
