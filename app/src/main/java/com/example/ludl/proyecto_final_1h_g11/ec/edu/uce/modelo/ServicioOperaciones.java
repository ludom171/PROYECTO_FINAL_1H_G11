package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ServicioOperaciones  {

    public void insertUsuario( Usuario usuario) {
        comprobar("usuario.json");
       //leer("usuario.json");
        Gson gson = new Gson();

        escribirJson("usuario.json",gson.toJson(usuario).toString());


    }

    public void insertVehiculo( Vehiculo vehiculo){
        Gson gson = new Gson();
        // File file =
        // comprobar("usuario.json");

        System.out.println(  gson.toJson(vehiculo).toString());

      //  Toast.makeText(this,gson.toJson(vehiculo).toString() ,Toast.LENGTH_SHORT).show();

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


    private String leer(String filename)  {
        try {
        File file = new File(GlobalApplication.getAppContext().getFilesDir(), filename);

        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();
       return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private void escribirJson(String filename,String content){
        FileOutputStream outputStream;

        try {
            outputStream = GlobalApplication.getAppContext().openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(content.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    private void comprobar( String filename) {
        File file = new File(GlobalApplication.getAppContext().getFilesDir(), filename);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }



