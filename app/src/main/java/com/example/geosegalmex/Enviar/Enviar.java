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
import com.example.geosegalmex.Infra_Porcino.PorcinoBD;
import com.example.geosegalmex.Infra_Porcino.Porcino_Model;
import com.example.geosegalmex.R;
import com.google.gson.Gson;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Enviar extends AppCompatActivity {

    TextView ids, tvengorda, tvporcino, tvaves;
    Button btnEngorda, btnPorcino, btnaves;

    boolean correctoEngorda = false;
    ArrayList<Engorda_Model> ArrayEngorda = new ArrayList<>();

    boolean correctoPorcino = false;
    ArrayList<Porcino_Model> ArrayPorcino= new ArrayList<>();

    boolean correctoAve = false;
    ArrayList<Ave_Model> ArrayAve= new ArrayList<>();

    RequestQueue requestQueue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar);

        tvengorda = (TextView)findViewById(R.id.enviar2);
        btnEngorda = (Button)findViewById(R.id.button1);
        tvporcino = (TextView)findViewById(R.id.enviar5);
        btnPorcino = (Button)findViewById(R.id.button2);
        tvaves = (TextView)findViewById(R.id.enviar8);
        btnaves = (Button)findViewById(R.id.button3);

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
        //Evento click enviar Engorda
        btnPorcino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertDataPorcino(ArrayPorcino);
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
        //Evento click enviar Engorda
        btnaves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertDataAve(ArrayAve);
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
            StringRequest request = new StringRequest(Request.Method.POST, "https://erickburg98.000webhostapp.com/Infra/saveEngorda.php",
            //StringRequest request = new StringRequest(Request.Method.POST, "http://10.11.6.61/Infra/saveEngorda.php",
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            if(response.contains("Data Inserted")){
                                String Folios = "";
                                EngordaBD dbengorda2 = new EngordaBD(Enviar.this);
                                for(int i=0; i< ArrayEngorda2.size(); i++){
                                    Folios = ArrayEngorda2.get(i).getFolio();
                                    correctoEngorda = dbengorda2.editarEngorda(Folios, "1");
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
        StringRequest request = new StringRequest(Request.Method.POST, "https://erickburg98.000webhostapp.com/Infra/savePorcino.php",
                //StringRequest request = new StringRequest(Request.Method.POST, "http://10.11.6.61/Infra/savePorcino.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.contains("Data Inserted")){
                            String Folios = "";
                            PorcinoBD dbporcino2 = new PorcinoBD(Enviar.this);
                            for(int i=0; i< ArrayPorcino2.size(); i++){
                                Folios = ArrayPorcino2.get(i).getFolio();
                                correctoPorcino = dbporcino2.editarPorcino(Folios, "1");
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
        String inputString= gson.toJson(ArrayAve);
        StringRequest request = new StringRequest(Request.Method.POST, "https://erickburg98.000webhostapp.com/Infra/saveAve.php",
                //StringRequest request = new StringRequest(Request.Method.POST, "http://10.11.6.61/Infra/saveAve.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.contains("Data Inserted")){
                            String Folios = "";
                            AveBD dbave2 = new AveBD(Enviar.this);
                            for(int i=0; i< ArrayAve.size(); i++){
                                Folios = ArrayAve.get(i).getFolio();
                                correctoAve = dbave2.editarAve(Folios, "1");
                                if(!correctoAve){
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

}