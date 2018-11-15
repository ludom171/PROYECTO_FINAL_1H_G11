package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.vista;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ludl.proyecto_final_1h_g11.R;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.controlador.UsuarioControlador;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.GlobalApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button ingresar;
    Button registro;

    EditText user;
    EditText pass;
    UsuarioControlador controlador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlador= new UsuarioControlador();

        ingresar=(Button)findViewById(R.id.ingresar);
        registro=(Button)findViewById(R.id.registrar);

        user=(EditText)findViewById(R.id.usuario);
        pass=(EditText)findViewById(R.id.password);


        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File file = new File(GlobalApplication.getAppContext().getFilesDir(), "usuario.json");

                if (!file.exists()) {
                    Toast.makeText(getApplicationContext(),"No existen Usuarios Registrados",Toast.LENGTH_SHORT).show();
                }else{
                    if(controlador.login(user.getText().toString(),pass.getText().toString())){
                        Intent newform = new Intent(MainActivity.this,VistaVehiculos.class);
                        finish();
                        startActivity(newform);
                    }else{
                        Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_SHORT).show();
                    }
                }
           }
        });

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent newform = new Intent(MainActivity.this,VistaRegistro.class);
                finish();
                startActivity(newform);
            }
        });
    }
    public void onClick(View v) {

    }
}