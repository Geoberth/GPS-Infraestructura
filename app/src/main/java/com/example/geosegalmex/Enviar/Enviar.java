package com.example.geosegalmex.Enviar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.geosegalmex.Infra_Ave.AveBD;
import com.example.geosegalmex.Infra_Ave.Ave_Model;
import com.example.geosegalmex.Infra_Engorda.EngordaBD;
import com.example.geosegalmex.Infra_Engorda.Engorda_Model;
import com.example.geosegalmex.Infra_Lecheros.LecherosBD;
import com.example.geosegalmex.Infra_Lecheros.Lecheros_Model;
import com.example.geosegalmex.Infra_Porcino.PorcinoBD;
import com.example.geosegalmex.Infra_Porcino.Porcino_Model;
import com.example.geosegalmex.Infra_Sacrificio.SacrificioBD;
import com.example.geosegalmex.Infra_Sacrificio.Sacrificio_model;
import com.example.geosegalmex.R;
import com.google.gson.Gson;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Enviar extends AppCompatActivity {

    TextView tvengorda, tvengordafotos, tvporcino, tvporcinofotos, tvaves, tvavesfotos, tvsacrificio, tvsacrificiofotos, tvLechero, tvLecherofotos;
    Button btnEngorda, btnEngordaFotos, btnPorcino, btnPorcinofotos, btnaves, btnavesfotos, btnsacrificio, btnsacrificiofotos, btnLechero, btnLecherofotos;


    boolean correctoEngorda = false;
    ArrayList<Engorda_Model> ArrayEngorda = new ArrayList<>();
    boolean correctoEngordaFotos = false;// ======>
    ArrayList<Engorda_Model> ArrayEngordaFotos = new ArrayList<>();// ======>

    boolean correctoPorcino = false;
    ArrayList<Porcino_Model> ArrayPorcino= new ArrayList<>();
    boolean correctoPorcinoFotos = false;// ======>
    ArrayList<Porcino_Model> ArrayPorcinoFotos = new ArrayList<>();// ======>

    boolean correctoAve = false;
    ArrayList<Ave_Model> ArrayAve= new ArrayList<>();
    boolean correctoAvesFotos = false;// ======>
    ArrayList<Ave_Model> ArrayAvesFotos = new ArrayList<>();// ======>

    boolean correctoSacrificio = false;
    ArrayList<Sacrificio_model> ArraySacrificio= new ArrayList<>();
    boolean correctoSacrificioFotos = false;// ======>
    ArrayList<Sacrificio_model> ArraySacrificioFotos= new ArrayList<>();// ======>

    boolean correctoLechero = false;
    ArrayList<Lecheros_Model> ArrayLechero= new ArrayList<>();
    boolean correctoLecheroFotos = false;// ======>
    ArrayList<Lecheros_Model> ArrayLecheroFotos= new ArrayList<>();// ======>

    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar);

        tvengorda = (TextView)findViewById(R.id.enviar2);
        btnEngorda = (Button)findViewById(R.id.button1);
        tvengordafotos = (TextView)findViewById(R.id.enviar2_1);// ======>
        btnEngordaFotos = (Button)findViewById(R.id.button1_1);// ======>

        tvporcino = (TextView)findViewById(R.id.enviar5);
        btnPorcino = (Button)findViewById(R.id.button2);
        tvporcinofotos = (TextView)findViewById(R.id.enviar5_1);// ======>
        btnPorcinofotos = (Button)findViewById(R.id.button2_1);// ======>

        tvaves = (TextView)findViewById(R.id.enviar8);
        btnaves = (Button)findViewById(R.id.button3);
        tvavesfotos = (TextView)findViewById(R.id.enviar8_1);// ======>
        btnavesfotos = (Button)findViewById(R.id.button3_1);// ======>

        tvsacrificio = (TextView)findViewById(R.id.enviar11);
        btnsacrificio = (Button)findViewById(R.id.button4);
        tvsacrificiofotos = (TextView)findViewById(R.id.enviar11_1);// ======>
        btnsacrificiofotos = (Button)findViewById(R.id.button4_1);// ======>

        tvLechero = (TextView)findViewById(R.id.enviar14);
        btnLechero = (Button)findViewById(R.id.button5);
        tvLecherofotos = (TextView)findViewById(R.id.enviar14_1);
        btnLecherofotos = (Button)findViewById(R.id.button5_1);

        //╔═══════════════════╗
        //║ Variables Engorda ║
        //╚═══════════════════╝
        //Contador de registro nuevos por enviar Engorda
        EngordaBD dbengorda = new EngordaBD(Enviar.this);
        ArrayEngorda = dbengorda.mostrarEngorda();
        tvengorda.setText((ArrayEngorda == null)?"0":"" + ArrayEngorda.size());
        if(tvengorda.getText().equals("0")){
            btnEngorda.setEnabled(false);
            btnEngorda.setBackground(ContextCompat.getDrawable(this, R.drawable.redondo3));
        }
        //Evento click enviar Engorda
        btnEngorda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertDataEngorda(ArrayEngorda);
            }
        });
        //Contador de fotos nuevas por enviar Engorda
        ArrayEngordaFotos = dbengorda.mostrarFotosEngorda();
        tvengordafotos.setText((ArrayEngordaFotos == null)?"0":"" + dbengorda.contarFotosEngorda()*2);
        if(tvengordafotos.getText().equals("0")){
            btnEngordaFotos.setEnabled(false);
            btnEngordaFotos.setBackground(ContextCompat.getDrawable(this, R.drawable.redondo3));
        }
        //Evento click enviar Fotos  Engorda
        btnEngordaFotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog progressDialog = new ProgressDialog(Enviar.this);
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.setMax(100); // Progress Dialog Max Value
                progressDialog.setMessage("Loading..."); // Setting Message
                progressDialog.setTitle("Enviando Fotos"); // Setting Title
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL); // Progress Dialog Style Horizontal
                progressDialog.show(); // Display Progress Dialog
                progressDialog.setCancelable(false);
                progressDialog.setProgress(10);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        insertPicturesEngorda(ArrayEngordaFotos, progressDialog);
                    }
                }, 1000);
            }
        });


        //╔═══════════════════╗
        //║ Variables Porcino ║
        //╚═══════════════════╝
        //Contador de registro nuevos por enviar Engorda
        PorcinoBD dbporcino = new PorcinoBD(Enviar.this);
        ArrayPorcino = dbporcino.mostrarPorcino();
        tvporcino.setText((ArrayPorcino == null)?"0":"" + ArrayPorcino.size());
        if(tvporcino.getText().equals("0")){
            btnPorcino.setEnabled(false);
            btnPorcino.setBackground(ContextCompat.getDrawable(this, R.drawable.redondo3));
        }
        //Evento click enviar Porcino
        btnPorcino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertDataPorcino(ArrayPorcino);
            }
        });
        //Contador de fotos nuevas por enviar Engorda
        ArrayPorcinoFotos = dbporcino.mostrarFotosPorcino();
        tvporcinofotos.setText((ArrayPorcinoFotos == null)?"0":"" + dbporcino.contarFotosPorcino()*2);
        if(tvporcinofotos.getText().equals("0")){
            btnPorcinofotos.setEnabled(false);
            btnPorcinofotos.setBackground(ContextCompat.getDrawable(this, R.drawable.redondo3));
        }
        //Evento click enviar Fotos  Engorda
        btnPorcinofotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog progressDialog = new ProgressDialog(Enviar.this);
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.setMax(100); // Progress Dialog Max Value
                progressDialog.setMessage("Loading..."); // Setting Message
                progressDialog.setTitle("Enviando Fotos"); // Setting Title
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL); // Progress Dialog Style Horizontal
                progressDialog.show(); // Display Progress Dialog
                progressDialog.setCancelable(false);
                progressDialog.setProgress(10);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        insertPicturesPorcino(ArrayPorcinoFotos, progressDialog);
                    }
                }, 1000);
            }
        });


        //╔═══════════════════╗
        //║   Variables Ave   ║
        //╚═══════════════════╝
        //Contador de registro nuevos por enviar Engorda
        AveBD dbave = new AveBD(Enviar.this);
        ArrayAve = dbave.mostrarAve();
        tvaves.setText((ArrayAve == null)?"0":"" + ArrayAve.size());
        if(tvaves.getText().equals("0")){
            btnaves.setEnabled(false);
            btnaves.setBackground(ContextCompat.getDrawable(this, R.drawable.redondo3));
        }
        //Evento click enviar Aves
        btnaves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertDataAve(ArrayAve);
            }
        });
        //Contador de fotos nuevas por enviar Aves
        ArrayAvesFotos = dbave.mostrarFotosAve();
        tvavesfotos.setText((ArrayAvesFotos == null)?"0":"" + dbave.contarFotosAve()*2);
        if(tvavesfotos.getText().equals("0")){
            btnavesfotos.setEnabled(false);
            btnavesfotos.setBackground(ContextCompat.getDrawable(this, R.drawable.redondo3));
        }
        //Evento click enviar Fotos  Aves
        btnavesfotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog progressDialog = new ProgressDialog(Enviar.this);
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.setMax(100); // Progress Dialog Max Value
                progressDialog.setMessage("Loading..."); // Setting Message
                progressDialog.setTitle("Enviando Fotos"); // Setting Title
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL); // Progress Dialog Style Horizontal
                progressDialog.show(); // Display Progress Dialog
                progressDialog.setCancelable(false);
                progressDialog.setProgress(10);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        insertPicturesAves(ArrayAvesFotos, progressDialog);
                    }
                }, 1000);
            }
        });


        //╔══════════════════════╗
        //║ Variables Sacrificio ║
        //╚══════════════════════╝
        //Contador de registro nuevos por enviar Engorda
        SacrificioBD dbsacrificio = new SacrificioBD(Enviar.this);
        ArraySacrificio = dbsacrificio.mostrarSacrificio();
        tvsacrificio.setText((ArraySacrificio == null)?"0":"" + ArraySacrificio.size());
        if(tvsacrificio.getText().equals("0")){
            btnsacrificio.setEnabled(false);
            btnsacrificio.setBackground(ContextCompat.getDrawable(this, R.drawable.redondo3));
        }
        //Evento click enviar Engorda
        btnsacrificio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertDataSacrificio(ArraySacrificio);
            }
        });
        //Contador de fotos nuevas por enviar Sacrificio
        ArraySacrificioFotos = dbsacrificio.mostrarFotosSacrificio();
        tvsacrificiofotos.setText((ArraySacrificioFotos == null)?"0":"" + dbsacrificio.contarFotosSacrificio()*2);
        if(tvsacrificiofotos.getText().equals("0")){
            btnsacrificiofotos.setEnabled(false);
            btnsacrificiofotos.setBackground(ContextCompat.getDrawable(this, R.drawable.redondo3));
        }
        //Evento click enviar Fotos  Aves
        btnsacrificiofotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog progressDialog = new ProgressDialog(Enviar.this);
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.setMax(100); // Progress Dialog Max Value
                progressDialog.setMessage("Loading..."); // Setting Message
                progressDialog.setTitle("Enviando Fotos"); // Setting Title
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL); // Progress Dialog Style Horizontal
                progressDialog.show(); // Display Progress Dialog
                progressDialog.setCancelable(false);
                progressDialog.setProgress(10);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        insertPicturesSacrificio(ArraySacrificioFotos, progressDialog);
                    }
                }, 1000);
            }
        });


        //╔══════════════════════╗
        //║  Variables Lecheros  ║
        //╚══════════════════════╝
        //Contador de registro nuevos por enviar Engorda
        LecherosBD dblecheros = new LecherosBD(Enviar.this);
        ArrayLechero = dblecheros.mostrarLecheros();
        tvLechero.setText((ArrayLechero == null)?"0":"" + ArrayLechero.size());
        if(tvLechero.getText().equals("0")){
            btnLechero.setEnabled(false);
            btnLechero.setBackground(ContextCompat.getDrawable(this, R.drawable.redondo3));
        }
        //Evento click enviar Lecheros
        btnLechero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertDataLecheros(ArrayLechero);
            }
        });
        //Contador de fotos nuevas por enviar Lecheros
        ArrayLecheroFotos = dblecheros.mostrarFotosLecheros();
        tvLecherofotos.setText((ArrayLecheroFotos == null)?"0":"" + dblecheros.contarFotosLecheros()*2);
        if(tvLecherofotos.getText().equals("0")){
            btnLecherofotos.setEnabled(false);
            btnLecherofotos.setBackground(ContextCompat.getDrawable(this, R.drawable.redondo3));
        }
        //Evento click enviar Fotos  Lecheros
        btnLecherofotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog progressDialog = new ProgressDialog(Enviar.this);
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.setMax(100); // Progress Dialog Max Value
                progressDialog.setMessage("Loading..."); // Setting Message
                progressDialog.setTitle("Enviando Fotos"); // Setting Title
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL); // Progress Dialog Style Horizontal
                progressDialog.show(); // Display Progress Dialog
                progressDialog.setCancelable(false);
                progressDialog.setProgress(10);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        insertPicturesLecheros(ArrayLecheroFotos, progressDialog);
                    }
                }, 1000);
            }
        });


    }

    private void insertDataEngorda(ArrayList<Engorda_Model> ArrayEngorda2) {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("cargando...");
            progressDialog.show();
            progressDialog.setCanceledOnTouchOutside(false);

            Gson gson = new Gson();
            String inputString= gson.toJson(ArrayEngorda2);
            StringRequest request = new StringRequest(Request.Method.POST, "http://cmgs.gob.mx:86/Infra/saveEngorda.php",
            //StringRequest request = new StringRequest(Request.Method.POST, "https://erickburg98.000webhostapp.com/Infra/saveEngorda.php",
            //StringRequest request = new StringRequest(Request.Method.POST, "http://10.11.6.61/Infra/saveEngorda.php",
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            if(response.contains("Data Inserted")){
                                String Folios = "";

                                EngordaBD dbengorda2 = new EngordaBD(Enviar.this);
                                for(int i=0; i< ArrayEngorda2.size(); i++){
                                    Folios = ArrayEngorda2.get(i).getFolio();
                                    correctoEngorda = dbengorda2.editarEngorda(Folios, "1", "BANDERA");
                                    if(!correctoEngorda){
                                        Toast.makeText(Enviar.this, "Error al actualizar bandera! " + Folios, Toast.LENGTH_SHORT).show();
                                    }
                                }
                                Toast.makeText(Enviar.this, "Datos enviados correctamente! ", Toast.LENGTH_LONG).show();
                                progressDialog.dismiss();
                                startActivity(new Intent(getApplicationContext(),Enviar.class));
                                finish();
                            }
                            else{
                                Toast.makeText(Enviar.this, "Los datos no pudieron ser guardados! \n" + response.toString(), Toast.LENGTH_SHORT).show();
                                progressDialog.dismiss();
                            }
                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(Enviar.this, "Error en la conexion", Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                }
            }
            ){
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String,String> params = new HashMap<String,String>();
                    params.put("data1",inputString);
                    return params;
                }
            };
            requestQueue = Volley.newRequestQueue(Enviar.this);
            requestQueue.add(request);
    }

    private void insertDataPorcino(ArrayList<Porcino_Model> ArrayPorcino2) {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("cargando...");
        progressDialog.show();
        progressDialog.setCanceledOnTouchOutside(false);
        Gson gson = new Gson();
        String inputString= gson.toJson(ArrayPorcino2);
        StringRequest request = new StringRequest(Request.Method.POST, "http://cmgs.gob.mx:86/Infra/savePorcino.php",
        //StringRequest request = new StringRequest(Request.Method.POST, "https://erickburg98.000webhostapp.com/Infra/savePorcino.php",
                //StringRequest request = new StringRequest(Request.Method.POST, "http://10.11.6.61/Infra/savePorcino.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.contains("Data Inserted")){
                            String Folios = "";
                            PorcinoBD dbporcino2 = new PorcinoBD(Enviar.this);
                            for(int i=0; i< ArrayPorcino2.size(); i++){
                                Folios = ArrayPorcino2.get(i).getFolio();
                                correctoPorcino = dbporcino2.editarPorcino(Folios, "1", "BANDERA");
                                if(!correctoPorcino){
                                    Toast.makeText(Enviar.this, "Error al actualizar bandera! " + Folios, Toast.LENGTH_SHORT).show();
                                }
                            }
                            Toast.makeText(Enviar.this, "Datos enviados correctamente! ", Toast.LENGTH_LONG).show();
                            progressDialog.dismiss();
                            startActivity(new Intent(getApplicationContext(),Enviar.class));
                            finish();
                        }
                        else{
                            Toast.makeText(Enviar.this, "Los datos no pudieron ser guardados! \n" + response.toString(), Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Enviar.this, "Error en la conexion", Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String,String>();
                params.put("data1",inputString);
                return params;
            }
        };
        requestQueue = Volley.newRequestQueue(Enviar.this);
        requestQueue.add(request);
    }

    private void insertDataAve(ArrayList<Ave_Model> ArrayAve2) {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("cargando...");
        progressDialog.show();
        progressDialog.setCanceledOnTouchOutside(false);
        Gson gson = new Gson();
        String inputString= gson.toJson(ArrayAve2);
        StringRequest request = new StringRequest(Request.Method.POST, "http://cmgs.gob.mx:86/Infra/saveAve.php",
        //StringRequest request = new StringRequest(Request.Method.POST, "https://erickburg98.000webhostapp.com/Infra/saveAve.php",
                //StringRequest request = new StringRequest(Request.Method.POST, "http://10.11.6.61/Infra/saveAve.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.contains("Data Inserted")){
                            String Folios = "";
                            AveBD dbave2 = new AveBD(Enviar.this);
                            for(int i=0; i< ArrayAve2.size(); i++){
                                Folios = ArrayAve2.get(i).getFolio();
                                correctoAve = dbave2.editarAve(Folios, "1", "BANDERA");
                                if(!correctoAve){
                                    Toast.makeText(Enviar.this, "Error al actualizar bandera! " + Folios, Toast.LENGTH_SHORT).show();
                                }
                            }
                            Toast.makeText(Enviar.this, "Datos enviados correctamente ☺☻! ", Toast.LENGTH_LONG).show();
                            progressDialog.dismiss();
                            startActivity(new Intent(getApplicationContext(),Enviar.class));
                            finish();
                        }
                        else{
                            Toast.makeText(Enviar.this, "Los datos no pudieron ser guardados! \n" + response.toString(), Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Enviar.this, "Error en la conexion", Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String,String>();
                params.put("data1",inputString);
                return params;
            }
        };
        requestQueue = Volley.newRequestQueue(Enviar.this);
        requestQueue.add(request);
    }

    private void insertDataSacrificio(ArrayList<Sacrificio_model> ArraySacrificio2) {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("cargando...");
        progressDialog.show();
        progressDialog.setCanceledOnTouchOutside(false);
        Gson gson = new Gson();
        String inputString= gson.toJson(ArraySacrificio2);
        StringRequest request = new StringRequest(Request.Method.POST, "http://cmgs.gob.mx:86/Infra/saveSacrificio.php",
        //StringRequest request = new StringRequest(Request.Method.POST, "https://erickburg98.000webhostapp.com/Infra/saveSacrificio.php",
                //StringRequest request = new StringRequest(Request.Method.POST, "http://10.11.6.61/Infra/saveSacrificio.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.contains("Data Inserted")){
                            String Folios = "";
                            SacrificioBD dbsacrificio2 = new SacrificioBD(Enviar.this);
                            for(int i=0; i< ArraySacrificio2.size(); i++){
                                Folios = ArraySacrificio2.get(i).getFolio();
                                correctoSacrificio = dbsacrificio2.editarSacrificio(Folios, "1", "BANDERA");
                                if(!correctoSacrificio){
                                    Toast.makeText(Enviar.this, "Error al actualizar bandera! " + Folios, Toast.LENGTH_SHORT).show();
                                }
                            }
                            Toast.makeText(Enviar.this, "Datos enviados correctamente! ", Toast.LENGTH_LONG).show();
                            progressDialog.dismiss();
                            startActivity(new Intent(getApplicationContext(),Enviar.class));
                            finish();
                        }
                        else{
                            Toast.makeText(Enviar.this, "Los datos no pudieron ser guardados! \n" + response.toString(), Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Enviar.this, "Error en la conexion", Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String,String>();
                params.put("data1",inputString);
                return params;
            }
        };
        requestQueue = Volley.newRequestQueue(Enviar.this);
        requestQueue.add(request);
    }

    private void insertDataLecheros(ArrayList<Lecheros_Model> ArrayLechero2) {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("cargando...");
        progressDialog.show();
        progressDialog.setCanceledOnTouchOutside(false);
        Gson gson = new Gson();
        String inputString= gson.toJson(ArrayLechero2);
        StringRequest request = new StringRequest(Request.Method.POST, "http://cmgs.gob.mx:86/Infra/saveLecheros.php",
        //StringRequest request = new StringRequest(Request.Method.POST, "https://erickburg98.000webhostapp.com/Infra/saveLecheros.php",
                //StringRequest request = new StringRequest(Request.Method.POST, "http://10.11.6.61/Infra/saveLecheros.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.contains("Data Inserted")){
                            String Folios = "";
                            LecherosBD dblecheros2 = new LecherosBD(Enviar.this);
                            for(int i=0; i< ArrayLechero2.size(); i++){
                                Folios = ArrayLechero2.get(i).getFolio();
                                correctoLechero = dblecheros2.editarLecheros(Folios, "1", "BANDERA");
                                if(!correctoLechero){
                                    Toast.makeText(Enviar.this, "Error al actualizar bandera! " + Folios, Toast.LENGTH_SHORT).show();
                                }
                            }
                            Toast.makeText(Enviar.this, "Datos enviados correctamente! ", Toast.LENGTH_LONG).show();
                            progressDialog.dismiss();
                            startActivity(new Intent(getApplicationContext(),Enviar.class));
                            finish();
                        }
                        else{
                            Toast.makeText(Enviar.this, "Los datos no pudieron ser guardados! \n" + response.toString(), Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Enviar.this, "Error en la conexion", Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String,String>();
                params.put("data1",inputString);
                return params;
            }
        };
        requestQueue = Volley.newRequestQueue(Enviar.this);
        requestQueue.add(request);
    }

    //Funcion para convertir las fotos a Base64
    private String getStringImage(Bitmap bitmap){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG,100,baos);
        byte[] imageBytes = baos.toByteArray();
        return Base64.encodeToString(imageBytes,Base64.DEFAULT);
    }

    //Funcion para obtener fotos ya redimencionadas
    private Object setToImageView(Bitmap bitmap){
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG,100,bytes);
        Bitmap decoded = BitmapFactory.decodeStream(new ByteArrayInputStream(bytes.toByteArray()));
        return decoded;
    }

    //Funcion para redimencionar fotos
    private Object getResizeBitmap(Bitmap bitmap, int i){
        int width = bitmap.getWidth();
        int heigh = bitmap.getHeight();

        if(width <= i && heigh <= i){
            return bitmap;
        }

        float bitmapRatio = (float) width / (float) heigh;
        if(bitmapRatio > 1){
            width = i;
            heigh = (int) (width/bitmapRatio);
        }else{
            heigh = 1;
            width = (int) (heigh* bitmapRatio);
        }
        return Bitmap.createScaledBitmap(bitmap,width,heigh,true);
    }

    //Funcion para buscar las fotos en las carpetas
    private Object getImages(String typeproyect, String nombre){
        Bitmap finalImage = null;
        File archivo;

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            archivo = new File(getExternalFilesDir(null), "/" + typeproyect + "/" + nombre);
        }else{
            archivo = new File(getExternalFilesDir(null), "../../../../" + typeproyect + "/" + nombre);
        }

        String pathImage = archivo.getAbsolutePath();

        try{
            File file = new File(pathImage);
            Uri uri = Uri.fromFile(file);
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(
                    this.getContentResolver(),
                    uri
            );
            if (android.os.Build.VERSION.SDK_INT == Build.VERSION_CODES.P || android.os.Build.VERSION.SDK_INT == Build.VERSION_CODES.Q || android.os.Build.VERSION.SDK_INT == Build.VERSION_CODES.S){
                finalImage = (Bitmap) setToImageView(bitmap);
            }else{
                finalImage = (Bitmap) setToImageView((Bitmap) getResizeBitmap(bitmap, 1024));
            }


        } catch (IOException e){
            e.printStackTrace();
        }
        return finalImage;
    }


    private void insertPicturesEngorda(ArrayList<Engorda_Model> ArrayEngorda3, ProgressDialog progressDialog) {
        String foto1 = "";
        String foto2 = "";
        ArrayList<Engorda_Model> ArrayEngorda4 = ArrayEngorda3;

        for(int j=0; j< ArrayEngorda3.size(); j++){
            foto1 = getStringImage((Bitmap)getImages("CorralesdeEngorda", ArrayEngorda3.get(j).getF1()));
            foto2 = getStringImage((Bitmap)getImages("CorralesdeEngorda", ArrayEngorda3.get(j).getF2()));
            ArrayEngorda4.get(j).setLongitud(foto1);
            ArrayEngorda4.get(j).setLatitud(foto2);
        }

        Gson gson = new Gson();
        String inputString= gson.toJson(ArrayEngorda4);
        progressDialog.setProgress(80);
        StringRequest request = new StringRequest(Request.Method.POST, "http://cmgs.gob.mx:86/Infra/savePicturesEngorda.php",
        //StringRequest request = new StringRequest(Request.Method.POST, "https://erickburg98.000webhostapp.com/Infra/saveEngordaPictures.php",
        //StringRequest request = new StringRequest(Request.Method.POST, "http://10.11.6.61/Infra/savePicturesEngorda.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.contains("Pictures Inserted")){
                            String Folios = "";

                            EngordaBD dbengorda2 = new EngordaBD(Enviar.this);
                            for(int i=0; i< ArrayEngorda4.size(); i++){
                                Folios = ArrayEngorda4.get(i).getFolio();
                                correctoEngordaFotos = dbengorda2.editarEngorda(Folios, "1", "BANDERAFOTOS");
                                if(!correctoEngordaFotos){
                                    Toast.makeText(Enviar.this, "Error al actualizar bandera! " + Folios, Toast.LENGTH_SHORT).show();
                                }
                            }
                            progressDialog.setProgress(100);
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(Enviar.this, "Datos enviados correctamente! ", Toast.LENGTH_LONG).show();
                                    progressDialog.dismiss();
                                    startActivity(new Intent(getApplicationContext(),Enviar.class));
                                    finish();
                                }
                            }, 1000);

                        }
                        else{
                            Toast.makeText(Enviar.this, "Los datos no pudieron ser guardados! \n" + response.toString(), Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Enviar.this, "Error en la conexion", Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String,String>();
                params.put("data1",inputString);
                return params;
            }
        };
        requestQueue = Volley.newRequestQueue(Enviar.this);
        requestQueue.add(request);
    }

    private void insertPicturesAves(ArrayList<Ave_Model> ArrayAves3, ProgressDialog progressDialog) {
        String foto1 = "";
        String foto2 = "";
        ArrayList<Ave_Model> ArrayAves4 = ArrayAves3;

        for(int j=0; j< ArrayAves3.size(); j++){
            foto1 = getStringImage((Bitmap)getImages("GranjasdeAve", ArrayAves3.get(j).getF1()));
            foto2 = getStringImage((Bitmap)getImages("GranjasdeAve", ArrayAves3.get(j).getF2()));
            ArrayAves4.get(j).setLongitud(foto1);
            ArrayAves4.get(j).setLatitud(foto2);
        }

        Gson gson = new Gson();
        String inputString= gson.toJson(ArrayAves4);
        progressDialog.setProgress(80);
        StringRequest request = new StringRequest(Request.Method.POST, "http://cmgs.gob.mx:86/Infra/savePicturesAve.php",
        //StringRequest request = new StringRequest(Request.Method.POST, "https://erickburg98.000webhostapp.com/Infra/savePicturesAve.php",
                //StringRequest request = new StringRequest(Request.Method.POST, "http://10.11.6.61/Infra/savePicturesAve.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.contains("Pictures Inserted")){
                            String Folios = "";

                            AveBD dbave2 = new AveBD(Enviar.this);
                            for(int i=0; i< ArrayAves4.size(); i++){
                                Folios = ArrayAves4.get(i).getFolio();
                                correctoAvesFotos = dbave2.editarAve(Folios, "1", "BANDERAFOTOS");
                                if(!correctoAvesFotos){
                                    Toast.makeText(Enviar.this, "Error al actualizar bandera! " + Folios, Toast.LENGTH_SHORT).show();
                                }
                            }
                            progressDialog.setProgress(100);
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(Enviar.this, "Datos enviados correctamente! ", Toast.LENGTH_LONG).show();
                                    progressDialog.dismiss();
                                    startActivity(new Intent(getApplicationContext(),Enviar.class));
                                    finish();
                                }
                            }, 1000);

                        }
                        else{
                            Toast.makeText(Enviar.this, "Los datos no pudieron ser guardados! \n" + response.toString(), Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Enviar.this, "Error en la conexion", Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String,String>();
                params.put("data1",inputString);
                return params;
            }
        };
        requestQueue = Volley.newRequestQueue(Enviar.this);
        requestQueue.add(request);
    }

    private void insertPicturesPorcino(ArrayList<Porcino_Model> ArrayPorcino3, ProgressDialog progressDialog) {
        String foto1 = "";
        String foto2 = "";
        ArrayList<Porcino_Model> ArrayPorcino4 = ArrayPorcino3;

        for(int j=0; j< ArrayPorcino3.size(); j++){
            foto1 = getStringImage((Bitmap)getImages("GranjasdePorcino", ArrayPorcino3.get(j).getF1()));
            foto2 = getStringImage((Bitmap)getImages("GranjasdePorcino", ArrayPorcino3.get(j).getF2()));
            ArrayPorcino4.get(j).setLongitud(foto1);
            ArrayPorcino4.get(j).setLatitud(foto2);
        }

        Gson gson = new Gson();
        String inputString= gson.toJson(ArrayPorcino4);
        progressDialog.setProgress(80);
        StringRequest request = new StringRequest(Request.Method.POST, "http://cmgs.gob.mx:86/Infra/savePicturesPorcino.php",
        //StringRequest request = new StringRequest(Request.Method.POST, "https://erickburg98.000webhostapp.com/Infra/savePicturesPorcino.php",
        //StringRequest request = new StringRequest(Request.Method.POST, "http://10.11.6.61/Infra/savePicturesPorcino.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.contains("Pictures Inserted")){
                            String Folios = "";

                            PorcinoBD dbporcino2 = new PorcinoBD(Enviar.this);
                            for(int i=0; i< ArrayPorcino4.size(); i++){
                                Folios = ArrayPorcino4.get(i).getFolio();
                                correctoPorcinoFotos = dbporcino2.editarPorcino(Folios, "1", "BANDERAFOTOS");
                                if(!correctoPorcinoFotos){
                                    Toast.makeText(Enviar.this, "Error al actualizar bandera! " + Folios, Toast.LENGTH_SHORT).show();
                                }
                            }
                            progressDialog.setProgress(100);
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(Enviar.this, "Datos enviados correctamente! ", Toast.LENGTH_LONG).show();
                                    progressDialog.dismiss();
                                    startActivity(new Intent(getApplicationContext(),Enviar.class));
                                    finish();
                                }
                            }, 1000);

                        }
                        else{
                            Toast.makeText(Enviar.this, "Los datos no pudieron ser guardados! \n" + response.toString(), Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Enviar.this, "Error en la conexion", Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String,String>();
                params.put("data1",inputString);
                return params;
            }
        };
        requestQueue = Volley.newRequestQueue(Enviar.this);
        requestQueue.add(request);
    }

    private void insertPicturesSacrificio(ArrayList<Sacrificio_model> ArraySacrificio3, ProgressDialog progressDialog) {
        String foto1 = "";
        String foto2 = "";
        ArrayList<Sacrificio_model> ArraySacrificio4 = ArraySacrificio3;

        for(int j=0; j< ArraySacrificio3.size(); j++){
            foto1 = getStringImage((Bitmap)getImages("CentrosdeSacrificio", ArraySacrificio3.get(j).getFoto1()));
            foto2 = getStringImage((Bitmap)getImages("CentrosdeSacrificio", ArraySacrificio3.get(j).getFoto2()));
            ArraySacrificio4.get(j).setLongitud(foto1);
            ArraySacrificio4.get(j).setLatitud(foto2);
        }

        Gson gson = new Gson();
        String inputString= gson.toJson(ArraySacrificio4);
        progressDialog.setProgress(80);
        StringRequest request = new StringRequest(Request.Method.POST, "http://cmgs.gob.mx:86/Infra/savePicturesSacrificio.php",
        //StringRequest request = new StringRequest(Request.Method.POST, "https://erickburg98.000webhostapp.com/Infra/savePicturesSacrificio.php",
                //StringRequest request = new StringRequest(Request.Method.POST, "http://10.11.6.61/Infra/savePicturesSacrificio.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.contains("Pictures Inserted")){
                            String Folios = "";

                            SacrificioBD dbsacrificio2 = new SacrificioBD(Enviar.this);
                            for(int i=0; i< ArraySacrificio4.size(); i++){
                                Folios = ArraySacrificio4.get(i).getFolio();
                                correctoSacrificioFotos = dbsacrificio2.editarSacrificio(Folios, "1", "BANDERAFOTOS");
                                if(!correctoSacrificioFotos){
                                    Toast.makeText(Enviar.this, "Error al actualizar bandera! " + Folios, Toast.LENGTH_SHORT).show();
                                }
                            }
                            progressDialog.setProgress(100);
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(Enviar.this, "Datos enviados correctamente! ", Toast.LENGTH_LONG).show();
                                    progressDialog.dismiss();
                                    startActivity(new Intent(getApplicationContext(),Enviar.class));
                                    finish();
                                }
                            }, 1000);

                        }
                        else{
                            Toast.makeText(Enviar.this, "Los datos no pudieron ser guardados! \n" + response.toString(), Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Enviar.this, "Error en la conexion", Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String,String>();
                params.put("data1",inputString);
                return params;
            }
        };
        requestQueue = Volley.newRequestQueue(Enviar.this);
        requestQueue.add(request);
    }

    private void insertPicturesLecheros(ArrayList<Lecheros_Model> ArrayLechero3, ProgressDialog progressDialog) {
        String foto1 = "";
        String foto2 = "";
        ArrayList<Lecheros_Model> ArrayLechero4 = ArrayLechero3;

        for(int j=0; j< ArrayLechero3.size(); j++){
            foto1 = getStringImage((Bitmap)getImages("EstablosLecheros", ArrayLechero3.get(j).getFoto1()));
            foto2 = getStringImage((Bitmap)getImages("EstablosLecheros", ArrayLechero3.get(j).getFoto2()));
            ArrayLechero4.get(j).setLongitud(foto1);
            ArrayLechero4.get(j).setLatitud(foto2);
        }

        Gson gson = new Gson();
        String inputString= gson.toJson(ArrayLechero4);
        progressDialog.setProgress(80);
        StringRequest request = new StringRequest(Request.Method.POST, "http://cmgs.gob.mx:86/Infra/savePicturesLecheros.php",
        //StringRequest request = new StringRequest(Request.Method.POST, "https://erickburg98.000webhostapp.com/Infra/savePicturesLecheros.php",
                //StringRequest request = new StringRequest(Request.Method.POST, "http://10.11.6.61/Infra/savePicturesLecheros.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.contains("Pictures Inserted")){
                            String Folios = "";

                            LecherosBD dblecheros2 = new LecherosBD(Enviar.this);
                            for(int i=0; i< ArrayLechero4.size(); i++){
                                Folios = ArrayLechero4.get(i).getFolio();
                                correctoLecheroFotos = dblecheros2.editarLecheros(Folios, "1", "BANDERAFOTOS");
                                if(!correctoLecheroFotos){
                                    Toast.makeText(Enviar.this, "Error al actualizar bandera! " + Folios, Toast.LENGTH_SHORT).show();
                                }
                            }
                            progressDialog.setProgress(100);
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(Enviar.this, "Datos enviados correctamente! ", Toast.LENGTH_LONG).show();
                                    progressDialog.dismiss();
                                    startActivity(new Intent(getApplicationContext(),Enviar.class));
                                    finish();
                                }
                            }, 1000);

                        }
                        else{
                            Toast.makeText(Enviar.this, "Los datos no pudieron ser guardados! \n" + response.toString(), Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Enviar.this, "Error en la conexion", Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String,String>();
                params.put("data1",inputString);
                return params;
            }
        };
        requestQueue = Volley.newRequestQueue(Enviar.this);
        requestQueue.add(request);
    }

}