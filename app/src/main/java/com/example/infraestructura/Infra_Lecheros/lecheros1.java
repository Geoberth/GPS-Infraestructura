package com.example.infraestructura.Infra_Lecheros;

import androidx.appcompat.app.AppCompatActivity;

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

import com.example.infraestructura.Catalogos.db.DbCatalogos;
import com.example.infraestructura.Catalogos.entidades.Cader;
import com.example.infraestructura.Catalogos.entidades.Ddr;
import com.example.infraestructura.Catalogos.entidades.Delegacion;
import com.example.infraestructura.Catalogos.entidades.Estados;
import com.example.infraestructura.Catalogos.entidades.Municipio;
import com.example.infraestructura.General;
import com.example.infraestructura.Georeferencia.GeoreferenciaActivity;
import com.example.infraestructura.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class lecheros1 extends AppCompatActivity {


    Lecheros_Model model;
    int dia, mes, anio;
    Button btnnext;
    TextView leche_fecha, lech6oo, lech7o;
    Spinner spi_edo, spi_representacion, spi_ddr, spi_cader, spi_mun, lestatus, lraza, ltipoo;
    EditText loca, ldomi, lnomupp, lnvacas, lnvaqui, lcruza, loraza, lsuper, lobserv;

    //Variables para los catalogos
    String tablaDb,cveEdo, nombreEdo,cveDelegacion,nombreDelegacion,cveDdr,nombreDdr,cveCader,nombreCader,cveMunicipio,nombreMunicipio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecheros1);

        leche_fecha = findViewById(R.id.leche_txtFecha);
        spi_edo = findViewById(R.id.leche_spiEstado1);
        spi_representacion = findViewById(R.id.leche_spiEstado01);
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

        //Llamada a la funcion de los spinners con los catalogos
        spinnersCatalogosEvent();

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

                model = new Lecheros_Model(folio, fecha, cveEntidad, entidad, cveRepresentacion, representacion, cveDdr2, ddr, cveCader2, cader, cveMunicipio2, municipio, cveLocalidad, localidad, domiupp, nombreupp, estatus, numerovacas, numerovaqui, raza, cruza, otraraza, tipoordena, superficie, observaciones, longitud, latitud, foto1, foto2, "0", "0");
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
            lsuper.setError("No puede quedar vacío");
            retorno=false;
        }
        if (lobserv.getText().toString().isEmpty()){
            lobserv.setError("No puede quedar vacío");
            retorno=false;
        }
        else if(lraza.getSelectedItem().toString().equals("Cruza") && lcruza.getText().toString().isEmpty()){
            lcruza.setError("No puede quedar vacio");
            retorno=false;
        }
        else if(lraza.getSelectedItem().toString().equals("Otra") && loraza.getText().toString().isEmpty()){
            loraza.setError("No puede quedar vacio");
            retorno=false;
        }
        return retorno;
    }

    //Funciones para los spinners con los catalogos
    private List<Estados> llenarEstados(){
        List<Estados> listaCat = new ArrayList<>();
        DbCatalogos dbCategorias = new DbCatalogos(lecheros1.this);
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
        DbCatalogos dbCategorias = new DbCatalogos(lecheros1.this);
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
        DbCatalogos dbCategorias = new DbCatalogos(lecheros1.this);
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
        DbCatalogos dbCategorias = new DbCatalogos(lecheros1.this);
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
        DbCatalogos dbCategorias = new DbCatalogos(lecheros1.this);
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