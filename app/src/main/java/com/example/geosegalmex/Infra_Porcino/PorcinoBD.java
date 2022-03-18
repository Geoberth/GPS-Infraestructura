package com.example.geosegalmex.Infra_Porcino;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import com.example.geosegalmex.General;
import com.example.geosegalmex.Gps.UtilidadesTrayectoria;

public class PorcinoBD extends SQLiteOpenHelper {

    public static final String DB_NAME  = "GranjasdePorcino";
    public static final int DB_VERSION = 1;

    public PorcinoBD(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Porcino_bd.CREAR_TABLA_PORCINO);
        db.execSQL(UtilidadesTrayectoria.CREAR_TABLA_TRAYECTORIA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ Porcino_bd.TABLA_BD);
        db.execSQL("DROP TABLE IF EXISTS "+ UtilidadesTrayectoria.TABLA_TRAYECTORIA);
        onCreate(db);
    }

    public boolean addPorcino(Porcino_Model model){

        SQLiteDatabase db           = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Porcino_bd.COLUMN_FOLIO, model.getFolio());
        contentValues.put(Porcino_bd.COLUMN_CVEENTIDAD, model.getCveEntidad());
        contentValues.put(Porcino_bd.COLUMN_ENTIDAD, model.getEntidad());
        contentValues.put(Porcino_bd.COLUMN_CVEREPRESENTACION, model.getCveRepresentacion());
        contentValues.put(Porcino_bd.COLUMN_REPRESENTACION, model.getRepresentacion());
        contentValues.put(Porcino_bd.COLUMN_CVEDDR, model.getCveDdr());
        contentValues.put(Porcino_bd.COLUMN_DDR, model.getDdr());
        contentValues.put(Porcino_bd.COLUMN_CVECADER, model.getCveCader());
        contentValues.put(Porcino_bd.COLUMN_CADER, model.getCader());
        contentValues.put(Porcino_bd.COLUMN_CVEMUNICIPIO, model.getCveMunicipio());
        contentValues.put(Porcino_bd.COLUMN_MUNICIPIO, model.getMunicipio());
        contentValues.put(Porcino_bd.COLUMN_CVELOCALIDAD, model.getCveLocalidad());
        contentValues.put(Porcino_bd.COLUMN_LOC, model.getLoc());
        contentValues.put(Porcino_bd.COLUMN_DOMUPP, model.getDomUpp());
        contentValues.put(Porcino_bd.COLUMN_NOMUPP, model.getNomUpp());
        contentValues.put(Porcino_bd.COLUMN_ESTATUS, model.getEstatus());
        contentValues.put(Porcino_bd.COLUMN_SISTEMA, model.getSistema());
        contentValues.put(Porcino_bd.COLUMN_ACTIVIDAD, model.getActividad());
        contentValues.put(Porcino_bd.COLUMN_NUMVIENTRES, model.getNumVientres());
        contentValues.put(Porcino_bd.COLUMN_NUMLECHONES, model.getNumLechones());
        contentValues.put(Porcino_bd.COLUMN_NUMCRECIMIENTO, model.getNumCrecimiento());
        contentValues.put(Porcino_bd.COLUMN_NUMFINALIZACION, model.getNumFinalizacion());
        contentValues.put(Porcino_bd.COLUMN_NUMSEMENTALES, model.getNumSementales());
        contentValues.put(Porcino_bd.COLUMN_CAPINST, model.getCapInst());
        contentValues.put(Porcino_bd.COLUMN_CAPUTIL, model.getCapUtil());
        contentValues.put(Porcino_bd.COLUMN_TOTALANIM, model.getTotalAnim());
        contentValues.put(Porcino_bd.COLUMN_RAZA, model.getRaza());
        contentValues.put(Porcino_bd.COLUMN_RAZACRUZA, model.getRazaCruza());
        contentValues.put(Porcino_bd.COLUMN_RAZAOTRA, model.getRazaOtra());
        contentValues.put(Porcino_bd.COLUMN_SUPERF, model.getSuperf());
        contentValues.put(Porcino_bd.COLUMN_OBSERV, model.getObserv());
        contentValues.put(Porcino_bd.COLUMN_LONGITUD, model.getLongitud());
        contentValues.put(Porcino_bd.COLUMN_LATITUD, model.getLatitud());
        contentValues.put(Porcino_bd.COLUMN_F1, model.getF1());
        contentValues.put(Porcino_bd.COLUMN_F2, model.getF2());

        long result = db.insert(Porcino_bd.TABLA_BD, null, contentValues);
        db.close();

        if(result == -1) {
            return false;
        }else{
            return true;
        }

    }

    public void deletePorcino(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS "+ Porcino_bd.TABLA_BD);
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
