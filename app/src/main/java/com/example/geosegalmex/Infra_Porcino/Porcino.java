package com.example.geosegalmex.Infra_Porcino;

import androidx.appcompat.app.AppCompatActivity;

import com.example.geosegalmex.Catalogos.db.DbCatalogos;
import com.example.geosegalmex.Catalogos.entidades.Cader;
import com.example.geosegalmex.Catalogos.entidades.Ddr;
import com.example.geosegalmex.Catalogos.entidades.Delegacion;
import com.example.geosegalmex.Catalogos.entidades.Estados;
import com.example.geosegalmex.Catalogos.entidades.Municipio;
import com.example.geosegalmex.General;
import com.example.geosegalmex.Georeferencia.GeoreferenciaActivity;
import com.example.geosegalmex.Infra_Engorda.Engorda;
import com.example.geosegalmex.Infra_Engorda.Engorda_Model;
import com.example.geosegalmex.R;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Porcino extends AppCompatActivity {

    Porcino_Model model;
    int dia, mes, anio;
    Button btnNext;
    TextView textFecha, tvCruza, tvOtra;
    Spinner spi_edo, spi_representacion, spi_ddr, spi_cader, spi_mun, spi_estatus, spi_sistema, spi_actividad, spi_raza;
    EditText localidad, domupp, nomupp, vientres, lechones, crecimiento, finalizacion, sementales, capins, caputi, total, cruza, otra, superficie, observaciones;

    //Variables para los catalogos
    String tablaDb,cveEdo, nombreEdo,cveDelegacion,nombreDelegacion,cveDdr,nombreDdr,cveCader,nombreCader,cveMunicipio,nombreMunicipio;

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

        //Llamada a la funcion de los spinners con los catalogos
        spinnersCatalogosEvent();

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
                    String fecha = textFecha.getText().toString();
                    String cveEntidad = cveEdo;
                    String entidad = nombreEdo;
                    String cveRepresentacion = cveDelegacion;
                    String representacion = nombreDelegacion;
                    String cveDdr2 = cveDdr;
                    String ddr = nombreDdr;
                    String cveCader2 = cveCader;
                    String cader = nombreCader;
                    String cveMunicipio2 = cveMunicipio;
                    String municipio = nombreMunicipio;
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

                    model = new Porcino_Model(folio,fecha,cveEntidad,entidad,cveRepresentacion,representacion,cveDdr2,ddr,cveCader2,cader,cveMunicipio2,municipio,cveLocalidad,loc,domUpp,nomUpp,estatus,sistema,actividad,numVientres,numLechones,numCrecimiento,numFinalizacion,numSementales,capInst,capUtil,totalAnim,raza,razaCruza,razaOtra,superf,observ,longitud,latitud,f1,f2,"0","0");
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

    //Funciones para los spinners con los catalogos
    private List<Estados> llenarEstados(){
        List<Estados> listaCat = new ArrayList<>();
        DbCatalogos dbCategorias = new DbCatalogos(Porcino.this);
        Cursor cursor = dbCategorias.mostrarEstados();
        if(cursor != null){
            if(cursor.moveToFirst()){
                do{
                    Estados cat = new Estados();
                    cat.setIdestado(cursor.getString(cursor.getColumnIndexOrThrow("Idestado")));
                    cat.setNomestado(cursor.getString(cursor.getColumnIndexOrThrow("Nomestado")));
                    listaCat.add(cat);
                } while (cursor.moveToNext());
            }
        }
        dbCategorias.close();

        return listaCat;
    }

    private List<Delegacion> llenarDelegacion(String estado){
        List<Delegacion> listaCat = new ArrayList<>();
        DbCatalogos dbCategorias = new DbCatalogos(Porcino.this);
        Cursor cursor = dbCategorias.mostrarDelegacion(estado);
        if(cursor != null){
            if(cursor.moveToFirst()){
                do{
                    Delegacion cat = new Delegacion();
                    cat.setIddelegacion(cursor.getString(cursor.getColumnIndexOrThrow("Iddelegacion")));
                    cat.setNomdelegacion(cursor.getString(cursor.getColumnIndexOrThrow("Nomdelegacion")));
                    listaCat.add(cat);
                } while (cursor.moveToNext());
            }
        }
        dbCategorias.close();

        return listaCat;
    }

    private List<Ddr> llenarDdr(String table, String estado){
        List<Ddr> listaCat = new ArrayList<>();
        DbCatalogos dbCategorias = new DbCatalogos(Porcino.this);
        Cursor cursor = dbCategorias.mostrarDdr(table, estado);
        if(cursor != null){
            if(cursor.moveToFirst()){
                do{
                    Ddr cat = new Ddr();
                    cat.setIdddr(cursor.getString(cursor.getColumnIndexOrThrow("Idddr")));
                    cat.setNomddr(cursor.getString(cursor.getColumnIndexOrThrow("Nomddr")));
                    listaCat.add(cat);
                } while (cursor.moveToNext());
            }
        }
        dbCategorias.close();

        return listaCat;
    }

    private List<Cader> llenarCader(String table, String estado, String ddr){
        List<Cader> listaCat = new ArrayList<>();
        DbCatalogos dbCategorias = new DbCatalogos(Porcino.this);
        Cursor cursor = dbCategorias.mostrarCader(table, estado, ddr);
        if(cursor != null){
            if(cursor.moveToFirst()){
                do{
                    Cader cat = new Cader();
                    cat.setIdcader(cursor.getString(cursor.getColumnIndexOrThrow("Idcader")));
                    cat.setNomcader(cursor.getString(cursor.getColumnIndexOrThrow("Nomcader")));
                    listaCat.add(cat);
                } while (cursor.moveToNext());
            }
        }
        dbCategorias.close();

        return listaCat;
    }

    private List<Municipio> llenarMunicipio(String table, String estado, String ddr, String cader){
        List<Municipio> listaCat = new ArrayList<>();
        DbCatalogos dbCategorias = new DbCatalogos(Porcino.this);
        Cursor cursor = dbCategorias.mostrarMunicipio(table, estado, ddr, cader);
        if(cursor != null){
            if(cursor.moveToFirst()){
                do{
                    Municipio cat = new Municipio();
                    cat.setIdmunicipio(cursor.getString(cursor.getColumnIndexOrThrow("Idmunicipio")));
                    cat.setNommunicipio(cursor.getString(cursor.getColumnIndexOrThrow("Nommunicipio")));
                    listaCat.add(cat);
                } while (cursor.moveToNext());
            }
        }
        dbCategorias.close();

        return listaCat;
    }

    public void spinnersCatalogosEvent(){
        //Spinner Estados
        List<Estados> listaEstados = llenarEstados();
        ArrayAdapter<Estados> arrayAdapterEstados = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaEstados);
        spi_edo.setAdapter(arrayAdapterEstados);

        //Click spinner Estados
        spi_edo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //((TextView) adapterView.getChildAt(0)).setTextColor(Color.BLACK);
                //((TextView) adapterView.getChildAt(0)).setTextSize(18);
                cveEdo =((Estados) adapterView.getSelectedItem()).getIdestado();
                nombreEdo =((Estados) adapterView.getSelectedItem()).getNomestado();

                switch (nombreEdo){
                    case "Aguascalientes":
                        //Spinner Delegacion
                        tablaDb = "t_aguascalientes";
                        List<Delegacion> listaDelegacion1 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion1);
                        spi_representacion.setAdapter(arrayAdapterDelegacion);
                        break;
                    case "Baja California":
                        //Spinner Delegacion
                        tablaDb = "t_bc";
                        List<Delegacion> listaDelegacion2 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion2 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion2);
                        spi_representacion.setAdapter(arrayAdapterDelegacion2);
                        break;
                    case "Baja California Sur":
                        //Spinner Delegacion
                        tablaDb = "t_bcs";
                        List<Delegacion> listaDelegacion3 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion3 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion3);
                        spi_representacion.setAdapter(arrayAdapterDelegacion3);
                        break;
                    case "Campeche":
                        //Spinner Delegacion
                        tablaDb = "t_campeche";
                        List<Delegacion> listaDelegacion4 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion4 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion4);
                        spi_representacion.setAdapter(arrayAdapterDelegacion4);
                        break;
                    case "Coahuila":
                        //Spinner Delegacion
                        tablaDb = "t_coahuila";
                        List<Delegacion> listaDelegacion5 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion5 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion5);
                        spi_representacion.setAdapter(arrayAdapterDelegacion5);
                        break;
                    case "Colima":
                        //Spinner Delegacion
                        tablaDb = "t_colima";
                        List<Delegacion> listaDelegacion6 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion6 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion6);
                        spi_representacion.setAdapter(arrayAdapterDelegacion6);
                        break;
                    case "Chiapas":
                        //Spinner Delegacion
                        tablaDb = "t_chiapas";
                        List<Delegacion> listaDelegacion7 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion7 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion7);
                        spi_representacion.setAdapter(arrayAdapterDelegacion7);
                        break;
                    case "Chihuahua":
                        //Spinner Delegacion
                        tablaDb = "t_chihuahua";
                        List<Delegacion> listaDelegacion8 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion8 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion8);
                        spi_representacion.setAdapter(arrayAdapterDelegacion8);
                        break;
                    case "Ciudad de México":
                        //Spinner Delegacion
                        tablaDb = "t_cdmx";
                        List<Delegacion> listaDelegacion9 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion9 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion9);
                        spi_representacion.setAdapter(arrayAdapterDelegacion9);
                        break;
                    case "Durango":
                        //Spinner Delegacion
                        tablaDb = "t_durango";
                        List<Delegacion> listaDelegacion10 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion10 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion10);
                        spi_representacion.setAdapter(arrayAdapterDelegacion10);
                        break;
                    case "Guanajuato":
                        //Spinner Delegacion
                        tablaDb = "t_guanajuato";
                        List<Delegacion> listaDelegacion11 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion11 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion11);
                        spi_representacion.setAdapter(arrayAdapterDelegacion11);
                        break;
                    case "Guerrero":
                        //Spinner Delegacion
                        tablaDb = "t_guerrero";
                        List<Delegacion> listaDelegacion12 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion12 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion12);
                        spi_representacion.setAdapter(arrayAdapterDelegacion12);
                        break;
                    case "Hidalgo":
                        //Spinner Delegacion
                        tablaDb = "t_hidalgo";
                        List<Delegacion> listaDelegacion13 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion13 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion13);
                        spi_representacion.setAdapter(arrayAdapterDelegacion13);
                        break;
                    case "Jalisco":
                        //Spinner Delegacion
                        tablaDb = "t_jalisco";
                        List<Delegacion> listaDelegacion14 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion14 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion14);
                        spi_representacion.setAdapter(arrayAdapterDelegacion14);
                        break;
                    case "México":
                        //Spinner Delegacion
                        tablaDb = "t_mexico";
                        List<Delegacion> listaDelegacion15 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion15 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion15);
                        spi_representacion.setAdapter(arrayAdapterDelegacion15);
                        break;
                    case "Michoacán":
                        //Spinner Delegacion
                        tablaDb = "t_michoacan";
                        List<Delegacion> listaDelegacion16 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion16 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion16);
                        spi_representacion.setAdapter(arrayAdapterDelegacion16);
                        break;
                    case "Morelos":
                        //Spinner Delegacion
                        tablaDb = "t_morelos";
                        List<Delegacion> listaDelegacion17 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion17 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion17);
                        spi_representacion.setAdapter(arrayAdapterDelegacion17);
                        break;
                    case "Nayarit":
                        //Spinner Delegacion
                        tablaDb = "t_nayarit";
                        List<Delegacion> listaDelegacion18 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion18 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion18);
                        spi_representacion.setAdapter(arrayAdapterDelegacion18);
                        break;
                    case "Nuevo León":
                        //Spinner Delegacion
                        tablaDb = "t_nl";
                        List<Delegacion> listaDelegacion19 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion19 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion19);
                        spi_representacion.setAdapter(arrayAdapterDelegacion19);
                        break;
                    case "Oaxaca":
                        //Spinner Delegacion
                        tablaDb = "t_oaxaca";
                        List<Delegacion> listaDelegacion20 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion20 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion20);
                        spi_representacion.setAdapter(arrayAdapterDelegacion20);
                        break;
                    case "Puebla":
                        //Spinner Delegacion
                        tablaDb = "t_puebla";
                        List<Delegacion> listaDelegacion21 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion21 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion21);
                        spi_representacion.setAdapter(arrayAdapterDelegacion21);
                        break;
                    case "Querétaro":
                        //Spinner Delegacion
                        tablaDb = "t_queretaro";
                        List<Delegacion> listaDelegacion22 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion22 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion22);
                        spi_representacion.setAdapter(arrayAdapterDelegacion22);
                        break;
                    case "Quintana Roo":
                        //Spinner Delegacion
                        tablaDb = "t_quintanaroo";
                        List<Delegacion> listaDelegacion23 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion23 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion23);
                        spi_representacion.setAdapter(arrayAdapterDelegacion23);
                        break;
                    case "San Luis Potosí":
                        //Spinner Delegacion
                        tablaDb = "t_sanluis";
                        List<Delegacion> listaDelegacion24 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion24 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion24);
                        spi_representacion.setAdapter(arrayAdapterDelegacion24);
                        break;
                    case "Sinaloa":
                        //Spinner Delegacion
                        tablaDb = "t_sinaloa";
                        List<Delegacion> listaDelegacion25 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion25 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion25);
                        spi_representacion.setAdapter(arrayAdapterDelegacion25);
                        break;
                    case "Sonora":
                        //Spinner Delegacion
                        tablaDb = "t_sonora";
                        List<Delegacion> listaDelegacion26 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion26 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion26);
                        spi_representacion.setAdapter(arrayAdapterDelegacion26);
                        break;
                    case "Tabasco":
                        //Spinner Delegacion
                        tablaDb = "t_tabasco";
                        List<Delegacion> listaDelegacion27 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion27 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion27);
                        spi_representacion.setAdapter(arrayAdapterDelegacion27);
                        break;
                    case "Tamaulipas":
                        //Spinner Delegacion
                        tablaDb = "t_tamaulipas";
                        List<Delegacion> listaDelegacion28 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion28 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion28);
                        spi_representacion.setAdapter(arrayAdapterDelegacion28);
                        break;
                    case "Tlaxcala":
                        //Spinner Delegacion
                        tablaDb = "t_tlaxcala";
                        List<Delegacion> listaDelegacion29 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion29 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion29);
                        spi_representacion.setAdapter(arrayAdapterDelegacion29);
                        break;
                    case "Veracruz":
                        //Spinner Delegacion
                        tablaDb = "t_veracruz";
                        List<Delegacion> listaDelegacion30 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion30 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion30);
                        spi_representacion.setAdapter(arrayAdapterDelegacion30);
                        break;
                    case "Yucatán":
                        //Spinner Delegacion
                        tablaDb = "t_yucatan";
                        List<Delegacion> listaDelegacion31 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion31 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion31);
                        spi_representacion.setAdapter(arrayAdapterDelegacion31);
                        break;
                    case "Zacatecas":
                        //Spinner Delegacion
                        tablaDb = "t_zacatecas";
                        List<Delegacion> listaDelegacion32 = llenarDelegacion(tablaDb);
                        ArrayAdapter<Delegacion> arrayAdapterDelegacion32 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDelegacion32);
                        spi_representacion.setAdapter(arrayAdapterDelegacion32);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        //Click spinner Delegacion
        spi_representacion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                cveDelegacion =((Delegacion) adapterView.getSelectedItem()).getIddelegacion();
                nombreDelegacion =((Delegacion) adapterView.getSelectedItem()).getNomdelegacion();

                //Spinner Ddr
                List<Ddr> listaDdr = llenarDdr(tablaDb, nombreDelegacion);
                ArrayAdapter<Ddr> arrayAdapterDdr = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaDdr);
                spi_ddr.setAdapter(arrayAdapterDdr);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        //Click spinner Ddr
        spi_ddr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                cveDdr =((Ddr) adapterView.getSelectedItem()).getIdddr();
                nombreDdr =((Ddr) adapterView.getSelectedItem()).getNomddr();

                //Spinner Cader
                List<Cader> listaCader = llenarCader(tablaDb, nombreDelegacion, nombreDdr);
                ArrayAdapter<Cader> arrayAdapterCader = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaCader);
                spi_cader.setAdapter(arrayAdapterCader);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        //Click spinner Cader
        spi_cader.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                cveCader =((Cader) adapterView.getSelectedItem()).getIdcader();
                nombreCader =((Cader) adapterView.getSelectedItem()).getNomcader();

                //Spinner Cader
                List<Municipio> listaMun = llenarMunicipio(tablaDb, nombreDelegacion, nombreDdr, nombreCader);
                ArrayAdapter<Municipio> arrayAdapterMun = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaMun);
                spi_mun.setAdapter(arrayAdapterMun);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        //Click spinner Municipio
        spi_mun.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                cveMunicipio =((Municipio) adapterView.getSelectedItem()).getIdmunicipio();
                nombreMunicipio =((Municipio) adapterView.getSelectedItem()).getNommunicipio();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    @Override
    public void onBackPressed() {

    }

}