package com.example.geosegalmex.Infra_Engorda;

import androidx.appcompat.app.AppCompatActivity;

import com.example.geosegalmex.General;
import com.example.geosegalmex.Georeferencia.GeoreferenciaActivity;
import com.example.geosegalmex.LiconsaVentanilla.PASLOperativo;
import com.example.geosegalmex.LiconsaVentanilla.Pasl_o_Model;
import com.example.geosegalmex.R;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Engorda extends AppCompatActivity {

    int dia, mes, anio;
    Button btnNext;
    TextView textFecha, tvCruza, tvOtra;
    Spinner spi_edo, spi_representacion, spi_ddr, spi_cader, spi_mun, spi_estatus, spi_sistema, spi_actividad, spi_raza;
    EditText localidad, domupp, nomupp, capins, caputi, total, periodo, cruza, otra, superficie, observaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engorda);

        btnNext = findViewById(R.id.btn_Avanzar);
        textFecha = (TextView)findViewById(R.id.ce_txtFecha);
        spi_edo = (Spinner)findViewById(R.id.ce_spiEstado);
        spi_representacion = (Spinner)findViewById(R.id.ce_spiRepresentacion);
        spi_ddr = (Spinner)findViewById(R.id.ce_spiDdr);
        spi_cader = (Spinner)findViewById(R.id.ce_spiCader);
        spi_mun = (Spinner)findViewById(R.id.ce_spiMunicipio);
        localidad = (EditText)findViewById(R.id.ce_spiLocalidad);
        domupp = (EditText)findViewById(R.id.ce_txtupp);
        nomupp = (EditText)findViewById(R.id.ce_txtuppnom);
        spi_estatus = (Spinner)findViewById(R.id.ce_spiestatus);
        spi_sistema = (Spinner)findViewById(R.id.ce_spisistema);
        spi_actividad = (Spinner)findViewById(R.id.ce_spiactividad);
        capins = (EditText)findViewById(R.id.ce_txtinstalada);
        caputi = (EditText)findViewById(R.id.ce_txtutilizada);
        total = (EditText)findViewById(R.id.ce_txtanimales);
        periodo = (EditText)findViewById(R.id.ce_txtperiodo);
        spi_raza = (Spinner)findViewById(R.id.ce_spiraza);
        tvCruza = (TextView)findViewById(R.id.ce_tvCruza);
        cruza = (EditText)findViewById(R.id.ce_txtcruza);
        tvOtra = (TextView)findViewById(R.id.ce_tvOtra);
        otra = (EditText)findViewById(R.id.ce_txtOtra);
        superficie = (EditText)findViewById(R.id.ce_txtSuperficie);
        observaciones = (EditText)findViewById(R.id.ce_spiObservaciones);

        muestrafecha();

        //Validacion Spineer Raza
        tvCruza.setVisibility(View.GONE);
        cruza.setVisibility(View.GONE);
        tvOtra.setVisibility(View.GONE);
        otra.setVisibility(View.GONE);
        spi_raza.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 21){
                    tvCruza.setVisibility(View.VISIBLE);
                    cruza.setVisibility(View.VISIBLE);
                    tvOtra.setVisibility(View.GONE);
                    otra.setVisibility(View.GONE);
                }
                else if(position == 22){
                    tvCruza.setVisibility(View.GONE);
                    cruza.setVisibility(View.GONE);
                    tvOtra.setVisibility(View.VISIBLE);
                    otra.setVisibility(View.VISIBLE);
                }
                else{
                    tvCruza.setVisibility(View.GONE);
                    cruza.setVisibility(View.GONE);
                    tvOtra.setVisibility(View.GONE);
                    otra.setVisibility(View.GONE);
                }
            }
            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });

        //Guardar datos
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(validar()){

                }
                else{
                    Toast.makeText(getApplicationContext(), "Faltan respuestas",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    //Metodo para extraer la fecha actual
    public void muestrafecha(){
        Calendar fecha = Calendar.getInstance();
        dia = fecha.get(Calendar.DAY_OF_MONTH);
        mes = fecha.get(Calendar.MONTH);
        anio = fecha.get(Calendar.YEAR);
        textFecha.setText(""+dia+"/"+(mes+1)+"/"+anio);
    }

    //Validar que no queden respuestas vacias
    public boolean validar(){
        boolean retorno=true;

        if(localidad.getText().toString().isEmpty()){
            localidad.setError("No puede quedar vacio");
            retorno=false;
        }
        else if(domupp.getText().toString().isEmpty()){
            domupp.setError("No puede quedar vacio");
            retorno=false;
        }
        else if(nomupp.getText().toString().isEmpty()){
            nomupp.setError("No puede quedar vacio");
            retorno=false;
        }
        else if(capins.getText().toString().isEmpty()){
            capins.setError("No puede quedar vacio");
            retorno=false;
        }
        else if(caputi.getText().toString().isEmpty()){
            caputi.setError("No puede quedar vacio");
            retorno=false;
        }
        else if(total.getText().toString().isEmpty()){
            total.setError("No puede quedar vacio");
            retorno=false;
        }
        else if(periodo.getText().toString().isEmpty()){
            periodo.setError("No puede quedar vacio");
            retorno=false;
        }
        else if(spi_raza.getSelectedItem().toString().equals("Cruza") && cruza.getText().toString().isEmpty()){
            cruza.setError("No puede quedar vacio");
            retorno=false;
        }
        else if(spi_raza.getSelectedItem().toString().equals("Otra") && otra.getText().toString().isEmpty()){
            otra.setError("No puede quedar vacio");
            retorno=false;
        }
        else if(superficie.getText().toString().isEmpty()){
            superficie.setError("No puede quedar vacio");
            retorno=false;
        }

        return retorno;
    }

    @Override
    public void onBackPressed() {

    }

}