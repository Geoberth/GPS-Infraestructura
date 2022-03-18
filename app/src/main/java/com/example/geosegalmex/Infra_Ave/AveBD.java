package com.example.geosegalmex.Infra_Ave;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import com.example.geosegalmex.General;
import com.example.geosegalmex.Gps.UtilidadesTrayectoria;

public class AveBD extends SQLiteOpenHelper {

    public static final String DB_NAME  = "GranjasdeAve";
    public static final int DB_VERSION = 1;

    public AveBD(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Ave_bd.CREAR_TABLA_AVE);
        db.execSQL(UtilidadesTrayectoria.CREAR_TABLA_TRAYECTORIA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ Ave_bd.TABLA_BD);
        db.execSQL("DROP TABLE IF EXISTS "+ UtilidadesTrayectoria.TABLA_TRAYECTORIA);
        onCreate(db);
    }

    public boolean addAve(Ave_Model model){

        SQLiteDatabase db           = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Ave_bd.COLUMN_FOLIO, model.getFolio());
        contentValues.put(Ave_bd.COLUMN_CVEENTIDAD, model.getCveEntidad());
        contentValues.put(Ave_bd.COLUMN_ENTIDAD, model.getEntidad());
        contentValues.put(Ave_bd.COLUMN_CVEREPRESENTACION, model.getCveRepresentacion());
        contentValues.put(Ave_bd.COLUMN_REPRESENTACION, model.getRepresentacion());
        contentValues.put(Ave_bd.COLUMN_CVEDDR, model.getCveDdr());
        contentValues.put(Ave_bd.COLUMN_DDR, model.getDdr());
        contentValues.put(Ave_bd.COLUMN_CVECADER, model.getCveCader());
        contentValues.put(Ave_bd.COLUMN_CADER, model.getCader());
        contentValues.put(Ave_bd.COLUMN_CVEMUNICIPIO, model.getCveMunicipio());
        contentValues.put(Ave_bd.COLUMN_MUNICIPIO, model.getMunicipio());
        contentValues.put(Ave_bd.COLUMN_CVELOCALIDAD, model.getCveLocalidad());
        contentValues.put(Ave_bd.COLUMN_LOC, model.getLoc());
        contentValues.put(Ave_bd.COLUMN_DOMUPP, model.getDomUpp());
        contentValues.put(Ave_bd.COLUMN_NOMUPP, model.getNomUpp());
        contentValues.put(Ave_bd.COLUMN_ESTATUS, model.getEstatus());
        contentValues.put(Ave_bd.COLUMN_SISTEMA, model.getSistema());
        contentValues.put(Ave_bd.COLUMN_ESPECIE, model.getEspecie());
        contentValues.put(Ave_bd.COLUMN_CAPINST, model.getCapInst());
        contentValues.put(Ave_bd.COLUMN_CAPUTIL, model.getCapUtil());
        contentValues.put(Ave_bd.COLUMN_TOTALANIM, model.getTotalAnim());
        contentValues.put(Ave_bd.COLUMN_NUMNAVES, model.getNumNaves());
        contentValues.put(Ave_bd.COLUMN_SUPERF, model.getSuperf());
        contentValues.put(Ave_bd.COLUMN_OBSERV, model.getObserv());
        contentValues.put(Ave_bd.COLUMN_LONGITUD, model.getLongitud());
        contentValues.put(Ave_bd.COLUMN_LATITUD, model.getLatitud());
        contentValues.put(Ave_bd.COLUMN_F1, model.getF1());
        contentValues.put(Ave_bd.COLUMN_F2, model.getF2());

        long result = db.insert(Ave_bd.TABLA_BD, null, contentValues);
        db.close();

        if(result == -1) {
            return false;
        }else{
            return true;
        }

    }

    public void deleteAve(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS "+ Ave_bd.TABLA_BD);
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
