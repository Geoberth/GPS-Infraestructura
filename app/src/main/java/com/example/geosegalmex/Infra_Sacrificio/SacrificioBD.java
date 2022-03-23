package com.example.geosegalmex.Infra_Sacrificio;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import com.example.geosegalmex.General;
import com.example.geosegalmex.Gps.UtilidadesTrayectoria;


public class SacrificioBD extends SQLiteOpenHelper {

    public static final String DB_NAME = "CentrosdeSacrificio";
    public static final int DB_VERSION = 2;

    public SacrificioBD(Context context) {super(context, DB_NAME, null, DB_VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Sacrificio_bd.CREAR_TABLA_SACRIFICO);
        db.execSQL(UtilidadesTrayectoria.CREAR_TABLA_TRAYECTORIA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "+ Sacrificio_bd.TABLA_BD);
        db.execSQL("DROP TABLE IF EXISTS "+ UtilidadesTrayectoria.TABLA_TRAYECTORIA);
        onCreate(db);

    }


    public boolean addSacrificio(Sacrificio_model model){
        SQLiteDatabase db           = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Sacrificio_bd.COLUMN_FOLIO, model.getFolio());
        contentValues.put(Sacrificio_bd.COLUMN_FECHA, model.getFecha());
        contentValues.put(Sacrificio_bd.COLUMN_CVEENTIDAD, model.getCveEntidad());
        contentValues.put(Sacrificio_bd.COLUMN_ENTIDAD, model.getEntidad());
        contentValues.put(Sacrificio_bd.COLUMN_CVEDELEGACION, model.getCvedelegacion());
        contentValues.put(Sacrificio_bd.COLUMN_DELEGACION, model.getDelegacion());
        contentValues.put(Sacrificio_bd.COLUMN_CVEDDR, model.getCveDdr());
        contentValues.put(Sacrificio_bd.COLUMN_DDR, model.getDdr());
        contentValues.put(Sacrificio_bd.COLUMN_CVECADER, model.getCveCader());
        contentValues.put(Sacrificio_bd.COLUMN_CADER, model.getCader());
        contentValues.put(Sacrificio_bd.COLUMN_CVEMUNICIPIO, model.getCveMunicipio());
        contentValues.put(Sacrificio_bd.COLUMN_MUNICIPIO, model.getMunicipio());
        contentValues.put(Sacrificio_bd.COLUMN_CVELOCALIDAD, model.getCveLocalidad());
        contentValues.put(Sacrificio_bd.COLUMN_LOCALIDAD, model.getLocalidad());
        contentValues.put(Sacrificio_bd.COLUMN_TIPORASTRO, model.getTiporastro());
        contentValues.put(Sacrificio_bd.COLUMN_RASTRO, model.getRastro());
        contentValues.put(Sacrificio_bd.COLUMN_ESTATUS_RASTRO, model.getEstatus_rastro());
        contentValues.put(Sacrificio_bd.COLUMN_TURNO, model.getTurno());
        contentValues.put(Sacrificio_bd.COLUMN_CIMEQUINO, model.getCIMequino());
        contentValues.put(Sacrificio_bd.COLUMN_CIMBOVINO, model.getCIMbovino());
        contentValues.put(Sacrificio_bd.COLUMN_CIMPORCINO, model.getCIMporcino());
        contentValues.put(Sacrificio_bd.COLUMN_CIMOVINO, model.getCIMovino());
        contentValues.put(Sacrificio_bd.COLUMN_CIMCAPRINO, model.getCIMcaprino());
        contentValues.put(Sacrificio_bd.COLUMN_CIMAVE, model.getCIMave());
        contentValues.put(Sacrificio_bd.COLUMN_CUMEQUINO, model.getCUMequino());
        contentValues.put(Sacrificio_bd.COLUMN_CUMBOVINO, model.getCUMbovino());
        contentValues.put(Sacrificio_bd.COLUMN_CUMPORCINO, model.getCUMporcino());
        contentValues.put(Sacrificio_bd.COLUMN_CIMOVINO, model.getCUMovino());
        contentValues.put(Sacrificio_bd.COLUMN_CUMCAPRINO, model.getCUMcaprino());
        contentValues.put(Sacrificio_bd.COLUMN_CUMAVE, model.getCUMave());
        contentValues.put(Sacrificio_bd.COLUMN_OBSERVACIONES, model.getObservaciones());
        contentValues.put(Sacrificio_bd.COLUMN_LONGITUD, model.getLongitud());
        contentValues.put(Sacrificio_bd.COLUMN_LATITUD, model.getLatitud());
        contentValues.put(Sacrificio_bd.COLUMN_FOTO1, model.getFoto1());
        contentValues.put(Sacrificio_bd.COLUMN_FOTO2, model.getFoto2());
        long result = db.insert(Sacrificio_bd.TABLA_BD, null, contentValues);
        db.close();

        if(result == -1) {
            return false;
        }else{
            return true;
        }
    }
    public void deleteSacrificio(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS "+ Sacrificio_bd.TABLA_BD);
        db.execSQL("DROP TABLE IF EXISTS "+ UtilidadesTrayectoria.TABLA_TRAYECTORIA);
        onCreate(db);
        if (android.os.Build.VERSION.SDK_INT == Build.VERSION_CODES.P){
            db.close();
        }
    }
    public boolean addTrayectoriaS(String folioPro, String folioBrig, String longGpsSave, String latiGpsSave, String horaActl, String fechaActl){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        //contentValues.put(UtilidadesTrayectoria.COLUMN_FOLIO,folioPro);
        contentValues.put(UtilidadesTrayectoria.COLUMN_FOLIO, General.Foliocuestion);
        //contentValues.put(UtilidadesTrayectoria.COLUMN_FOLIO_TECNICO,Principal.userId);
        contentValues.put(UtilidadesTrayectoria.COLUMN_LONGITUD_TRAY,latiGpsSave);
        contentValues.put(UtilidadesTrayectoria.COLUMN_LATITUD_TRAY,longGpsSave);
        contentValues.put(UtilidadesTrayectoria.COLUMN_HRACTUAL_TRAY,horaActl);
        contentValues.put(UtilidadesTrayectoria.COLUMN_FCACTUAL_TRAY,fechaActl);

        long result = db.insert(UtilidadesTrayectoria.TABLA_TRAYECTORIA, null, contentValues);
        db.close();
        if(result == -1) {
            return false;
        }else{
            return true;
        }
    }

}