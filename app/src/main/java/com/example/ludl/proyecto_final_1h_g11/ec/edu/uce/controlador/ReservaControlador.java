package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.controlador;

import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Reserva;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.ServicioOperaciones;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Vehiculo;

import java.util.List;

public class ReservaControlador {
    public ServicioOperaciones op = new ServicioOperaciones();

    public void ReservaControlador() {
    }

    public void ReservaControlador(Reserva reserva) {
        op.guardarreserva(reserva);
    }

    public ReservaControlador() {
    }

    public List<Reserva> getList() {
        return op.leerReserva();
    }

    public boolean eliminar(Vehiculo vehiculo) {
        return op.eliminarVehiculo(vehiculo);
    }
}
