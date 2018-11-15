package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.controlador;

import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.ServicioOperaciones;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Usuario;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class VehiculosControlador {

    public ServicioOperaciones op = new ServicioOperaciones();

    public void VehiculosControlador(){

    }

    public void agregarVehiculo(Vehiculo vehiculo ){

        //llamar a metodo de persistencia gson

        op.insertVehiculo(vehiculo);
    }




    public VehiculosControlador(){

    }

    public List<Vehiculo> getList() {
        return op.leerVehiculos();
    }

    public boolean datos(String user,String pass){
        return op.login(user,pass);

    }



}


