package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.vista;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ludl.proyecto_final_1h_g11.R;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.controlador.UsuarioControlador;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.controlador.VehiculosControlador;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Usuario;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Vehiculo;

import java.util.Date;


public class VistaInsertar extends AppCompatActivity {

    EditText vehiculo;
    EditText placa;
    EditText marca;
    Date fecha;
    Double costo;
    Boolean matricula;
    EditText color;


    public VehiculosControlador getVehiculoControlador(){

        return new VehiculosControlador();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insertar);

        vehiculo = (EditText)findViewById(R.id.txt_vehiculo);
        placa = (EditText)findViewById(R.id.txt_placa);
        marca=(EditText) findViewById(R.id.txt_marca);
        //fecha=(Date) findViewById(R.id.calendario);
        //costo=(EditText) findViewById(R.id.txt_costo).gette;
        //matricula=
        color=(EditText) findViewById(R.id.txt_color);


    }

    public void saveVehiculo(View v){
        try{
            EditText auxCar =(EditText)findViewById(R.id.txt_vehiculo);
            EditText auxPlaca =(EditText)findViewById(R.id.txt_placa);
            EditText auxMarca =(EditText)findViewById(R.id.txt_vehiculo);
            //Date auxfecha =(Date) findViewById(R.id.calendario);
            //EdditText costo=(EditText) findViewById(R.id.txt_costo);
            //EditTex auxmatricula=(EditText) findViewById(R.id.txt_costo);
            EditText auxColor=(EditText) findViewById(R.id.txt_color);

            Vehiculo auxVehiculo= new Vehiculo();

            auxVehiculo.setVehiculo(auxCar.getText().toString());
            auxVehiculo.setPlaca(auxPlaca.getText().toString());
            auxVehiculo.setPlaca(auxMarca.getText().toString());
            auxVehiculo.setPlaca(auxColor.getText().toString());


            this.getVehiculoControlador().agregarVehiculo(auxVehiculo);

            this.mensaje("Datos Guardados");
            auxCar.setText("");
            auxPlaca.setText("");
            auxMarca.setText("");
            auxPlaca.setText("");


        }catch (Exception ex){
            ex.printStackTrace();
            this.mensaje("Datos No Guardados");
        }
    }

    public void mensaje(String texto){
        Toast.makeText(this, texto,Toast.LENGTH_LONG).show();
    }




    public  void  Aceptar(View view){
        Intent newform = new Intent(VistaInsertar.this,VistaVehiculos.class);
        finish();
        startActivity(newform);
    }

}
