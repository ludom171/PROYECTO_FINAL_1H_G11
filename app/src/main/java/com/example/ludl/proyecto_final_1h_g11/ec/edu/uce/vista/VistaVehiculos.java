package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.vista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ludl.proyecto_final_1h_g11.R;

public class VistaVehiculos extends AppCompatActivity {

    String lineatxt;
    String txtcompleto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vehiculos);

    }


    public  void  Editar(View view){
        Intent newform = new Intent(VistaVehiculos.this,VistaEditar.class);
        finish();
        startActivity(newform);
    }

    public  void  Insertar(View view){

        Intent newform = new Intent(VistaVehiculos.this,VistaInsertar.class);
        finish();
        startActivity(newform);
    }

    public  void  Eliminar(View view){
        Intent newform = new Intent(VistaVehiculos.this,VistaEliminar.class);
        finish();
        startActivity(newform);
    }

    public  void  Desconectar(View view){
        Intent newform = new Intent(VistaVehiculos.this,MainActivity.class);
        finish();
        startActivity(newform);
    }



}
