package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.controlador;

import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.ServicioOperaciones;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Usuario;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Vehiculo;

import java.util.ArrayList;

public class VehiculosControlador {

    public ServicioOperaciones op = new ServicioOperaciones();

    public void VehiculosControlador(){

    }

    public void agregarVehiculo(Vehiculo vehiculo ){

        //llamar a metodo de persistencia gson

        op.insertVehiculo(vehiculo);
    }
    private ArrayList<Vehiculo> lisVehiculo;

    public VehiculosControlador(){

    }

    public ArrayList<Vehiculo> getList() {
        return lisVehiculo;
    }

    public void setLisUsuario(ArrayList<Usuario> lisUsuario) {
        this.lisVehiculo = lisVehiculo;
    }

    public boolean datos(String user,String pass){
        return op.login(user,pass);

    }



}


