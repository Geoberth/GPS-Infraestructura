package com.example.geosegalmex.Infra_Lecheros;

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
import com.example.geosegalmex.Infra_Sacrificio.Sacrificio_1;
import com.example.geosegalmex.R;

import java.util.Calendar;

public class lecheros1 extends AppCompatActivity {


    Lecheros_Model model;
    int dia, mes, anio;
    Button btnnext;
    TextView leche_fecha;
    Spinner spi_edo, spi_del, spi_ddr, spi_cader, spi_mun, lestatus, lraza, ltipoo;
    EditText loca, ldomi, lnomupp, lnvacas, lnvaqui, lcruza, loraza, lsuper, lobserv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecheros1);

        leche_fecha = findViewById(R.id.sacri_fecha);
        spi_edo = findViewById(R.id.sacri_Estado1);
        spi_del = findViewById(R.id.sacri_del);
        spi_ddr = findViewById(R.id.sacri_ddr);
        spi_cader = findViewById(R.id.sacri_cader);
        spi_mun = findViewById(R.id.sacri_mun);
        loca = findViewById(R.id.sacri_loca);

        ldomi = findViewById(R.id.lech1);
        lnomupp = findViewById(R.id.lech2);
        lestatus = (Spinner) findViewById(R.id.spi_lech3);
        lnvacas = findViewById(R.id.lech4);
        lnvaqui = findViewById(R.id.lech5);
        lraza = (Spinner) findViewById(R.id.spi_lech6);
        lcruza = findViewById(R.id.lech6o);
        loraza = findViewById(R.id.lech7);
        ltipoo = (Spinner) findViewById(R.id.spi_lech8);
        lsuper = findViewById(R.id.lech9);
        lobserv = findViewById(R.id.lech10);

        btnnext = findViewById(R.id.btn_Avanzar);
        muestrafecha();

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String folio = General.Foliocuestion;
                String fecha = leche_fecha.getText().toString();

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

                String domiupp = ldomi.getText().toString();
                String nombreupp =lnomupp.getText().toString();
                String estatus = lestatus.getSelectedItem().toString();
                String numerovacas = lnvacas.getText().toString();
                String numerovaqui = lnvaqui.getText().toString();
                String raza = lraza.getSelectedItem().toString();
                String cruza = lcruza.getText().toString();
                String otraraza = loraza.getText().toString();
                String tipoordena = ltipoo.getSelectedItem().toString();
                String superficie = lsuper.getText().toString();
                String observaciones = lobserv.getText().toString();

                String longitud = "";
                String latitud = "";
                String foto1 = General.Foto1;
                String foto2 = General.Foto2;

                model = new Lecheros_Model(folio, fecha, cveEntidad, entidad, cvedelegacion, delegacion, cveDdr, ddr, cveCader, cader, cveMunicipio, municipio, cveLocalidad, localidad, domiupp, nombreupp, estatus, numerovacas, numerovaqui, raza, cruza, otraraza, tipoordena, superficie, observaciones, longitud, latitud, foto1, foto2);
                Intent in = new Intent(lecheros1.this, GeoreferenciaActivity.class);
                in.putExtra("model", model);
                startActivity(in);
            }
        });
    }





    public void muestrafecha(){
        Calendar fecha = Calendar.getInstance();
        dia = fecha.get(Calendar.DAY_OF_MONTH);
        mes = fecha.get(Calendar.MONTH);
        anio = fecha.get(Calendar.YEAR);
        leche_fecha.setText(""+dia+"/"+(mes+1)+"/"+anio);
    }

}