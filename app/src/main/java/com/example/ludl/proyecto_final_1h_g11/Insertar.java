package com.example.ludl.proyecto_final_1h_g11;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Insertar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insertar);

    }

    public  void  Aceptar(View view){
        Intent newform = new Intent(Insertar.this,Vehiculos.class);
        finish();
        startActivity(newform);
    }

}
