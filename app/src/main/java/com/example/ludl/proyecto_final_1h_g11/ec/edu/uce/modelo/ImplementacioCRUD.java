package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo;

import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.db.RepoReserva;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.db.RepoUsuario;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.db.RepoVehiculo;

import java.util.Collection;
import java.util.List;

public class ImplementacioCRUD implements InterfazCRUD {

    private RepoUsuario repoUser = new RepoUsuario();
    private RepoVehiculo repoVehiculo = new RepoVehiculo();
    private RepoReserva repoReserva = new RepoReserva();

    @Override
    public String crear(Object obj) {
        //insert generic objec
        if (obj instanceof Usuario)
            repoUser.create((Usuario) obj);
        if (obj instanceof Vehiculo)
            repoVehiculo.create((Vehiculo) obj);
        if (obj instanceof Reserva)
            repoReserva.create((Reserva) obj);

        return null;
    }

    @Override
    public String actualizar(Object id) {
        return null;
    }

    @Override
    public String borrar(Object id) {
        if (id instanceof Usuario)
            repoUser.delete((Usuario) id);
        if (id instanceof Vehiculo)
            repoVehiculo.delete((Vehiculo) id);
        if (id instanceof Reserva)
            repoReserva.delete((Reserva) id);
        return "Eliminado";
    }

    @Override
    public Object buscarPorParametro(Collection[] lista, Object parametro) {
        return null;
    }

    @Override
    public Collection listar() {
        Object o = null;

        return repoVehiculo.listar();

    }

//ADICIONALES
    public boolean login(String nombre, String contraseia){
        return repoUser.login(nombre,contraseia);
    }

/*
    private <T> T castt(Object o) {
        if (o instanceof Usuario) {
            return (T) (Usuario) o;

        } else if (o instanceof Vehiculo) {
            return (T) (Vehiculo) o;
        } else if (o instanceof Reserva) {
            return (T) (Reserva) o;
        } else {
            return null;
        }
    }

    public static <T> T convertInstanceOfObject(Object o, Class<T> clazz) {
        try {
            return clazz.cast(o);
        } catch (ClassCastException e) {
            return null;
        }
    }*/
}
