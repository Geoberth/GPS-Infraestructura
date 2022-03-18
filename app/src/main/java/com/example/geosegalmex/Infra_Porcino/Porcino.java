package com.example.geosegalmex.Infra_Porcino;

import androidx.appcompat.app.AppCompatActivity;

import com.example.geosegalmex.General;
import com.example.geosegalmex.Georeferencia.GeoreferenciaActivity;
import com.example.geosegalmex.Infra_Engorda.Engorda;
import com.example.geosegalmex.Infra_Engorda.Engorda_Model;
import com.example.geosegalmex.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Porcino extends AppCompatActivity {

    Porcino_Model model;
    int dia, mes, anio;
    Button btnNext;
    TextView textFecha, tvCruza, tvOtra;
    Spinner spi_edo, spi_representacion, spi_ddr, spi_cader, spi_mun, spi_estatus, spi_sistema, spi_actividad, spi_raza;
    EditText localidad, domupp, nomupp, vientres, lechones, crecimiento, finalizacion, sementales, capins, caputi, total, cruza, otra, superficie, observaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porcino);

        btnNext = findViewById(R.id.btn_Avanzar);
        textFecha = (TextView)findViewById(R.id.po_txtFecha);
        spi_edo = (Spinner)findViewById(R.id.po_spiEstado);
        spi_representacion = (Spinner)findViewById(R.id.po_spiRepresentacion);
        spi_ddr = (Spinner)findViewById(R.id.po_spiDdr);
        spi_cader = (Spinner)findViewById(R.id.po_spiCader);
        spi_mun = (Spinner)findViewById(R.id.po_spiMunicipio);
        localidad = (EditText)findViewById(R.id.po_spiLocalidad);
        domupp = (EditText)findViewById(R.id.po_txtupp);
        nomupp = (EditText)findViewById(R.id.po_txtuppnom);
        spi_estatus = (Spinner)findViewById(R.id.po_spiestatus);
        spi_sistema = (Spinner)findViewById(R.id.po_spisistema);
        spi_actividad = (Spinner)findViewById(R.id.po_spiactividad);
        vientres = (EditText)findViewById(R.id.po_txtvientres);
        lechones = (EditText)findViewById(R.id.po_txtlechones);
        crecimiento = (EditText)findViewById(R.id.po_txtcrecimiento);
        finalizacion = (EditText)findViewById(R.id.po_txtfinalización);
        sementales = (EditText)findViewById(R.id.po_txtSementales);
        capins = (EditText)findViewById(R.id.po_txtinstalada);
        caputi = (EditText)findViewById(R.id.po_txtutilizada);
        total = (EditText)findViewById(R.id.po_txtanimales);
        spi_raza = (Spinner)findViewById(R.id.po_spiraza);
        tvCruza = (TextView)findViewById(R.id.po_tvCruza);
        cruza = (EditText)findViewById(R.id.po_txtcruza);
        tvOtra = (TextView)findViewById(R.id.po_tvOtra);
        otra = (EditText)findViewById(R.id.po_txtOtra);
        superficie = (EditText)findViewById(R.id.po_txtSuperficie);
        observaciones = (EditText)findViewById(R.id.po_spiObservaciones);

        muestrafecha();

        //Validacion Spineer Raza
        tvCruza.setVisibility(View.GONE);
        cruza.setVisibility(View.GONE);
        tvOtra.setVisibility(View.GONE);
        otra.setVisibility(View.GONE);
        spi_raza.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 7){
                    tvCruza.setVisibility(View.VISIBLE);
                    cruza.setVisibility(View.VISIBLE);
                    tvOtra.setVisibility(View.GONE);
                    otra.setVisibility(View.GONE);
                }
                else if(position == 8){
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
                    String actividad = spi_actividad.getSelectedItem().toString();
                    String numVientres = vientres.getText().toString();
                    String numLechones = lechones.getText().toString();
                    String numCrecimiento = crecimiento.getText().toString();
                    String numFinalizacion = finalizacion.getText().toString();
                    String numSementales = sementales.getText().toString();
                    String capInst = capins.getText().toString();
                    String capUtil = caputi.getText().toString();
                    String totalAnim = total.getText().toString();
                    String raza = spi_raza.getSelectedItem().toString();
                    String razaCruza = (spi_raza.getSelectedItem().toString().equals("Cruza"))? cruza.getText().toString() : "";
                    String razaOtra = (spi_raza.getSelectedItem().toString().equals("Otra"))? otra.getText().toString() : "";
                    String superf = superficie.getText().toString();
                    String observ = observaciones.getText().toString();
                    String longitud = "";
                    String latitud = "";
                    String f1 = General.Foto1;
                    String f2 = General.Foto2;

                    model = new Porcino_Model(folio,cveEntidad,entidad,cveRepresentacion,representacion,cveDdr,ddr,cveCader,cader,cveMunicipio,municipio,cveLocalidad,loc,domUpp,nomUpp,estatus,sistema,actividad,numVientres,numLechones,numCrecimiento,numFinalizacion,numSementales,capInst,capUtil,totalAnim,raza,razaCruza,razaOtra,superf,observ,longitud,latitud,f1,f2);
                    Intent in = new Intent(Porcino.this, GeoreferenciaActivity.class);
                    in.putExtra("model", model);
                    startActivity(in);

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
        else if(vientres.getText().toString().isEmpty()){
            vientres.setError("No puede quedar vacio");
            retorno=false;
        }
        else if(lechones.getText().toString().isEmpty()){
            lechones.setError("No puede quedar vacio");
            retorno=false;
        }
        else if(crecimiento.getText().toString().isEmpty()){
            crecimiento.setError("No puede quedar vacio");
            retorno=false;
        }
        else if(finalizacion.getText().toString().isEmpty()){
            finalizacion.setError("No puede quedar vacio");
            retorno=false;
        }
        else if(sementales.getText().toString().isEmpty()){
            sementales.setError("No puede quedar vacio");
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