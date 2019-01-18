package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Reserva implements Serializable {

    private String num_reserva = "";
    private String placa = "";
    private String email = "";
    private String celular = "";

    private Date fecReserva = Calendar.getInstance().getTime();
    private Date fecEntrega = Calendar.getInstance().getTime();

    private String valor_reserva = "";

    public String getNum_reserva() {
        return num_reserva;
    }

    public void setNum_reserva(String num_reserva) {
        this.num_reserva = num_reserva;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFecReserva() {
        return fecReserva;
    }

    public void setFecReserva(Date fecReserva) {
        this.fecReserva = fecReserva;
    }

    public Date getFecEntrega() {
        return fecEntrega;
    }

    public void setFecEntrega(Date fecEntrega) {
        this.fecEntrega = fecEntrega;
    }

    public String getValor_reserva() {
        return valor_reserva;
    }

    public void setValor_reserva(String valor_reserva) {
        this.valor_reserva = valor_reserva;
    }

    public void setReserva(String num_reserva, String placa, String email, String celular, Date fecReserva, Date fecEntrega, String valor_reserva) {
        this.num_reserva = num_reserva;
        this.placa = placa;
        this.email = email;
        this.celular = celular;
        this.fecReserva = fecReserva;
        this.fecEntrega = fecEntrega;
        this.valor_reserva = valor_reserva;
    }
}
