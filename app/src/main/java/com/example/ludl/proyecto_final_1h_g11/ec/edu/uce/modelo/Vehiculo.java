package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Vehiculo implements Serializable {

    private Long id = Calendar.getInstance().getTimeInMillis();
    private String vehiculo = "";
    private String placa = "";
    private String marca = "";
    private Date fecFabricacion = Calendar.getInstance().getTime();
    private Double costo = 0.0d;
    private boolean matriculado = false;
    private String color = "";

    public void Vehiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getFecFabricacion() {
        return fecFabricacion;
    }

    public void setFecFabricacion(Date fecFabricacion) {
        this.fecFabricacion = fecFabricacion;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}