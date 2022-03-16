package com.example.geosegalmex.Infra_Engorda;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import com.example.geosegalmex.General;
import com.example.geosegalmex.Gps.UtilidadesTrayectoria;

public class EngordaBD extends SQLiteOpenHelper  {

    public static final String DB_NAME  = "CorralesdeEngorda";
    public static final int DB_VERSION = 2;

    public EngordaBD(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Engorda_bd.CREAR_TABLA_ENGORDA);
        db.execSQL(UtilidadesTrayectoria.CREAR_TABLA_TRAYECTORIA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ Engorda_bd.TABLA_BD);
        db.execSQL("DROP TABLE IF EXISTS "+ UtilidadesTrayectoria.TABLA_TRAYECTORIA);
        onCreate(db);
    }

    public boolean addEngorda(Engorda_Model model){

        SQLiteDatabase db           = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Engorda_bd.COLUMN_FOLIO, model.getFolio());
        contentValues.put(Engorda_bd.COLUMN_CVEENTIDAD, model.getCveEntidad());
        contentValues.put(Engorda_bd.COLUMN_ENTIDAD, model.getEntidad());
        contentValues.put(Engorda_bd.COLUMN_CVEREPRESENTACION, model.getCveRepresentacion());
        contentValues.put(Engorda_bd.COLUMN_REPRESENTACION, model.getRepresentacion());
        contentValues.put(Engorda_bd.COLUMN_CVEDDR, model.getCveDdr());
        contentValues.put(Engorda_bd.COLUMN_DDR, model.getDdr());
        contentValues.put(Engorda_bd.COLUMN_CVECADER, model.getCveCader());
        contentValues.put(Engorda_bd.COLUMN_CADER, model.getCader());
        contentValues.put(Engorda_bd.COLUMN_CVEMUNICIPIO, model.getCveMunicipio());
        contentValues.put(Engorda_bd.COLUMN_MUNICIPIO, model.getMunicipio());
        contentValues.put(Engorda_bd.COLUMN_CVELOCALIDAD, model.getCveLocalidad());
        contentValues.put(Engorda_bd.COLUMN_LOC, model.getLoc());
        contentValues.put(Engorda_bd.COLUMN_DOMUPP, model.getDomUpp());
        contentValues.put(Engorda_bd.COLUMN_NOMUPP, model.getNomUpp());
        contentValues.put(Engorda_bd.COLUMN_ESTATUS, model.getEstatus());
        contentValues.put(Engorda_bd.COLUMN_SISTEMA, model.getSistema());
        contentValues.put(Engorda_bd.COLUMN_ACTIVIDAD, model.getActividad());
        contentValues.put(Engorda_bd.COLUMN_RAZA, model.getRaza());
        contentValues.put(Engorda_bd.COLUMN_RAZACRUZA, model.getRazaCruza());
        contentValues.put(Engorda_bd.COLUMN_RAZAOTRA, model.getRazaOtra());
        contentValues.put(Engorda_bd.COLUMN_CAPINST, model.getCapInst());
        contentValues.put(Engorda_bd.COLUMN_CAPUTIL, model.getCapUtil());
        contentValues.put(Engorda_bd.COLUMN_TOTALANIM, model.getTotalAnim());
        contentValues.put(Engorda_bd.COLUMN_ENGORDA, model.getEngorda());
        contentValues.put(Engorda_bd.COLUMN_SUPERF, model.getSuperf());
        contentValues.put(Engorda_bd.COLUMN_OBSERV, model.getObserv());
        contentValues.put(Engorda_bd.COLUMN_LONGITUD, model.getLongitud());
        contentValues.put(Engorda_bd.COLUMN_LATITUD, model.getLatitud());
        contentValues.put(Engorda_bd.COLUMN_F1, model.getF1());
        contentValues.put(Engorda_bd.COLUMN_F2, model.getF2());

        long result = db.insert(Engorda_bd.TABLA_BD, null, contentValues);
        db.close();

        if(result == -1) {
            return false;
        }else{
            return true;
        }

    }

    public void deleteEngorda(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS "+ Engorda_bd.TABLA_BD);
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
