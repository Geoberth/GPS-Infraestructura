package com.example.geosegalmex.Infra_Ave;

import androidx.appcompat.app.AppCompatActivity;

import com.example.geosegalmex.General;
import com.example.geosegalmex.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Ave extends AppCompatActivity {

    int dia, mes, anio;
    Button btnNext;
    TextView textFecha;
    Spinner spi_edo, spi_representacion, spi_ddr, spi_cader, spi_mun, spi_estatus, spi_sistema, spi_especie;
    EditText localidad, domupp, nomupp, capins, caputi, total, naves, superficie, observaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ave);

        btnNext = findViewById(R.id.btn_Avanzar);
        textFecha = (TextView)findViewById(R.id.av_txtFecha);
        spi_edo = (Spinner)findViewById(R.id.av_spiEstado);
        spi_representacion = (Spinner)findViewById(R.id.av_spiRepresentacion);
        spi_ddr = (Spinner)findViewById(R.id.av_spiDdr);
        spi_cader = (Spinner)findViewById(R.id.av_spiCader);
        spi_mun = (Spinner)findViewById(R.id.av_spiMunicipio);
        localidad = (EditText)findViewById(R.id.av_spiLocalidad);
        domupp = (EditText)findViewById(R.id.av_txtupp);
        nomupp = (EditText)findViewById(R.id.av_txtuppnom);
        spi_estatus = (Spinner)findViewById(R.id.av_spiestatus);
        spi_sistema = (Spinner)findViewById(R.id.av_spisistema);
        spi_especie = (Spinner)findViewById(R.id.av_spiactividad);
        capins = (EditText)findViewById(R.id.av_txtinstalada);
        caputi = (EditText)findViewById(R.id.av_txtutilizada);
        total = (EditText)findViewById(R.id.av_txtanimales);
        naves= (EditText)findViewById(R.id.av_txtnaves);
        superficie = (EditText)findViewById(R.id.av_txtSuperficie);
        observaciones = (EditText)findViewById(R.id.av_spiObservaciones);

        muestrafecha();

        //Guardar datos
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(validar()){

                    String folio = General.Foliocuestion;
                    String cveEntidad = "1";
                    String entidad = spi_edo.getSelectedItem().toString();
                    String cveRepresentacion = "1";
                    String representacion = spi_representacion.getSelectedItem().toString();
                    String cveDdr = "1";
                    String ddr = spi_ddr.getSelectedItem().toString();
                    String cveCader = "1";
                    String cader = spi_cader.getSelectedItem().toString();
                    String cveMunicipio = "1";
                    String municipio = spi_mun.getSelectedItem().toString();
                    String cveLocalidad = "1";
                    String loc = localidad.getText().toString();
                    String domUpp = domupp.getText().toString();
                    String nomUpp = nomupp.getText().toString();
                    String estatus = spi_estatus.getSelectedItem().toString();
                    String sistema = spi_sistema.getSelectedItem().toString();
                    String especie = spi_especie.getSelectedItem().toString();
                    String capInst = capins.getText().toString();
                    String capUtil = caputi.getText().toString();
                    String totalAnim = total.getText().toString();
                    String numNaves = naves.getText().toString();
                    String superf = superficie.getText().toString();
                    String observ = observaciones.getText().toString();
                    String longitud = "";
                    String latitud = "";
                    String f1 = General.Foto1;
                    String f2 = General.Foto2;

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
        else if(naves.getText().toString().isEmpty()){
            naves.setError("No puede quedar vacio");
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