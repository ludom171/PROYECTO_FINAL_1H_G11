package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.controlador;

import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Usuario;

import java.util.ArrayList;

public class ListaUsuarios {

    private ArrayList<Usuario> lisUsuario;

    public ListaUsuarios(){

    }


    public ArrayList<Usuario> getLisUsuario() {
        return lisUsuario;
    }

    public void setLisUsuario(ArrayList<Usuario> lisUsuario) {
        this.lisUsuario = lisUsuario;
    }

    public void agregarUsuario(Usuario usuario ){
        this.getLisUsuario().add(usuario);
    }

}
