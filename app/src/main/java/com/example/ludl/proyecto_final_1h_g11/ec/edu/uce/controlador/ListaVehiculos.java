package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.controlador;

import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Usuario;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Vehiculo;

import java.util.ArrayList;

public class ListaVehiculos {

    private ArrayList<Vehiculo> lisVehiculo;

    public ListaVehiculos(){

    }

    public ArrayList<Vehiculo> getLisUsuario() {
        return lisVehiculo;
    }

    public void setLisUsuario(ArrayList<Vehiculo> lisVehiculo) {
        this.lisVehiculo = lisVehiculo;
    }

    public void agregarUsuario(Vehiculo vehiculo){
        this.getLisUsuario().add(vehiculo);
    }

}
