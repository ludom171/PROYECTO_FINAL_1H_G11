package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.vista.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ludl.proyecto_final_1h_g11.R;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.controlador.VehiculosControlador;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Vehiculo;

import java.util.ArrayList;

public class AdapterVehiculo extends ArrayAdapter<Vehiculo> {

    public AdapterVehiculo(Context context, ArrayList<Vehiculo> vehiculos) {

        super(context, 0, vehiculos);
        vehiculos = new ArrayList<>(getVehiculoControlador().op.leerVehiculos());

    }

    public VehiculosControlador getVehiculoControlador() {

        return new VehiculosControlador();
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position

        Vehiculo v = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.vehiculo_item, parent, false);

        }

        // Ver los input para poner los datos

        TextView vehiculo = (TextView) convertView.findViewById(R.id.vehiculo);
        TextView placa = (TextView) convertView.findViewById(R.id.placa);
        TextView marca = (TextView) convertView.findViewById(R.id.marca);
        TextView fecha = (TextView) convertView.findViewById(R.id.feFabrica);
        TextView costo = (TextView) convertView.findViewById(R.id.costo);
        TextView matriculado = (TextView) convertView.findViewById(R.id.estadomatriculado);
        TextView color = (TextView) convertView.findViewById(R.id.color);



        // llenar con la info cada item
        vehiculo.setText(v.getVehiculo());
        placa.setText(v.getPlaca());
        marca.setText(v.getMarca());
        fecha.setText(v.getFecFabricacion().toString());
        Boolean estadomatricula=v.isMatriculado();
        if(estadomatricula){
            matriculado.setText("Si");
        }else {
            matriculado.setText("No");
        }


        costo.setText(v.getCosto().toString());

        color.setText(v.getColor());



        // Return the completed view to render on screen

        return convertView;

    }

}