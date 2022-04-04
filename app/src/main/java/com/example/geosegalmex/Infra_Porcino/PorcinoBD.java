package com.example.geosegalmex.Infra_Porcino;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import com.example.geosegalmex.General;
import com.example.geosegalmex.Gps.UtilidadesTrayectoria;

import java.util.ArrayList;

public class PorcinoBD extends SQLiteOpenHelper {

    public static final String DB_NAME  = "GranjasdePorcino";
    public static final int DB_VERSION = 2;

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
        contentValues.put(Porcino_bd.COLUMN_FECHA, model.getFecha());
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
        contentValues.put(Porcino_bd.COLUMN_BANDERA, model.getBandera());

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

    public ArrayList<Porcino_Model> mostrarPorcino() {
        try {
            SQLiteDatabase bd = this.getReadableDatabase();
            ArrayList<Porcino_Model> lista = new ArrayList<>();

            Cursor filas = bd.rawQuery("SELECT DISTINCT * FROM " + Porcino_bd.TABLA_BD + " WHERE " + Porcino_bd.COLUMN_BANDERA + " = 0 ORDER BY " + Porcino_bd.COLUMN_FOLIO + " ASC", null);
            if (filas.moveToFirst()) {

                do{
                    Porcino_Model cat = new Porcino_Model();
                    cat.setFolio(filas.getString(0));
                    cat.setFecha(filas.getString(1));
                    cat.setCveEntidad(filas.getString(2));
                    cat.setEntidad(filas.getString(3));
                    cat.setCveRepresentacion(filas.getString(4));
                    cat.setRepresentacion(filas.getString(5));
                    cat.setCveDdr(filas.getString(6));
                    cat.setDdr(filas.getString(7));
                    cat.setCveCader(filas.getString(8));
                    cat.setCader(filas.getString(9));
                    cat.setCveMunicipio(filas.getString(10));
                    cat.setMunicipio(filas.getString(11));
                    cat.setCveLocalidad(filas.getString(12));
                    cat.setLoc(filas.getString(13));
                    cat.setDomUpp(filas.getString(14));
                    cat.setNomUpp(filas.getString(15));
                    cat.setEstatus(filas.getString(16));
                    cat.setSistema(filas.getString(17));
                    cat.setActividad(filas.getString(18));
                    cat.setNumVientres(filas.getString(19));
                    cat.setNumLechones(filas.getString(20));
                    cat.setNumCrecimiento(filas.getString(21));
                    cat.setNumFinalizacion(filas.getString(22));
                    cat.setNumSementales(filas.getString(23));
                    cat.setCapInst(filas.getString(24));
                    cat.setCapUtil(filas.getString(25));
                    cat.setTotalAnim(filas.getString(26));
                    cat.setRaza(filas.getString(27));
                    cat.setRazaCruza(filas.getString(28));
                    cat.setRazaOtra(filas.getString(29));
                    cat.setSuperf(filas.getString(30));
                    cat.setObserv(filas.getString(31));
                    cat.setLongitud(filas.getString(32));
                    cat.setLatitud(filas.getString(33));
                    cat.setF1(filas.getString(34));
                    cat.setF2(filas.getString(35));
                    cat.setBandera(filas.getString(36));
                    lista.add(cat);
                } while (filas.moveToNext());
                filas.close();
                return lista;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    public boolean editarPorcino(String Folio, String bandera){
        boolean correcto = false;
        SQLiteDatabase db = this.getWritableDatabase();

        try{
            db.execSQL("UPDATE " + Porcino_bd.TABLA_BD + " SET " + Porcino_bd.COLUMN_BANDERA + " = '" + bandera + "' WHERE " + Porcino_bd.COLUMN_FOLIO + " = '" + Folio + "'");
            correcto = true;
        } catch (Exception ex){
            ex.toString();
            correcto = false;
        } finally{
            db.close();
        }
        return correcto;
    }

}
