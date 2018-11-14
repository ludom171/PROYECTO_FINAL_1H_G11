package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ServicioOperaciones extends Application {

    public void insertUsuario( Usuario usuario){
       Gson gson = new Gson();
     // File file =
       // comprobar("usuario.json");
        System.out.println(  gson.toJson(usuario).toString());

        try {
            String filename = "usuario.json";
            String fileContents = "Hello world!";
            FileOutputStream outputStream;


            outputStream = GlobalApplication.getAppContext().openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(fileContents.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void insertVehiculo( Vehiculo vehiculo){
        Gson gson = new Gson();
        // File file =
        // comprobar("usuario.json");

        System.out.println(  gson.toJson(vehiculo).toString());

        Toast.makeText(this,gson.toJson(vehiculo).toString() ,Toast.LENGTH_SHORT).show();

        try {
            String filename = "vehiculo.json";
            String fileContents = "Hello world!";
            FileOutputStream outputStream;


            outputStream = GlobalApplication.getAppContext().openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(fileContents.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void getTodosUsuarios(){}

    public void updateUsuarios(){}


    private void comprobar( String file) {
        try {
            String filename = "myfile.json";
            String fileContents = "Hello world!";
            FileOutputStream outputStream;


                outputStream = getApplicationContext().openFileOutput(filename, Context.MODE_PRIVATE);
                outputStream.write(fileContents.getBytes());
                outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }



