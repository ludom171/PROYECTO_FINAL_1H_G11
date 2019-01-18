package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.vista.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ludl.proyecto_final_1h_g11.R;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.controlador.ReservaControlador;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.controlador.VehiculosControlador;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Reserva;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Vehiculo;

import java.util.ArrayList;

public class AdapterReserva extends ArrayAdapter<Reserva> {
    public AdapterReserva(Context context, ArrayList<Reserva> reservas) {

        super(context, 0, reservas);
        reservas = new ArrayList<>(getReservaControlador().op.leerReserva());

    }

    public ReservaControlador getReservaControlador() {

        return new ReservaControlador();
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position

        Reserva r = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.vehiculo_item, parent, false);

        }

        // Ver los input para poner los datos




        // Return the completed view to render on screen

        return convertView;

    }
}
