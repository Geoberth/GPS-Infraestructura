package com.example.geosegalmex.Infra_Sacrificio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.geosegalmex.General;
import com.example.geosegalmex.Georeferencia.GeoreferenciaActivity;
import com.example.geosegalmex.Infra_Engorda.Engorda;
import com.example.geosegalmex.R;

import java.util.Calendar;

public class Sacrificio_1 extends AppCompatActivity {

    Sacrificio_model model;
    Button btnnext;
    Spinner spi_edo, spi_del, spi_ddr, spi_cader, spi_mun, spi_sacri1, spi_sacri4;
    EditText fec, loca, sacri3, sacri5, sacri6, sacri7, sacri8, sacri9, sacri10, sacri11, sacri12, sacri13, sacri14, sacri15, sacri16, sacri17, sacriobs;
    int dia, mes, anio;
    TextView sacri_fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sacrificio1);

        sacri_fecha = findViewById(R.id.sacri_fecha);
        spi_edo = findViewById(R.id.sacri_Estado1);
        spi_del = findViewById(R.id.sacri_del);
        spi_ddr = findViewById(R.id.sacri_ddr);
        spi_cader = findViewById(R.id.sacri_cader);
        spi_mun = findViewById(R.id.sacri_mun);
        loca = findViewById(R.id.sacri_loca);

        spi_sacri1 = (Spinner) findViewById(R.id.spinner_sacri1);
        sacri3 = findViewById(R.id.sacri3);
        spi_sacri4 = (Spinner) findViewById(R.id.spinner_sacri4);
        sacri5 = findViewById(R.id.sacri5);
        sacri6 = findViewById(R.id.sacri6);
        sacri7 = findViewById(R.id.sacri7);
        sacri8 = findViewById(R.id.sacri8);
        sacri9 = findViewById(R.id.sacri9);
        sacri10 = findViewById(R.id.sacri10);
        sacri11 = findViewById(R.id.sacri11);
        sacri12 = findViewById(R.id.sacri12);
        sacri13 = findViewById(R.id.sacri13);
        sacri14 = findViewById(R.id.sacri14);
        sacri15 = findViewById(R.id.sacri15);
        sacri16 = findViewById(R.id.sacri16);
        sacri17 = findViewById(R.id.sacri17);
        sacriobs = findViewById(R.id.sacriobs);

        btnnext = findViewById(R.id.btn_Avanzar);
        muestrafecha();

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validacion();
                String folio = General.Foliocuestion;
                String fecha = sacri_fecha.getText().toString();

                String cveEntidad = "1";
                String entidad = spi_edo.getSelectedItem().toString();
                String cvedelegacion = "1";
                String delegacion = spi_del.getSelectedItem().toString();
                String cveDdr = "1";
                String ddr = spi_ddr.getSelectedItem().toString();
                String cveCader = "1";
                String cader = spi_cader.getSelectedItem().toString();
                String cveMunicipio = "1";
                String municipio = spi_mun.getSelectedItem().toString();
                String cveLocalidad = "1";
                String localidad = loca.getText().toString();

                String tiporastro = spi_sacri1.getSelectedItem().toString();
                String rastro = sacri3.getText().toString();
                String estatus_rastro = spi_sacri4.getSelectedItem().toString();
                String turno = sacri5.getText().toString();
                String CIMequino = sacri6.getText().toString();
                String CIMbovino = sacri7.getText().toString();
                String CIMporcino = sacri8.getText().toString();
                String CIMovino = sacri9.getText().toString();
                String CIMcaprino = sacri10.getText().toString();
                String CIMave = sacri11.getText().toString();
                String CUMequino = sacri12.getText().toString();
                String CUMbovino = sacri13.getText().toString();
                String CUMporcino = sacri14.getText().toString();
                String CUMovino = sacri15.getText().toString();
                String CUMcaprino = sacri16.getText().toString();
                String CUMave = sacri17.getText().toString();
                String observaciones = sacriobs.getText().toString();

                String longitud = "";
                String latitud = "";

                String foto1 = General.Foto1;
                String foto2 = General.Foto2;


                model = new Sacrificio_model(folio, fecha, cveEntidad, entidad, cvedelegacion, delegacion, cveDdr, ddr, cveCader, cader, cveMunicipio, municipio, cveLocalidad, localidad, tiporastro, rastro, estatus_rastro, turno, CIMequino, CIMbovino, CIMporcino, CIMovino, CIMcaprino, CIMave, CUMequino, CUMbovino, CUMporcino, CUMovino, CUMcaprino, CUMave, observaciones, longitud, latitud, foto1, foto2);
                Intent in = new Intent(Sacrificio_1.this, GeoreferenciaActivity.class);
                in.putExtra("model", model);
                startActivity(in);


            }
        });




        //TERMINA ONCREATE

    }


    public void muestrafecha(){
        Calendar fecha = Calendar.getInstance();
        dia = fecha.get(Calendar.DAY_OF_MONTH);
        mes = fecha.get(Calendar.MONTH);
        anio = fecha.get(Calendar.YEAR);
        sacri_fecha.setText(""+dia+"/"+(mes+1)+"/"+anio);
    }

    public void validacion(){
        boolean retorno = true;


    }




}