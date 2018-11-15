package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.vista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ludl.proyecto_final_1h_g11.R;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.controlador.VehiculosControlador;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.GlobalApplication;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Vehiculo;

import java.io.File;
import java.util.List;

public class VistaVehiculos extends AppCompatActivity {

    ListView listaVehiculos;
    String[] datosVehiculos;

    VehiculosControlador  controlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vehiculos);

        listaVehiculos=(ListView)findViewById(R.id.listaVehiculos);

        try{
            Vehiculo auxVehiculo= new Vehiculo();
            this.getVehiculoControlador();

        }catch (Exception ex){
            ex.printStackTrace();
        }

        Toast.makeText(this, "hola",Toast.LENGTH_LONG).show();

        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,datosVehiculos);
        listaVehiculos.setAdapter(adapter);

    }


    public VehiculosControlador getVehiculoControlador(){

        return new VehiculosControlador();
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
