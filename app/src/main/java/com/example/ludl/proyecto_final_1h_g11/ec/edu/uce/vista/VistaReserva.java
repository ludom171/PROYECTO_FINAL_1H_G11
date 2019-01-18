package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.vista;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.ludl.proyecto_final_1h_g11.R;

public class VistaReserva extends AppCompatActivity {

    Button regresar;
    Button reservar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reserva);

        regresar=(Button)findViewById(R.id.btn_regresar1);
        reservar=(Button)findViewById(R.id.btn_reservar);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newform = new Intent(VistaReserva.this,VistaMenu.class);
                finish();
                startActivity(newform);
            }
        });

    }
}