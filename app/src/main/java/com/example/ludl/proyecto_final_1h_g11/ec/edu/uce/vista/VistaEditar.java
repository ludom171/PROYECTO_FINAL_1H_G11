package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.vista;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.ludl.proyecto_final_1h_g11.R;

public class VistaEditar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editar);

    }

    public  void  Aceptar(View view){
        Intent newform = new Intent(VistaEditar.this,VistaVehiculos.class);
        finish();
        startActivity(newform);
    }

}
