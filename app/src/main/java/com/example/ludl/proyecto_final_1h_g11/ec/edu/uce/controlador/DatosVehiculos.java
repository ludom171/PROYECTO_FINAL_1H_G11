package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.controlador;

import java.io.Serializable;

public class DatosVehiculos implements Serializable {

    private String Vehiculo;
    private String Placa;

    public String getPlaca() {
        return Placa;
    }

    public String getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        Vehiculo = vehiculo;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }
    //holA
}
