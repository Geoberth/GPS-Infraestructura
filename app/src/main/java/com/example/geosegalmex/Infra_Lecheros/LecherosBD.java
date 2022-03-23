package com.example.geosegalmex.Infra_Lecheros;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import com.example.geosegalmex.General;
import com.example.geosegalmex.Gps.UtilidadesTrayectoria;
import com.example.geosegalmex.Infra_Sacrificio.Sacrificio_bd;
import com.example.geosegalmex.Infra_Sacrificio.Sacrificio_model;

public class LecherosBD extends SQLiteOpenHelper {

    public static final String DB_NAME = "EstablosLecheros";
    public static final int DB_VERSION = 2;

    public LecherosBD(Context context) {super(context, DB_NAME, null, DB_VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Lecheros_bd.CREAR_TABLA_LECHEROS);
        db.execSQL(UtilidadesTrayectoria.CREAR_TABLA_TRAYECTORIA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "+ Sacrificio_bd.TABLA_BD);
        db.execSQL("DROP TABLE IF EXISTS "+ UtilidadesTrayectoria.TABLA_TRAYECTORIA);
        onCreate(db);

    }

    public boolean addLecheros(Lecheros_Model model){
        SQLiteDatabase db           = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Lecheros_bd.COLUMN_FOLIO, model.getFolio());
        contentValues.put(Lecheros_bd.COLUMN_FECHA, model.getFecha());
        contentValues.put(Lecheros_bd.COLUMN_CVEENTIDAD, model.getCveEntidad());
        contentValues.put(Lecheros_bd.COLUMN_ENTIDAD, model.getEntidad());
        contentValues.put(Lecheros_bd.COLUMN_CVEDELEGACION, model.getCvedelegacion());
        contentValues.put(Lecheros_bd.COLUMN_DELEGACION, model.getDelegacion());
        contentValues.put(Lecheros_bd.COLUMN_CVEDDR, model.getCveDdr());
        contentValues.put(Lecheros_bd.COLUMN_DDR, model.getDdr());
        contentValues.put(Lecheros_bd.COLUMN_CVECADER, model.getCveCader());
        contentValues.put(Lecheros_bd.COLUMN_CADER, model.getCader());
        contentValues.put(Lecheros_bd.COLUMN_CVEMUNICIPIO, model.getCveMunicipio());
        contentValues.put(Lecheros_bd.COLUMN_MUNICIPIO, model.getMunicipio());
        contentValues.put(Lecheros_bd.COLUMN_CVELOCALIDAD, model.getCveLocalidad());
        contentValues.put(Lecheros_bd.COLUMN_LOCALIDAD, model.getLocalidad());
        contentValues.put(Lecheros_bd.COLUMN_DOMIUPP, model.getDomiupp());
        contentValues.put(Lecheros_bd.COLUMN_NOMBREUPP, model.getNombreupp());
        contentValues.put(Lecheros_bd.COLUMN_ESTATUS, model.getNombreupp());
        contentValues.put(Lecheros_bd.COLUMN_NUMEROVACAS, model.getNumerovacas());
        contentValues.put(Lecheros_bd.COLUMN_NUMEROVAQUI, model.getNumerovaqui());
        contentValues.put(Lecheros_bd.COLUMN_RAZA, model.getRaza());
        contentValues.put(Lecheros_bd.COLUMN_CRUZA, model.getCruza());
        contentValues.put(Lecheros_bd.COLUMN_OTRARAZA, model.getOtraraza());
        contentValues.put(Lecheros_bd.COLUMN_TIPOORDENA, model.getTipoordena());
        contentValues.put(Lecheros_bd.COLUMN_SUPERFICIE, model.getSuperficie());
        contentValues.put(Lecheros_bd.COLUMN_OBSERVACIONES, model.getObservaciones());
        contentValues.put(Lecheros_bd.COLUMN_LONGITUD, model.getLongitud());
        contentValues.put(Lecheros_bd.COLUMN_LATITUD, model.getLatitud());
        contentValues.put(Lecheros_bd.COLUMN_FOTO1, model.getLatitud());
        contentValues.put(Lecheros_bd.COLUMN_FOTO2, model.getFoto2());
        long result = db.insert(Sacrificio_bd.TABLA_BD, null, contentValues);
        db.close();

        if(result == -1) {
            return false;
        }else{
            return true;
        }
    }
    public void deleteLecheros(){
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
