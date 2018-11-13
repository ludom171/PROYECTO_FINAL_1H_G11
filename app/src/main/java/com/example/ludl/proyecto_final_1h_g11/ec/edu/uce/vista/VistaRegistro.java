package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.vista;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ludl.proyecto_final_1h_g11.R;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.controlador.UsuarioControlador;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Usuario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
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
    Context c;

    //Variables Registro Usuario
    public static String vallistadoUsuarios ;
    private UsuarioControlador usuarioControlador;

    public UsuarioControlador getUsuarioControlador(){

        return new UsuarioControlador();
    }

    ///Variables Registro Usuario



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


    //variables Registro Usuarios


    public void save(View v){
try{

            EditText auxUser =(EditText)findViewById(R.id.usuario_registro);
            EditText auxPass =(EditText)findViewById(R.id.password_registro);

            Usuario auxUsuario = new Usuario();
            auxUsuario.setApellidos(auxUser.getText().toString());
            auxUsuario.setNombres(auxPass.getText().toString());


            this.getUsuarioControlador().agregarUsuario(auxUsuario);

            this.mensaje("Datos Guardados");
            auxUser.setText("");
            auxPass.setText("");


        }catch (Exception ex){
            ex.printStackTrace();
            this.mensaje("Datos No Guardados");
        }


    }

    public void mensaje(String texto){
        Toast.makeText(this, texto,Toast.LENGTH_LONG).show();
    }



    //variables Registro Usuarios

    @Override
    public void onClick(View v) {

    }

    //metodo guardar datos en fichero txt
    //
    /*
    public  void  Guardar(View view){

        //llamar a controlador


        try {
            InputStreamReader archivo = new InputStreamReader(openFileInput("registro_usuarios.txt"));
            BufferedRea();
            txtcompleto= der br = new BufferedReader(archivo);
            lineatxt = br.readLine"";

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
    }*/
}
