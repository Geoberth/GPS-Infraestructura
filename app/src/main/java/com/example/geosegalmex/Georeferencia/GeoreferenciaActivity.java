package com.example.geosegalmex.Georeferencia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Helper;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.geosegalmex.General;
import com.example.geosegalmex.Infra_Ave.AveBD;
import com.example.geosegalmex.Infra_Ave.Ave_Model;
import com.example.geosegalmex.Infra_Engorda.EngordaBD;
import com.example.geosegalmex.Infra_Engorda.Engorda_Model;
import com.example.geosegalmex.Infra_Granos.GranosBD;
import com.example.geosegalmex.Infra_Granos.Granos_Model;
import com.example.geosegalmex.Infra_Lecheros.LecherosBD;
import com.example.geosegalmex.Infra_Lecheros.Lecheros_Model;
import com.example.geosegalmex.Infra_Porcino.PorcinoBD;
import com.example.geosegalmex.Infra_Porcino.Porcino_Model;
import com.example.geosegalmex.Infra_Sacrificio.SacrificioBD;
import com.example.geosegalmex.Infra_Sacrificio.Sacrificio_model;
import com.example.geosegalmex.Liconsa.LiconsaBD;
import com.example.geosegalmex.Liconsa.Liconsa_Model;
import com.example.geosegalmex.Liconsa2.LiconsaVerificacionBD;
import com.example.geosegalmex.Liconsa2.LiconsaVerificacion_Model;
import com.example.geosegalmex.LiconsaBeneficiario.PASLBeneficiario;
import com.example.geosegalmex.LiconsaBeneficiario.PASLbeneficiarioBD;
import com.example.geosegalmex.LiconsaBeneficiario.Pasl_b_Model;
import com.example.geosegalmex.LiconsaVentanilla.PASLOperativo;
import com.example.geosegalmex.LiconsaVentanilla.PASLoperativoBD;
import com.example.geosegalmex.LiconsaVentanilla.Pasl_o_Model;
import com.example.geosegalmex.PARBeneficiario.PARBeneficiarioBD;
import com.example.geosegalmex.PARBeneficiario.PARBeneficiario_Model;
import com.example.geosegalmex.PAROperativo.PAR_operativo_model;
import com.example.geosegalmex.PAROperativo.PARoperativoBD;
import com.example.geosegalmex.PGBeneficiarioGranos.PGB_granos_model;
import com.example.geosegalmex.PGBeneficiarioGranos.PGBgranosBD;
import com.example.geosegalmex.PGBeneficiarioLeche.PGBeneficiarioLecheBD;
import com.example.geosegalmex.PGBeneficiarioLeche.PGBeneficiarioLeche_Model;
import com.example.geosegalmex.PGBeneficiariosGranosIncentivos.PGBeneficiariosGranosIncentivosBD;
import com.example.geosegalmex.PGBeneficiariosGranosIncentivos.PGBeneficiariosGranosIncentivos_Model;
import com.example.geosegalmex.PGOperativoEstimulos.PGOperativoEstimulosBD;
import com.example.geosegalmex.PGOperativoEstimulos.PGOperativoEstimulos_Model;
import com.example.geosegalmex.PGOperativoGranos.PGOperativoGranosBD;
import com.example.geosegalmex.PGOperativoGranos.PGOperativoGranos_Model;
import com.example.geosegalmex.PGOperativoLeche.PGOperativoLecheBD;
import com.example.geosegalmex.PGOperativoLeche.PGOperativoLeche_Model;
import com.example.geosegalmex.R;
import com.example.geosegalmex.dbstorage.Georreferencia;
import com.example.geosegalmex.drawer.DrawerActivity;
import com.example.geosegalmex.unidadcaracterizacionhortalizas.db.DatabaseHelper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class GeoreferenciaActivity extends AppCompatActivity  implements OnMapReadyCallback {

    //17-10-2019

    public static final int     NAME_SYNCED_WITH_SERVER     = 1;
    public static final int     NAME_NOT_SYNCED_WITH_SERVER = 0;

    private com.example.geosegalmex.unidadcaracterizacionhortalizas.db.DatabaseHelper db;
    private List<Georreferencia> georreferenciaList;

    Sacrificio_model model;
    Engorda_Model model2;
    Porcino_Model model3;
    Lecheros_Model model4;
    Ave_Model model5;
    Granos_Model model6;

    String longitudGeo="";
    String latitudGeo="";
    int bandera = 2;
    //---------

    Location mlocationBeta;
    FusedLocationProviderClient fusedLocationProviderClientBeta;
    private static final int Request_Code = 101;
    Button geoReferenciaSalirGuardarBeta;
    ExtendedFloatingActionButton fabGeoMapa;

    private int dia, mes, anio, hora, minutos, segundos;
    String fechaActual;
    String horaActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_georeferencia);

        fusedLocationProviderClientBeta = LocationServices.getFusedLocationProviderClient(this);
        GetlastLocationBeta();

        fabGeoMapa = findViewById(R.id.fab_geomapa);
        db         = new DatabaseHelper(this);

        fabGeoMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(General.Proyecto.equals("Centros de Sacrificio")){
                    agregarSacrificio();
                }
                else if(General.Proyecto.equals("Corrales de Engorda")){
                    agregarEngorda();
                }
                else if(General.Proyecto.equals("Granjas de Porcino")){
                    agregarPorcino();
                }
                else if(General.Proyecto.equals("Establos Lecheros")){
                    agregarLecheros();
                }
                else if(General.Proyecto.equals("Granjas de Ave")){
                    agregarAve();
                }
                else if(General.Proyecto.equals("Almacenes de Granos")){
                    agregarGranos();
                }

                finish();
                startActivity(new Intent(getApplication(), DrawerActivity.class));
            }
        });

        Calendar fecha = Calendar.getInstance();
        dia = fecha.get(Calendar.DAY_OF_MONTH);
        mes = fecha.get(Calendar.MONTH);
        anio = fecha.get(Calendar.YEAR);

        String an = String.valueOf(anio);
        String anior = an.substring(2,4);

        hora = fecha.get(Calendar.HOUR_OF_DAY);
        minutos = fecha.get(Calendar.MINUTE);
        segundos = fecha.get(Calendar.SECOND);

       //SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
       SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
       Date date = new Date();

       fechaActual = format1.format(date);


        String hor;

        if (hora < 10) {
            hor = "0" + hora;
        }else
            hor = "" + hora;


        if(minutos < 10 ){
            String min = "0" + minutos;
            if (segundos < 10){
                String seg = "0" + segundos;
                horaActual=(String.format(hor+":"+min+":"+seg));
            }else
                horaActual=(String.format(hor+":"+min+":"+segundos));
        }else
        if (segundos < 10) {
            String seg = "0" + segundos;
            horaActual=(String.format(hor + ":" + minutos + ":" + seg));
        }else
            horaActual=(String.format(hor+":"+minutos+":"+segundos));

      //horaActual= (String.format("%d:%d:%d", hora, minutos, segundos));

        /*
        geoReferenciaSalirGuardarBeta = findViewById(R.id.guardar_desde_georeferencia_beta);

        geoReferenciaSalirGuardarBeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getApplication(), Segunda.class));
                startActivity(new Intent(getApplication(), DrawerActivity.class));
                finish();
            }
        });

         */
    }

    private void GetlastLocationBeta() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, Request_Code);
            return;
        }
        Task<Location> task = fusedLocationProviderClientBeta.getLastLocation();
        task.addOnSuccessListener(new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if(location != null){
                    mlocationBeta = location;
                    Toast.makeText(getApplicationContext(), "Georreferencia guardada"+"\nLongitud:" +mlocationBeta.getLongitude()+"\nLatitud:" + mlocationBeta.getLatitude(), Toast.LENGTH_LONG).show();
                    SupportMapFragment supportMapFragment =(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapasdos_beta);

                    supportMapFragment.getMapAsync(GeoreferenciaActivity.this);
                    bandera = 1;
                }
                else{
                    bandera = 2;
                }
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng latLng = new LatLng(mlocationBeta.getLatitude(), mlocationBeta.getLongitude());

        //17-10-2019
        longitudGeo = String.valueOf(mlocationBeta.getLongitude());
        latitudGeo = String.valueOf(mlocationBeta.getLatitude());

        if(longitudGeo.length()!=0 && latitudGeo.length()!=0){
            //agregarGoerreferencia("BrigadistaGeo","ProductorGeo" , longitudGeo, latitudGeo, horaActual, fechaActual,NAME_NOT_SYNCED_WITH_SERVER);
        }else {
            Toast.makeText(getBaseContext(), "Verifica los Datos", Toast.LENGTH_LONG).show();
        }
        //
        MarkerOptions markerOptions = new MarkerOptions().position(latLng).title("Estoy aqui");
        googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,18));
        googleMap.addMarker(markerOptions);


    }

    private void agregarSacrificio() {
        if(bandera == 2){
            longitudGeo = General.Lonini;
            latitudGeo = General.Latini;
        }
        else{
            longitudGeo = General.Lonini;
            latitudGeo = General.Latini;
        }

        model = new Sacrificio_model();
        model = (Sacrificio_model)getIntent().getSerializableExtra("model");
        model.setLongitud(longitudGeo);
        model.setLatitud(latitudGeo);

        SacrificioBD baseBD;
        baseBD = new SacrificioBD(this);

        boolean insertarData = baseBD.addSacrificio(model);
        if(insertarData == true) {
            Toast.makeText(this, "Encuesta guardada correctamente", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Error al guardar", Toast.LENGTH_LONG).show();
        }
    }

    private void agregarEngorda() {
        if(bandera == 2){
            longitudGeo = General.Lonini;
            latitudGeo = General.Latini;
        }
        else{
            longitudGeo = General.Lonini;
            latitudGeo = General.Latini;
        }

        model2 = new Engorda_Model();
        model2 = (Engorda_Model)getIntent().getSerializableExtra("model");
        model2.setLongitud(longitudGeo);
        model2.setLatitud(latitudGeo);

        EngordaBD baseBD;
        baseBD = new EngordaBD(this);

        boolean insertarData = baseBD.addEngorda(model2);
        if(insertarData == true) {
            Toast.makeText(this, "Encuesta guardada correctamente", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Error al guardar", Toast.LENGTH_LONG).show();
        }
    }

    private void agregarPorcino() {
        if(bandera == 2){
            longitudGeo = General.Lonini;
            latitudGeo = General.Latini;
        }
        else{
            longitudGeo = General.Lonini;
            latitudGeo = General.Latini;
        }

        model3 = new Porcino_Model();
        model3 = (Porcino_Model)getIntent().getSerializableExtra("model");
        model3.setLongitud(longitudGeo);
        model3.setLatitud(latitudGeo);

        PorcinoBD baseBD;
        baseBD = new PorcinoBD(this);

        boolean insertarData = baseBD.addPorcino(model3);
        if(insertarData == true) {
            Toast.makeText(this, "Encuesta guardada correctamente", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Error al guardar", Toast.LENGTH_LONG).show();
        }
    }

    private void agregarLecheros() {
        if(bandera == 2){
            longitudGeo = General.Lonini;
            latitudGeo = General.Latini;
        }
        else{
            longitudGeo = General.Lonini;
            latitudGeo = General.Latini;
        }

        model4 = new Lecheros_Model();
        model4 = (Lecheros_Model)getIntent().getSerializableExtra("model");
        model4.setLongitud(longitudGeo);
        model4.setLatitud(latitudGeo);

        LecherosBD baseBD;
        baseBD = new LecherosBD(this);

        boolean insertarData = baseBD.addLecheros(model4);
        if(insertarData == true) {
            Toast.makeText(this, "Encuesta guardada correctamente", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Error al guardar", Toast.LENGTH_LONG).show();
        }
    }

    private void agregarAve() {
        if(bandera == 2){
            longitudGeo = General.Lonini;
            latitudGeo = General.Latini;
        }
        else{
            longitudGeo = General.Lonini;
            latitudGeo = General.Latini;
        }

        model5 = new Ave_Model();
        model5 = (Ave_Model)getIntent().getSerializableExtra("model");
        model5.setLongitud(longitudGeo);
        model5.setLatitud(latitudGeo);

        AveBD baseBD;
        baseBD = new AveBD(this);

        boolean insertarData = baseBD.addAve(model5);
        if(insertarData == true) {
            Toast.makeText(this, "Encuesta guardada correctamente", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Error al guardar", Toast.LENGTH_LONG).show();
        }
    }

    private void agregarGranos() {
        if(bandera == 2){
            longitudGeo = General.Lonini;
            latitudGeo = General.Latini;
        }
        else{
            longitudGeo = General.Lonini;
            latitudGeo = General.Latini;
        }

        model6 = new Granos_Model();
        model6 = (Granos_Model)getIntent().getSerializableExtra("model");
        model6.setLongitud(longitudGeo);
        model6.setLatitud(latitudGeo);

        GranosBD baseBD;
        baseBD = new GranosBD(this);

        boolean insertarData = baseBD.addGranos(model6);
        if(insertarData == true) {
            Toast.makeText(this, "Encuesta guardada correctamente", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Error al guardar", Toast.LENGTH_LONG).show();
        }
    }


    private void agregarGoerreferencia(String brigadistaGeo, String productorGeo, String longitudGeoGeo, String latitudGeoGeo, String horaActual, String fechaActual, int status) {

        boolean insertarData = db.addGoerreferenciaDos(brigadistaGeo, productorGeo, longitudGeoGeo, latitudGeoGeo, horaActual, fechaActual, status);
        if(insertarData == true) {
           // Toast.makeText(this, "Datos insertados correctamente", Toast.LENGTH_SHORT).show();
        }else{
           // Toast.makeText(this, "Algo salio mal", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        //super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case Request_Code:
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    GetlastLocationBeta();
                }
                break;
        }

    }

    @Override
    public void onBackPressed() {

    }


}
