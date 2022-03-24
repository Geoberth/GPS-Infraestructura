package com.example.geosegalmex.Infra_Lecheros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.geosegalmex.General;
import com.example.geosegalmex.Georeferencia.GeoreferenciaActivity;
import com.example.geosegalmex.Infra_Sacrificio.Sacrificio_1;
import com.example.geosegalmex.R;

import java.util.Calendar;

public class lecheros1 extends AppCompatActivity {


    Lecheros_Model model;
    int dia, mes, anio;
    Button btnnext;
    TextView leche_fecha, lech6oo, lech7o;
    Spinner spi_edo, spi_del, spi_ddr, spi_cader, spi_mun, lestatus, lraza, ltipoo;
    EditText loca, ldomi, lnomupp, lnvacas, lnvaqui, lcruza, loraza, lsuper, lobserv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecheros1);

        leche_fecha = findViewById(R.id.leche_txtFecha);
        spi_edo = findViewById(R.id.leche_spiEstado1);
        spi_del = findViewById(R.id.leche_spiEstado01);
        spi_ddr = findViewById(R.id.leche_spiddr);
        spi_cader = findViewById(R.id.leche_spicader);
        spi_mun = findViewById(R.id.leche_spimun);
        loca = findViewById(R.id.leche_loca);

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

        lech6oo = findViewById(R.id.lech6oo);
        lech7o = findViewById(R.id.lech7o);

        btnnext = findViewById(R.id.btn_Avanzar);
        muestrafecha();

        lcruza.setVisibility(View.GONE);
        loraza.setVisibility(View.GONE);
        lech7o.setVisibility(View.GONE);
        lech6oo.setVisibility(View.GONE);

        lraza.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 8){
                    lcruza.setVisibility(View.VISIBLE);
                    loraza.setVisibility(View.GONE);
                    loraza.setText("");
                    lech6oo.setVisibility(View.VISIBLE);
                    lech7o.setVisibility(View.GONE);
                }
                else if(position == 9) {
                    lcruza.setVisibility(View.GONE);
                    lcruza.setText("");
                    loraza.setVisibility(View.VISIBLE);
                    lech7o.setVisibility(View.VISIBLE);
                    lech6oo.setVisibility(View.GONE);
                }
                else{
                    lcruza.setVisibility(View.GONE);
                    lcruza.setText("");
                    loraza.setText("");
                    loraza.setVisibility(View.GONE);
                    lech7o.setVisibility(View.GONE);
                    lech6oo.setVisibility(View.GONE);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(validar()){
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
                else{
                    Toast.makeText(getApplicationContext(), "Faltan respuestas",Toast.LENGTH_SHORT).show();
                }
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

    public boolean validar(){
        boolean retorno = true;

        if (loca.getText().toString().isEmpty()){
            loca.setError("No puede quedar vacio");
            retorno=false;
        }
        if (ldomi.getText().toString().isEmpty()){
            ldomi.setError("No puede quedar vacio");
            retorno=false;
        }
        if (lnomupp.getText().toString().isEmpty()){
            lnomupp.setError("No puede quedar vacío");
            retorno=false;
        }
        if (lnvaqui.getText().toString().isEmpty()){
            lnvaqui.setError("No puede quedar vacío");
            retorno=false;
        }
        if (lnvacas.getText().toString().isEmpty()){
            lnvacas.setError("No puede quedar vacío");
            retorno=false;
        }
        if (lsuper.getText().toString().isEmpty()){
            loraza.setError("No puede quedar vacío");
            retorno=false;
        }
        if (lobserv.getText().toString().isEmpty()){
            loraza.setError("No puede quedar vacío");
            retorno=false;
        }
        else if(lraza.getSelectedItem().toString().equals("Cruza") && lcruza.getText().toString().isEmpty()){
            lcruza.setError("No puede quedar vacio");
            retorno=false;
        }
        else if(lraza.getSelectedItem().toString().equals("Otra") && lcruza.getText().toString().isEmpty()){
            lcruza.setError("No puede quedar vacio");
            retorno=false;
        }
        return retorno;
    }


    @Override
    public void onBackPressed() {

    }

}