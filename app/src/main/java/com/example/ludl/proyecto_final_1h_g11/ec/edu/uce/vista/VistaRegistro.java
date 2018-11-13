package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.vista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ludl.proyecto_final_1h_g11.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class VistaRegistro extends AppCompatActivity implements View.OnClickListener {
    EditText usuario;
    EditText contraseña;
    String lineatxt;
    String txtcompleto;
    Button aceptar;
    Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        //inicializacion de variables
        usuario = (EditText)findViewById(R.id.usuario_registro);
        contraseña = (EditText)findViewById(R.id.password_registro);
        aceptar=(Button)findViewById(R.id.aceptar);
        regresar=(Button)findViewById(R.id.regresar_registro);

    }

    @Override
    public void onClick(View v) {

    }

    //metodo guardar datos en fichero txt
    public  void  Guardar(View view){

        try {
            InputStreamReader archivo = new InputStreamReader(openFileInput("registro_usuarios.txt"));
            BufferedReader br = new BufferedReader(archivo);
            lineatxt = br.readLine();
            txtcompleto= "";

            while (lineatxt !=null){
                txtcompleto=txtcompleto + lineatxt ;
                lineatxt=br.readLine();
            }
            br.close();
            archivo.close();
            //contraseña.setText(txtcompleto);

        }catch (IOException e){

        }
        //guardar datos txt
        try {
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput("registro_usuarios.txt", Activity.MODE_PRIVATE));

            archivo.write(txtcompleto + usuario.getText().toString() + ";" + contraseña.getText().toString() + ";");
            archivo.flush();
            archivo.close();
        }catch (IOException e){

        }
        Toast.makeText(this, "Guardado",Toast.LENGTH_SHORT).show();
        Intent newform = new Intent(VistaRegistro.this,MainActivity.class);
        finish();
        startActivity(newform);
    }
}
