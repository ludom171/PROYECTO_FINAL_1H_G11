package com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.vista;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.example.ludl.proyecto_final_1h_g11.R;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.controlador.VehiculosControlador;
import com.example.ludl.proyecto_final_1h_g11.ec.edu.uce.modelo.Vehiculo;


public class VistaInsertar extends AppCompatActivity {

    EditText vehiculo;
    EditText placa;
    EditText marca;
    //Date fecha;
    String date;
    CalendarView selecfecha;
    TextView auxFecha;
    Double costo;
    Boolean matricula;
    EditText color;

    Spinner listaMatricula;
    String[] opciones =  {"Si","No"};


    public VehiculosControlador getVehiculoControlador(){

        return new VehiculosControlador();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insertar);

        vehiculo = (EditText)findViewById(R.id.txt_vehiculo);
        placa = (EditText)findViewById(R.id.txt_placa);
        marca=(EditText) findViewById(R.id.txt_marca);
        selecfecha=(CalendarView) findViewById(R.id.calendario);
        auxFecha=(TextView) findViewById(R.id.text_fecha);

        listaMatricula=(Spinner) findViewById(R.id.matricula);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,opciones);
        listaMatricula.setAdapter(adapter);

        //costo=(EditText) findViewById(R.id.txt_costo);
        //matricula=
        color=(EditText) findViewById(R.id.txt_color);

        selecfecha.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int anio, int mes, int dia) {
                date = anio+"/"+mes+"/"+dia;
                auxFecha.setText(date);
            }
        });

        Toast.makeText(this, date,Toast.LENGTH_SHORT).show();

    }

    public void saveVehiculo(View v){
        try{
            EditText auxCar =(EditText)findViewById(R.id.txt_vehiculo);
            EditText auxPlaca =(EditText)findViewById(R.id.txt_placa);
            EditText auxMarca =(EditText)findViewById(R.id.txt_marca);
            //Date auxfecha =(Date) findViewById(R.id.calendario);
            EditText auxCosto=(EditText) findViewById(R.id.txt_costo);
            //EditText auxmatricula=(EditText) findViewById(R.id.txt_costo);
            EditText auxColor=(EditText) findViewById(R.id.txt_color);

            Vehiculo auxVehiculo= new Vehiculo();

            auxVehiculo.setVehiculo(auxCar.getText().toString());
            auxVehiculo.setPlaca(auxPlaca.getText().toString());
            auxVehiculo.setMarca(auxMarca.getText().toString());
            auxVehiculo.setCosto(Double.valueOf(auxCosto.getText().toString()));
            auxVehiculo.setColor(auxColor.getText().toString());

            this.getVehiculoControlador().agregarVehiculo(auxVehiculo);

            this.mensaje("Datos Guardados");

            auxCar.setText("");
            auxPlaca.setText("");
            auxMarca.setText("");
            auxCosto.setText("");
            auxColor.setText("");

            Intent newform = new Intent(VistaInsertar.this,VistaVehiculos.class);
            finish();
            startActivity(newform);

        }catch (Exception ex){
            ex.printStackTrace();
            this.mensaje("Datos No Guardados");
        }
    }

    public void mensaje(String texto){
        Toast.makeText(this, texto,Toast.LENGTH_LONG).show();
    }




    public  void  Aceptar(View view){
        Intent newform = new Intent(VistaInsertar.this,VistaVehiculos.class);
        finish();
        startActivity(newform);
    }

}
